import java.util.*;

public class StrictlyGreaterandSmaller {

    public static void main(String[] args) {

    }

    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int count = 0;
        int max = nums[nums.length - 1];
        for (int i : nums) {
            if (i == min || i == max) {
                count++;
            }
        }
        return nums.length - count;

    }
}