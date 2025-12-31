public class CountingSortStudentAges {

    public static void countingSort(int[] ages, int minAge, int maxAge) {
        int range = maxAge - minAge + 1;
        int[] count = new int[range];
        int[] output = new int[ages.length];

        // Store count of each character
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Change count[i] so that count[i] now contains actual
        // position of this character in output array
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i] - minAge] - 1] = ages[i];
            count[ages[i] - minAge]--;
        }

        // Copy the output array to ages[], so that ages[] now
        // contains sorted characters
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] studentAges = {12, 10, 15, 18, 13, 10, 12, 16};
        int minAge = 10;
        int maxAge = 18;

        System.out.println("Original Student Ages:");
        for (int age : studentAges) {
            System.out.print(age + " ");
        }

        countingSort(studentAges, minAge, maxAge);

        System.out.println("\nSorted Student Ages (ascending):");
        for (int age : studentAges) {
            System.out.print(age + " ");
        }
    }
}