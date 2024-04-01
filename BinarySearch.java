public class BinarySearch {
    static int binarysearch(int[] arr,int target){

        int start=0;
        int end=arr.length-1;

        while(start<=end){
            //find middle element,
            // int mid=(start+end)/2 might be possible exceed the range of java;
            int mid=start+(end-start)/2;

            if (target<arr[mid]) {
                end = mid-1;
            }
            else if (target>arr[mid]){
                start=mid+1;
                }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={23,33,44,55,66,77,88,89,99,101,124};
        int target=124;

        int ans=binarysearch(arr,target);
        System.out.println(ans);
    }
}
