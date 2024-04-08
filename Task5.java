public class Task5 {
    static void bi_directional_bubble_sort(int[] arr) {
        boolean swapped = true;
        int start = 0;
        int end = arr.length;

        while (swapped) {
            swapped = false;

            for (int i = start; i < end - 1; ++i) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }

            swapped = false;
            end--;

            for (int i = end - 1; i >= start; i--) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    swapped = true;
                }
            }
            start++;
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8, 0, 2};

        System.out.println("original array ");
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            System.out.print(value + " ");
        }
        System.out.println();

        bi_directional_bubble_sort(arr);

        System.out.println("sorted array ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
//In terms of sorting properties,
//
//Stable, Yes, the bidirectional bubble sort is stable just like the regular bubble sort because it does not change the relative order of equal elements.
//Adaptive, Yes, it can be considered adaptive to some extent because if during a pass no elements are swapped, the algorithm concludes that the list is sorted and stops early. This means it can detect an already sorted list in linear time.
//In-place, Yes, just like the regular bubble sort, it does not require extra space except for the swapping, so it is in-place.