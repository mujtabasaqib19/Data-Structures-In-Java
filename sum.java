import java.util.Scanner;
public class sum {
    static int Sum(int n){
        if(n<=0){
            return n;
        }
        return n+Sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter n for sum of first n numbers ");
        int n=sc.nextInt();

        System.out.println("Sum of first "+n+" numbers is "+Sum(n));
    }
}
