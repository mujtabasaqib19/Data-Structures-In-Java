import java.util.Scanner;
public class Q2 {
    static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int last= arr.length-i-1;
            int maxindex= getMaxIndex(arr,0,last);

            swap(arr,maxindex,last);
        }
    }
    static void swap(int[] arr,int first,int second){

        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {

        int max=start;
        for (int i=start;i<=end;i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter size of array ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("enter the elements of the array ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("array before sorting ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");
        System.out.println();

        selectionSort(arr);

        System.out.print("array after sorting: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");
        System.out.println();

        scanner.close();
    }
}
