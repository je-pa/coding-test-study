package this_codingtest.chap13_dfs_bfs.q19_연산자끼워넣기;

import java.util.*;
import java.io.*;

public class q19 {
    static int min = 1_000_000_000;
    static int max = -1_000_000_000;
    static int[] arr;
    static int[] cal;
    static int n = 0;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        cal = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); //+ - * /

        dfs(1,arr[0]);

        System.out.println(min);
        System.out.println(max);
    }

    public static void dfs(int count, int now){
        if(count == n){
            min = Math.min(now, min);
            max = Math.max(now, max);
            return;
        }
        if(cal[0]>0) {
            cal[0]-=1;
            dfs(count+1, now+arr[count]);
            cal[0]+=1;
        }
        if(cal[1]>0){
            cal[1]-=1;
            dfs(count+1, now-arr[count]);
            cal[1]+=1;
        }
        if(cal[2]>0){
            cal[2]-=1;
            dfs(count+1, now*arr[count]);
            cal[2]+=1;
        }
        if(cal[3]>0){
            cal[3]-=1;
            dfs(count+1, now/arr[count]);
            cal[3]+=1;
        }
    }
}
