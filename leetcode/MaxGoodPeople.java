public class MaxGoodPeople {
    public static void main(String[] args) {

        int arr[][] = { { 2, 1, 2 }, { 1, 2, 2 }, { 2, 0, 2 } };
        int ans = maximumGood(arr);
        System.out.println(ans);

    }

    public static int maximumGood(int[][] statements) {
        int m = statements.length;
        int n = statements[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (statements[i][j] == 1) {
                        count++;
                    }
                }
            }
        }
        if (count == 0) {
            return 1;
        } else {
            return count;
        }
    }

}

// Will Not work this problem can be solve by graph
