import java.*;
public class leetcode_31 {
    public int maxSubArray(int[] nums) {
        int size = nums.length;
        int posible_min_value = Integer.MIN_VALUE, max = 0;

        for (int i = 0; i < size; i++) {
            max = max + nums[i];
            if (posible_min_value < max)
                posible_min_value = max;
            if (max < 0)
                max = 0;
        }
        return posible_min_value;
    }
}