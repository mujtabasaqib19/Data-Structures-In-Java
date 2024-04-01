import java.util.Scanner;
public class Fibonacci {
    static void fibonacci(int n,int[] arr) {
        arr[0] = 0;
        if (n > 1) {
            arr[1] = 1;
            for (int i=2; i<n;i++) {
                arr[i] = arr[i-1] + arr[i-2];
            }
        }
    }
    static void display(int n, int[] arr) {
        for (int i = n-1; i>= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        fibonacci(n,arr);
        System.out.print("in reverse ");
        display(n,arr);
    }
}
