public class Q3 {
    static void insertionSort(int arr[]) {

        for (int i=0; i<arr.length-1;i++) {
            for (int j=i+1;j>0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swapping(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }
    static void swapping(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {

        int arr[] = {12, 11, 13, 5, 6};
        int n = arr.length;

        System.out.println("array before sorting ");
        for (int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
            System.out.println();
        }

        insertionSort(arr);

        System.out.println("sorted array ");
        for (int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}

