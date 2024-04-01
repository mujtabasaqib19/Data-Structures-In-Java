import java.util.Scanner;

public class sumofdigits {
    static int digits(int n){
        if (n<=1){
            return n;
        }
        return (n%10)+digits(n/10);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter digit ");
        int n=sc.nextInt();

        System.out.println("sum of "+n+" is "+digits(n));
    }
}
