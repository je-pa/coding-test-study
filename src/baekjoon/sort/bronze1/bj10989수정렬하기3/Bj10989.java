package baekjoon.sort.bronze1.bj10989수정렬하기3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] count = new int[10_001];

        for(int i=0; i<N ; i++){
            count[Integer.parseInt(br.readLine())]++;
        }

        for(int i = 0 ; i<10_001 ; i++){
            for(int j=0; j<count[i] ; j++){
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
}
