public class find_minmax_heap {
    public static void heap(int[] arr) {
        boolean minheap = true;
        boolean maxheap = true;
        int n = arr.length;

        for (int i = 0; i <= (n - 2) / 2; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if ((left<n && arr[i]<arr[left]) || (right<n && arr[i]<arr[right])) {
                maxheap = false;
            }

            if ((left<n && arr[i]>arr[left]) || (right<n && arr[i]>arr[right])) {
                minheap = false;
            }
        }

        if (maxheap) {
            System.out.println("the array is a max heap");
        } else if (minheap) {
            System.out.println("the array is a min heap");
        } else {
            System.out.println("the array is not a heap");
        }
    }

    public static void main(String[] args) {
        int[] arr = {20,14,12,11,4,5,2,1};
        heap(arr);
    }
}
