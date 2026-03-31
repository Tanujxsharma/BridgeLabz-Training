public class QuickSortProductPrices {

    public static void quickSort(double[] prices, int low, int high) {
        if (low < high) {
            int pi = partition(prices, low, high);
            quickSort(prices, low, pi - 1);
            quickSort(prices, pi + 1, high);
        }
    }

    private static int partition(double[] prices, int low, int high) {
        double pivot = prices[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (prices[j] <= pivot) {
                i++;
                // swap prices[i] and prices[j]
                double temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }
        // swap prices[i+1] and prices[high] (or pivot)
        double temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        double[] productPrices = {19.99, 5.50, 12.00, 3.75, 25.00, 8.99};
        System.out.println("Original Product Prices:");
        for (double price : productPrices) {
            System.out.print(price + " ");
        }

        quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("\nSorted Product Prices (ascending):");
        for (double price : productPrices) {
            System.out.print(price + " ");
        }
    }
}