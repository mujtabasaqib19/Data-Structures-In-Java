//Q5 22K-4005 MUJTABA SAQIB
public class BinaryHeap {
    private int n;
    public int max_sized_slices(int[] slices) {
        n = slices.length / 3;
        int[] nums = new int[slices.length - 1];
        System.arraycopy(slices, 1, nums, 0, nums.length);
        int a = find_max_size(nums);
        System.arraycopy(slices, 0, nums, 0, nums.length);
        int b = find_max_size(nums);
        return Math.max(a, b);
    }

    private int find_max_size(int[] nums) {
        int m = nums.length;
        int[][] f = new int[m + 1][n + 1];
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (i >= 2) {
                    f[i][j] = Math.max(f[i - 1][j], f[i - 2][j - 1] + nums[i - 1]);
                } else {
                    f[i][j] = Math.max(f[i - 1][j], nums[i - 1]);
                }
            }
        }
        return f[m][n];
    }
    public static void main(String[] args) {
        BinaryHeap bh = new BinaryHeap();
        int[] slices = {1, 2, 3, 4, 5, 6};
        int result = bh.max_sized_slices(slices);
        System.out.println("maximum size slices sum is " + result);
    }
}
