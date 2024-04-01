import java.util.Arrays;

public class Q7 {
    public static void modifiedbubblesort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,89,9056,76,45,86,109,203,87,43,23,67};
        modifiedbubblesort(arr);
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}

