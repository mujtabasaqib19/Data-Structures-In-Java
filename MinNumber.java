public class MinNumber {

    static void Findminimum(int[] arr){
        int a=arr[0];

        for (int i=0;i< arr.length;i++){
            if(arr[i]<a){
                a=arr[i];
            }
        }
        System.out.println("Lowest Number in array is "+a);
    }
    public static void main(String[] args) {
        int[] nums = {55, 45, 67, 88, 95};

        Findminimum(nums);
    }
}
