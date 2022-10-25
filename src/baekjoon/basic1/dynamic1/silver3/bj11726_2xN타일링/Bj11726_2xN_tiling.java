package baekjoon.basic1.dynamic1.silver3.bj11726_2xN타일링;

import java.io.*;
import java.util.*;

public class Bj11726_2xN_tiling {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //fail(N); - 오버플로우 발생함 -> 더할때 %10007 해줘도 Max 에서 잘못되기에 불가능

        int[] dp = new int[N+2]; // dp[2]때문에 +2 해줘야한다. & dp[N]때문에 +1도 해줘야함 => 더큰 +2 로
        dp[1] = 1;
        dp[2] = 2;

        for(int i=3 ; i<=N ; i++){
            dp[i] = (dp[i-1] + dp[i-2])%10007;
        }

        System.out.println(dp[N]);//%10007 해도되고 안해도되고
    }

    static void fail(int N)throws Exception{
        int a = 1;
        int a2 = 2;

        int i = 3;
        while ( i <= N){
            if(i%2!=0){
                a=(a+a2);
            }else{
                a2=(a+a2);
            }
            System.out.println(i+" "+Math.max(a,a2)%10007);
            i++;
        }
        System.out.println(N==1?1:Math.max(a,a2));
    }
}
