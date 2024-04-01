public class Q1 {
    static void bubbleSorts(int[] arr) {
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

        int[] arr = {64,34,25,12,20};

        System.out.print("array before sorting ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        bubbleSorts(arr);

        System.out.print("array after sorting ");
        for (int i = 0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
