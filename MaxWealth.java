public class MaxWealth {

    public static void wealthy(int[][] accounts){
        int sum;
        int ans=Integer.MIN_VALUE;
        for (int i=0;i<accounts.length;i++){
            sum=0;
            for (int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        System.out.println("Maximum wealth "+ans);
    }



    public static void main(String[] args) {

        int[][] accounts={
                {2,3,4},
                {3,4,6},
                {4,6,7},
        };
        wealthy(accounts);
    }
}
