//Q3 22K-4005 MUJTABA SAQIB
import java.util.Arrays;
public class Puzzle {
    public static void main(String[] args) {
        int[] puzzlePieces = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        mergeSort(puzzlePieces, 0, puzzlePieces.length);
        System.out.println(Arrays.toString(puzzlePieces));
    }

    public static void mergeSort(int[] pieces, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(pieces, start, mid);
        mergeSort(pieces, mid, end);
        merge(pieces, start, mid, end);
    }

    public static void merge(int[] pieces, int start, int mid, int end) {
        if (pieces[mid - 1] <= pieces[mid]) {
            return;
        }
        int[] temp = new int[end - start];
        int i = start, j = mid, tempIndex = 0;

        while (i < mid && j < end) {
            if (pieces[i] <= pieces[j]) {
                temp[tempIndex] = pieces[i];
                i++;
            } else {
                temp[tempIndex] = pieces[j];
                j++;
            }
            tempIndex++;
        }
        System.arraycopy(pieces, i, pieces, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, pieces, start, tempIndex);

    }
}

