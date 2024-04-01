public class SearchIn2D {
    static void Seacrh(int[][] arr,int target){

        int temp=-1;
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){

                if (arr[i][j]==target){
                    System.out.println("Target found at Index "+i+","+j);
                    temp=0;
                    break;
                }
            }
        }
        if(temp==-1){
            System.out.println("Not found");
        }
    }
    public static void main(String[] args) {

        int[][] arr = {
                {1, 4, 5},
                {34, 5, 6, 77},
                {66,77,55},
                {12,43}
        };
        int target=66;
        Seacrh(arr,target);
    }
}