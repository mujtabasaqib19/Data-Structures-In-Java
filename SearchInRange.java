public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {23, 45, 67, 88, 95};
        int target = 88;
        int start = 1, end = 4;
        int ans = search(nums, target, start, end);
        System.out.println(ans);
    }


        //search in the array: return the index if found,
//otherwise item not found return -1;
        static int search(int[] arr,int target,int start,int end){
            if(arr.length==0)
            {
                return -1;
            }
            //run for loop
            for (int i=start;i<=end;i++){
                //check element at every index
                int element=arr[i];
                if(element==target){
                    return i;
                }
            }
            //this line will execute if none of the return statements above have executed
            //hence target not found
            return -1;
        }
}
