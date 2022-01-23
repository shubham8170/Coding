
import java.util.*;

public class RearrangeArrayBySign {
    public static void main(String[] args) {
        int arr[] = { -1, 1 };
        int ans[] = rearrangeArray(arr);
        for (int i : ans) {
            System.out.print(i + " ");
        }

    }

    public static int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for (int i : nums) {
            if (i < 0) {
                negative.add(i);
            } else {
                positive.add(i);
            }
        }

        ArrayList<Integer> ar = new ArrayList<>();
        int ans[] = new int[nums.length];

        int looplength = nums.length / 2;
        for (int i = 0; i < looplength; i++) {
            ar.add(positive.get(i));
            ar.add(negative.get(i));
        }
        for (int i = 0; i < ar.size(); i++) {
            ans[i] = ar.get(i);
        }

        return ans;
    }

}
