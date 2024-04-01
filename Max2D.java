public class Max2D {
    static void Max(int[][] arr){

        int b=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){

                if (arr[i][j]>b){
                    b=arr[i][j];
                }
            }
        }
        System.out.println("Maximum in array is "+b);
    }
    public static void main(String[] args) {

        int[][] arr = {
                {1, 4, 5},
                {34, 5, 6, 77},
                {66,98,55},
                {12,43}
        };
        Max(arr);
    }
}