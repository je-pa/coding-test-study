package baekjoon.sort.bronze2.bj02750수_정렬하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj02750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i=0 ; i<N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for(int val : arr){
            sb.append(val).append("\n");
        }
        System.out.println(sb);
    }
}
