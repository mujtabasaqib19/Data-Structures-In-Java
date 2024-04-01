import java.util.Scanner;

public class Q5 {
    static void insertionSorts(int arr[],int n) {

        for (int i=0; i<n-1;i++) {
            for (int j=i+1;j>0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swappings(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }
    static void swappings(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter number of containers");
        int n = scanner.nextInt();

        int[] con = new int[n];

        System.out.println("enter the elements of the array ");
        for (int i = 0; i < n; i++) {
            con[i] = scanner.nextInt();
        }

        insertionSorts(con, n);

        System.out.println("Printing containers in order");
        for (int i = 0; i<n; i++) {
            System.out.println(con[i]);
        }
    }
}
