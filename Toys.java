import java.util.Scanner;
public class Toys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] prices = {1, 32, 44, 5, 30};

        System.out.println("enter the amount you have ");
        int k = sc.nextInt();
        sc.close();

        mergeSort(prices, 0, prices.length);

        int count = 0;
        int sum = 0;

        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            if (sum + price <= k) {
                sum += price;
                count++;
            } else {
                break;
            }
        }

        System.out.println("maximum number of toys you can buy " +count);
    }
    static void mergeSort(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }
}
