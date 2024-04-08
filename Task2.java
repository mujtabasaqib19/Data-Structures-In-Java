import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number of rows ");
        int n = scanner.nextInt();
        System.out.print("enter the number of columns ");
        int m = scanner.nextInt();

        int[][] seats = new int[n][m];
        System.out.println("enter the seating arrangement (1 for occupied, 0 for vacant) ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Seat (" + i + ", " + j + "): ");
                seats[i][j] = scanner.nextInt();
                // Validate input
                while (seats[i][j] != 0 && seats[i][j] != 1) {
                    System.out.println("invalid input,enter 1 for occupied or 0 for vacant ");
                    seats[i][j] = scanner.nextInt();
                }
            }
        }
        printSeatingArrangement(seats);
        searchForVacantSeats(seats);
    }

    private static void printSeatingArrangement(int[][] seats) {
        System.out.println("seating arrangement ");
        for (int i = 0; i < seats.length; i++) {
            int[] row = seats[i];
            for (int j = 0; j < row.length; j++) {
                int seat = row[j];
                System.out.print(seat + " ");
            }
            System.out.println();
        }
    }
    private static void searchForVacantSeats(int[][] seats) {
        System.out.println("co-ordinates for consecutive three vacant seats ");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j <= seats[i].length - 3; j++) {
                if (seats[i][j] == 0 && seats[i][j + 1] == 0 && seats[i][j + 2] == 0) {
                    System.out.println("Row " + i + ", starting from column " + j);
                }
            }
        }

        for (int j = 0; j < seats[0].length; j++) {
            for (int i = 0; i <= seats.length - 3; i++) {
                if (seats[i][j] == 0 && seats[i + 1][j] == 0 && seats[i + 2][j] == 0) {
                    System.out.println("Column " + j + ", starting from row " + i);
                }
            }
        }
    }
}
