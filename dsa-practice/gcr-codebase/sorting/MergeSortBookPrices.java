public class MergeSortBookPrices {

    public static void mergeSort(double[] prices) {
        if (prices == null || prices.length <= 1) {
            return;
        }
        int mid = prices.length / 2;
        double[] left = new double[mid];
        double[] right = new double[prices.length - mid];

        System.arraycopy(prices, 0, left, 0, mid);
        System.arraycopy(prices, mid, right, 0, prices.length - mid);

        mergeSort(left);
        mergeSort(right);

        merge(prices, left, right);
    }

    private static void merge(double[] prices, double[] left, double[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                prices[k++] = left[i++];
            } else {
                prices[k++] = right[j++];
            }
        }
        while (i < left.length) {
            prices[k++] = left[i++];
        }
        while (j < right.length) {
            prices[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        double[] bookPrices = {25.50, 15.75, 30.00, 10.20, 20.00, 5.99};
        System.out.println("Original Book Prices:");
        for (double price : bookPrices) {
            System.out.print(price + " ");
        }

        mergeSort(bookPrices);

        System.out.println("\nSorted Book Prices (ascending):");
        for (double price : bookPrices) {
            System.out.print(price + " ");
        }
    }
}