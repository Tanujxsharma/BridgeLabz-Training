public class HeightOfFootballTeam {
    
    public static void main(String[] args) {
        int[] heights = new int[11];
        
        // Generate random heights between 150 and 250 cms
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + (int)(Math.random() * (250 - 150 + 1));
        }
        
        // Display all heights
        System.out.println("Heights of football team players:");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println("\n");   
        
        // Calculate and display results
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        
        System.out.println("Sum of all heights: " + sum + " cms");
        System.out.println("Mean height: " + mean + " cms");
        System.out.println("Shortest height: " + shortest + " cms");
        System.out.println("Tallest height: " + tallest + " cms");
    }
    
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    
    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }
    
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }
    
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
}