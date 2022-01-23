import java.util.*;

public class FindLonelyNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 3 };
        findLonely(arr);

    }

    public static List<Integer> findLonely(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }

            else {
                map.put(nums[i], 1);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i] + 1) && !map.containsKey(nums[i] - 1)) {
                if (map.get(nums[i]) == 1) {
                    ans.add(nums[i]);
                }

            }
        }
        System.out.println(ans);
        return ans;
    }

}
