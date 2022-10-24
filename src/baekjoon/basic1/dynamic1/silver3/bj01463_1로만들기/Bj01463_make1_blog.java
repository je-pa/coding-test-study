package baekjoon.basic1.dynamic1.silver3.bj01463_1로만들기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Bj01463_make1_blog {

    static Integer[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        dp = new Integer[N + 1];
        dp[0] = dp[1] = 0;

        System.out.print(recur_2(N));

    }
    static int recur(int N) {

        if (dp[N] == null) {
            // 6으로 나눠지는 경우
            if (N % 6 == 0) {
                dp[N] = Math.min(recur(N - 1), Math.min(recur(N / 3), recur(N / 2))) + 1;
            }
            // 3으로만 나눠지는 경우
            else if (N % 3 == 0) {
                dp[N] = Math.min(recur(N / 3), recur(N - 1)) + 1;
            }
            // 2로만 나눠지는 경우
            else if (N % 2 == 0) {
                dp[N] = Math.min(recur(N / 2), recur(N - 1)) + 1;
            }
            // 2와 3으로 나누어지지 않는 경우
            else {
                dp[N] = recur(N - 1) + 1;
            }
        }
        return dp[N];
    }

    // 6을 빼도 되지않을까 해서 수정 해본 코드
    static int recur_2(int N) {

        if (dp[N] == null) {
            // 3으로만 나눠지는 경우
            if (N % 3 == 0) {
                dp[N] = Math.min(recur_2(N / 3), recur_2(N - 1)) + 1;
            }
            // 2로만 나눠지는 경우
            if (N % 2 == 0) {
                dp[N] = Math.min((Math.min(recur_2(N / 2), recur_2(N - 1)) + 1), dp[N]==null?106:dp[N]);
            }
            // 2와 3으로 나누어지지 않는 경우
            if (N % 2 != 0 && N % 3 != 0) {
                dp[N] = recur_2(N - 1) + 1;
            }
        }
        return dp[N];
    }

}
