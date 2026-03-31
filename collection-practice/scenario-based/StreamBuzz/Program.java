import java.util.*;

public class Program {

    // Register creator
    public void RegisterCreator(CreatorStats record) {
        CreatorStats.EngagementBoard.add(record);
    }

    // Get top post counts
    public Dictionary<String, Integer> GetTopPostCounts(List<CreatorStats> records, double likeThreshold) {

        Dictionary<String, Integer> result = new Hashtable<>();

        for (CreatorStats creator : records) {
            int count = 0;

            for (double likes : creator.WeeklyLikes) {
                if (likes >= likeThreshold) {
                    count++;
                }
            }

            if (count > 0) {
                result.put(creator.CreatorName, count);
            }
        }
        return result;
    }

    // Calculate average likes
    public double CalculateAverageLikes() {

        double sum = 0;
        int totalWeeks = 0;

        for (CreatorStats creator : CreatorStats.EngagementBoard) {
            for (double likes : creator.WeeklyLikes) {
                sum += likes;
                totalWeeks++;
            }
        }

        if (totalWeeks == 0)
            return 0;

        return sum / totalWeeks;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Program program = new Program();
        boolean running = true;

        while (running) {

            System.out.println("1. Register Creator");
            System.out.println("2. Show Top Posts");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.println("Enter Creator Name:");
                    String name = sc.nextLine();

                    double[] likes = new double[4];
                    System.out.println("Enter weekly likes (Week 1 to 4):");

                    for (int i = 0; i < 4; i++) {
                        likes[i] = sc.nextDouble();
                    }

                    CreatorStats creator = new CreatorStats(name, likes);
                    program.RegisterCreator(creator);

                    System.out.println("Creator registered successfully");
                    break;

                case 2:
                    System.out.println("Enter like threshold:");
                    double threshold = sc.nextDouble();

                    Dictionary<String, Integer> result =
                            program.GetTopPostCounts(CreatorStats.EngagementBoard, threshold);

                    if (result.isEmpty()) {
                        System.out.println("No top-performing posts this week");
                    } else {
                        Enumeration<String> keys = result.keys();
                        while (keys.hasMoreElements()) {
                            String key = keys.nextElement();
                            System.out.println(key + " - " + result.get(key));
                        }
                    }
                    break;

                case 3:
                    double avg = program.CalculateAverageLikes();
                    System.out.println("Overall average weekly likes: " + (int) avg);
                    break;

                case 4:
                    System.out.println("Logging off - Keep Creating with StreamBuzz!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
