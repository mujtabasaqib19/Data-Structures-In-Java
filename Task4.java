public class Task4 {
    static void adaptiveSelectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);

            if(maxIndex != last){
                swap(arr, maxIndex, last);
            }
        }
    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {

        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {12, 19, 55, 2, 16};

        System.out.print("array before sorting ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        adaptiveSelectionSort(arr);

        System.out.print("array after sorting ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
