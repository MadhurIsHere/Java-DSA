package LeetcodeProblems;
import java.util.*;
public class P238 {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        ans[0] = 1;
        // Calculate prefix products
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int prevSuffix = 1;
        // Calculate suffix products and update ans array
        for (int i = n - 2; i >= 0; i--) {
            prevSuffix *= nums[i + 1];
            ans[i] *= prevSuffix;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

}
