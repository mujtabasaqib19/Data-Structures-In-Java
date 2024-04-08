public class Task1 {

    public static void Inversion(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    System.out.println("("+arr[i]+","+arr[j]+") is an inversion because "+arr[i]+">"+arr[j]);
                    count += 1;
                }
            }
        }
        System.out.println("Total number of inversion "+count);
    }
    public static void main (String[]args){
            int[] arr = {5, 3, 9, 1, 7 ,6};

            Inversion(arr);
        }
    }
