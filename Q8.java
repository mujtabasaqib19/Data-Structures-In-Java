import java.util.Random;
public class Q8 {
    static int bubble(int[] arr) {
        boolean swapped;
        int camparing = 0;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                camparing++;
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return camparing;
    }

    public static void main(String[] args) {
        sort_and_display_random_array(50);
        sort_and_display_random_array(100);
        sortedarray(50);
    }

    private static void sort_and_display_random_array(int n) {
        Random rand = new Random();
        int[] randint = new int[n];

        for (int i = 0; i < randint.length; i++) {
            randint[i] =1+rand.nextInt(100);
        }

        int comparisons = bubble(randint);
        System.out.println("sorted srray of "+n+" numbers ");
        for (int i=0;i<randint.length; i++) {
            int num = randint[i];
            System.out.print(num + " ");
        }
        System.out.println("\nnumber of comparisons " +comparisons);
    }

    private static void sortedarray(int n) {
        int[] sortedint = new int[n];
        for (int i = 0; i <n; i++) {
            sortedint[i] = i + 1;
        }

        int comparisons = bubble(sortedint);
        System.out.println("already sorted array of " +n +" numbers ");
        for (int i=0;i<sortedint.length; i++) {
            int num = sortedint[i];
            System.out.print(num + " ");
        }
        System.out.println("\nnumber of comparisons for already sorted array " +comparisons);
    }
}
