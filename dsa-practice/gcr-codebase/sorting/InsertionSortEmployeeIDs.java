public class InsertionSortEmployeeIDs {
    public static void insertionSort(int[] ids) {
        int n = ids.length;
        for (int i = 1; i < n; ++i) {
            int key = ids[i];
            int j = i - 1;

            // Move elements of ids[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j = j - 1;
            }
            ids[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] employeeIDs = {123, 456, 789, 101, 234, 567};
        System.out.println("Original Employee IDs:");
        for (int id : employeeIDs) {
            System.out.print(id + " ");
        }

        insertionSort(employeeIDs);

        System.out.println("\nSorted Employee IDs (ascending):");
        for (int id : employeeIDs) {
            System.out.print(id + " ");
        }
    }
}