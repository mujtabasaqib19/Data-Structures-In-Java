import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr=new int[10];
        System.out.println("Enter 10 numbers ");
        for (int i = 0; i < 10; i++) {
            int num=sc.nextInt();
            arr[i]=num;
        }
        for (int i = 0; i < 10; i++) {
            if(arr[i]%2==0){
                System.out.println("it is even number "+arr[i]);
            }
            else {
                System.out.println("It is odd number "+arr[i]);
            }
        }

    }
}
