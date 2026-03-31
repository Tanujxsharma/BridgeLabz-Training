public class BubbleSortStudentMarks {
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (marks[j] > marks[j+1]) {
                    // Swap marks[j] and marks[j+1]
                    int temp = marks[j];
                    marks[j] = marks[j+1];
                    marks[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] studentMarks = {85, 90, 75, 60, 95, 80};
        System.out.println("Original marks:");
        for (int mark : studentMarks) {
            System.out.print(mark + " ");
        }

        bubbleSort(studentMarks);

        System.out.println("\nSorted marks (ascending):");
        for (int mark : studentMarks) {
            System.out.print(mark + " ");
        }
    }
}