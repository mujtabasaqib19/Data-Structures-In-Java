 import java.util.Scanner;
public class Interpolation_Search {
    static void interpolationSearch(int[] arr, int n, int key) {
        int low = 0, high = n - 1;
        boolean flag = true;

        while (low <= high && key >= arr[low] && key <= arr[high]) {
            if (low == high) {
                System.out.println("Element found at position " + low);
                flag = false;
            }

            int pos = low + ((key - arr[low]) * (high - low)) / (arr[high] - arr[low]);
            System.out.println("Low value is " + low + " High value is " + high + " Position calculated is " + pos);

            if (arr[pos] == key) {
                System.out.println("Element found at position " + pos);
                flag = false;
            }

            if (arr[pos] < key) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }

        if (flag) {
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 20;
        int[] arr = {0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95};

        System.out.println("Enter the element to be searched");
        int x = scanner.nextInt();

        interpolationSearch(arr, n, x);

        scanner.close();
    }
}