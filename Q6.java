public class Q6
{
    static void bubbleSort(int[] scores, int len) {
        for (int i = 0; i<len-1; i++) {
            for (int j = 0; j<len-i-1; j++) {
                if (scores[j] < scores[j+1]) {
                    int temp = scores[j];
                    scores[j] = scores[j+1];
                    scores[j+1] = temp;
                }
            }
        }

        System.out.println("Printing through bubble sort");
        for (int i = 0; i<len; i++){
            System.out.println(scores[i]);
        }
    }

    static void swapping(int[] scores, int a, int b) {
        int temp = scores[a];
        scores[a] = scores[b];
        scores[b] = temp;
    }
    static void SelectionSort(int[] scores, int len) {
        int  imin;
        for (int i=0;i<len-1;i++) {
            imin = i;
            for (int j =i+1; j<len; j++)
                if (scores[j] > scores[imin])
                    imin = j;

            swapping(scores,i,imin);
        }

        System.out.println("Printing through selection sort");
        for (int i = 0; i<len; i++) {
            System.out.println(scores[i]);
        }
    }

    static void insertionSort(int scores[], int len) {
        int key, j;
        for (int i=1;i<len;i++) {
            key = scores[i];
            j=i-1;

            while (j>=0 && scores[j]<key) {
                scores[j+1] = scores[j];
                j=j-1;
            }
            scores[j + 1] = key;
        }

        System.out.println("Printing through insertion sort");
        for (int i = 0; i<len; i++) {
            System.out.println(scores[i]);
        }
    }

    public static void main(String[] args) {
        int []scores = {197,98,101,189,90,202};

        int len = scores.length;

        System.out.println("Printing scores");
        for (int i = 0; i<len; i++) {
            System.out.println(scores[i]);
        }

        bubbleSort(scores, len);
        SelectionSort(scores, len);
        insertionSort(scores, len);
    }
}
