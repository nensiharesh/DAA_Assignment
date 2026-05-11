public class question_04{

    static void lcs(String name, String s2) {
        String s1 = name.toUpperCase();
        s2 = s2.toUpperCase();
        int m = s1.length(), n = s2.length();

        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        StringBuilder lcsStr = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcsStr.insert(0, s1.charAt(i - 1));
                i--; j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        System.out.println("  Q4: LONGEST COMMON SUBSEQUENCE (Dynamic Programming)");
        System.out.println("\n  String 1 : " + s1);
        System.out.println("  String 2   : " + s2);

        System.out.println("\n  LCS Length : " + dp[m][n]);
        System.out.println("  LCS String : " + lcsStr);
    }

    public static void main(String[] args) {
        String YOUR_NAME = "Nensi Kumari";

        lcs(YOUR_NAME, "ETAOINSHR");
    }
}