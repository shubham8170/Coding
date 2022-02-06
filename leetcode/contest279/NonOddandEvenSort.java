import java.util.*;

/**
 * NonOddandEvenSort
 */
public class NonOddandEvenSort {

    public static void main(String[] args) {
        int arr[] = { 2, 1 };
        int ans[] = sortEvenOdd(arr);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    public static int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        Collections.reverse(odd);
        int evenindex = 0;
        int oddindex = 0;
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                ans[i] = even.get(evenindex++);
            } else {
                ans[i] = odd.get(oddindex++);
            }
        }
        return ans;

    }
}