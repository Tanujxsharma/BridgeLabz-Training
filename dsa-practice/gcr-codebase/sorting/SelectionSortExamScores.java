public class SelectionSortExamScores {
    public static void selectionSort(int[] scores) {
        int n = scores.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (scores[j] < scores[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element of the unsorted subarray
            int temp = scores[min_idx];
            scores[min_idx] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] examScores = {78, 92, 65, 88, 70, 95};
        System.out.println("Original Exam Scores:");
        for (int score : examScores) {
            System.out.print(score + " ");
        }

        selectionSort(examScores);

        System.out.println("\nSorted Exam Scores (ascending):");
        for (int score : examScores) {
            System.out.print(score + " ");
        }
    }
}