package LeetcodeProblems;

public class P55 {
    public static void main(String[] args) {
        int[][] testCases = {
                {2, 3, 1, 1, 4},  // Expected: true
                {3, 2, 1, 0, 4},  // Expected: false
                {0},              // Expected: true
                {1, 0},           // Expected: true
                {2, 0, 0},        // Expected: true
                {1, 1, 1, 1, 1},  // Expected: true
                {5, 4, 3, 2, 1, 0, 0}, // Expected: true
                {1, 1, 1, 0, 1},  // Expected: false
                {2, 0, 1, 0, 1},  // Expected: false
                {2, 3, 1, 1, 0, 4}, // Expected: false
        };

        for (int i = 0; i < testCases.length; i++) {
            boolean result = canJump(testCases[i]);
            System.out.println("Test Case " + (i + 1) + ": " + result);
        }
    }
    public static boolean canJump(int[] nums) {
        int maxlength=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>maxlength)
                return false;
            maxlength=Math.max(maxlength,i+nums[i]);
            if(maxlength>=nums.length-1)
                return true;
        }
        return true;
    }
}
