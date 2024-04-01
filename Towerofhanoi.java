import java.util.Scanner;
public class Towerofhanoi {
    static int moves = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of disks ");
        int numberOfDisks = sc.nextInt();
        toh(numberOfDisks, "a", "b", "c");
        System.out.println("total moves " + moves);
    }
    public static void toh(int numberOfDisks, String start, String aux, String destination) {
        if (numberOfDisks == 1) {
            System.out.println("move " +start+ " to " +destination);
            moves++;
        } else {
            toh(numberOfDisks-1,start,destination,aux);
            System.out.println("move "+start+" to "+destination);
            moves++;
            toh(numberOfDisks - 1,aux,start,destination);
        }
    }
}
