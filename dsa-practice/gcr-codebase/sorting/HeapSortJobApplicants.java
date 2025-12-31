public class HeapSortJobApplicants {

    public static void heapSort(double[] salaries) {
        int n = salaries.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(salaries, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            double temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // call max heapify on the reduced heap
            heapify(salaries, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in salaries[]. n is size of heap
    private static void heapify(double[] salaries, int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && salaries[l] > salaries[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && salaries[r] > salaries[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            double swap = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(salaries, n, largest);
        }
    }

    public static void main(String[] args) {
        double[] salaryDemands = {75000.00, 50000.00, 120000.00, 60000.00, 90000.00};
        System.out.println("Original Salary Demands:");
        for (double salary : salaryDemands) {
            System.out.print(salary + " ");
        }

        heapSort(salaryDemands);

        System.out.println("\nSorted Salary Demands (ascending):");
        for (double salary : salaryDemands) {
            System.out.print(salary + " ");
        }
    }
}