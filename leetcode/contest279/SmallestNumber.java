import java.util.*;

public class SmallestNumber {
    public static void main(String[] args) {
        long ans = smallestNumber(95005);
        System.out.println(ans);

    }

    public static long smallestNumber(long num) {
        long ans = 0;
        long number = num;
        if (num < 0) {
            number = num * -1;
        }
        char[] arrayOfNum = String.valueOf(number).toCharArray();
        Arrays.sort(arrayOfNum);
        for (char i : arrayOfNum) {
            System.out.print(i + " ");
        }
        if (num > 0) {
            if (arrayOfNum[0] != '0') {
                String a = String.valueOf(arrayOfNum);
                ans = Long.parseLong(a);
            } else {
                int count = 0;
                for (char i : arrayOfNum) {
                    if (i == '0')
                        count++;
                }
                char[] decending = new char[arrayOfNum.length];
                decending[0] = arrayOfNum[count];
                ArrayList<Character> de = new ArrayList<>();
                de.add(arrayOfNum[count]);
                if (count > 0) {
                    for (int i = 0; i < count; i++) {
                        de.add('0');
                    }
                }
                if (arrayOfNum.length > count) {
                    for (int i = count + 1; i < arrayOfNum.length; i++) {
                        de.add(arrayOfNum[i]);
                    }
                }

                Object[] objects = de.toArray();

                char slice[] = new char[de.size()];
                for (int i = 0; i < de.size(); i++) {
                    slice[i] = de.get(i);
                }

                String a = String.valueOf(slice);
                ans = Long.parseLong(a);

            }
        }
        if (num < 0) {
            char[] decending = new char[arrayOfNum.length];
            int index = 0;
            for (int i = arrayOfNum.length - 1; i >= 0; i--) {
                decending[index++] = arrayOfNum[i];
            }
            String a = String.valueOf(decending);
            ans = Long.parseLong(a) * -1;

        }

        return ans;
    }
}
