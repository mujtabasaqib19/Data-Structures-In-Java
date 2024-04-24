public class sortheap {
    private static void min_heap(int[] arr, int n) {
        for (int i=(n/2)-1; i>=0;i--) {
            heapify(arr,n,i);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int smallest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if (left < n && arr[left] < arr[smallest])
            smallest = left;

        if (right < n && arr[right] < arr[smallest])
            smallest = right;

        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            heapify(arr, n, smallest);
        }
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        min_heap(arr, n);
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 10, 1};
        sort(arr);
        System.out.println("sorted array in decreasing order ");
        for (int i=0;i<arr.length;i++) {
            int value = arr[i];
            System.out.print(value+" ");
        }
    }
}
