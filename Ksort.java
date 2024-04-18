import java.util.Arrays;
public class Ksort {
    public static void main(String[] args) {
        int[][] sortedArrays = {
                {3, 13},
                {8, 10, 11},
                {9, 15}
        };

        int[] arr = merge_together(sortedArrays);

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    static int[] merge_together(int[][] arrays) {
        int totalSize = 0;
        for (int i = 0; i < arrays.length; i++) {
            int[] array = arrays[i];
            totalSize += array.length;
        }
        int[] result = new int[totalSize];
        int pos = 0;
        for (int i = 0; i < arrays.length; i++) {
            int[] array = arrays[i];
            for (int j = 0; j < array.length; j++) {
                int element = array[j];
                result[pos++] = element;
            }
        }
        return result;
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }

            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }
}
