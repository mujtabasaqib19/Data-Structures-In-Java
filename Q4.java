import java.util.Scanner;
public class Q4 {
    static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 32, 44, 5, 30};

        System.out.println("enter the amount you have ");
        int k = sc.nextInt();
        sc.close();

        bubbleSort(arr);

        int count = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (sum+arr[i]<=k) {
                System.out.println(arr[i]);
                sum+=arr[i];
                count++;
            } else {
                break;
            }
        }
        System.out.println("Maximum number of toys you can buy " + count);
    }
}
