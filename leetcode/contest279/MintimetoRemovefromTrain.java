import java.util.*;

public class MintimetoRemovefromTrain {
    public static void main(String[] args) {
        System.out.println(minimumTime("010011"));

    }

    // public static int minimumTime(String s) {
    // char arr[] = s.toCharArray();
    // int i = 0;
    // int j = s.length() - 1;
    // boolean remove[] = new boolean[s.length()];
    // int ans = 0;
    // while (i <= j) {
    // System.out.println(i + " " + j + " " + ans);
    // if (arr[i] == '1' && arr[j] == '1' && i == 0 && j == remove.length - 1) {
    // ans += 2;
    // i++;
    // j--;
    // } else if (arr[i] == '1' && i == 0) {
    // ans++;
    // remove[i] = true;
    // i++;
    // } else if (arr[i] == '1' && i != 0) {
    // if (remove[i - 1] == true) {
    // ans++;
    // i++;
    // remove[i] = true;
    // }
    // if (remove[i - 1] == false) {
    // ans += 2;
    // ;
    // i++;
    // remove[i] = true;
    // }

    // }

    // else if (arr[j] == '1' && j == arr.length - 1) {
    // ans++;
    // remove[j] = true;
    // j--;
    // } else if (arr[j] == '1' && j != arr.length - 1) {
    // if (remove[j + 1] == true) {
    // ans++;
    // j--;
    // remove[j] = true;
    // }
    // if (remove[j + 1] == false) {
    // ans += 2;
    // ;
    // j--;
    // remove[j] = true;
    // }

    // } else {
    // i++;
    // j--;
    // }

    // }

    // return ans;
    // }

    public static int minimumTime(String s) {

        Deque<Character> dq = new ArrayDeque<Character>();

        for (int i = 0; i < s.length(); i++) {
            dq.add(s.charAt(i));
        }
        boolean left = true;
        boolean right = true;
        int count = 1;
        int ans = 0;
        while (!dq.isEmpty()) {
            char f = '0',
                    l = '0';
            if (dq.size() == 0) {
                f = '0';
                l = '0';
            }
            if (dq.size() > 0) {
                f = dq.pollFirst();
                if (dq.size() > 0) {
                    l = dq.pollLast();
                } else {
                    l = '0';
                }
            }

            if (f == '1') {
                if (left == true) {
                    ans++;
                } else {
                    ans += 2;
                    left = true;
                }
            }
            if (l == '1') {
                if (right == true) {
                    ans++;
                } else {
                    ans += 2;
                    right = true;
                }
            }
            if (f != '1') {
                left = false;
            }
            if (l != '1') {
                right = false;
            }
        }
        return ans;

    }

}
