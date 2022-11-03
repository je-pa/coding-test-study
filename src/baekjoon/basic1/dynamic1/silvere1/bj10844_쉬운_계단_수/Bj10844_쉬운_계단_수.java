package baekjoon.basic1.dynamic1.silvere1.bj10844_쉬운_계단_수;
import java.io.*;
import java.util.*;
public class Bj10844_쉬운_계단_수 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d = 1_000_000_000;
        int N = Integer.parseInt(br.readLine());

        long[][] arr = new long[N+1][10];

        arr[1]=new long[]{0,1,1,1,1,1,1,1,1,1};

        for(int i = 2 ; i<N+1 ; i++){
            arr[i][0]=arr[i-1][1];
            for(int j=1 ; j<9 ; j++){
                arr[i][j]=(arr[i-1][j-1] + arr[i-1][j+1]) % d;
            }
            arr[i][9]= arr[i-1][8];
        }
        long result =0;
        for(int i=0 ; i<10 ; i++){
            result = (result + arr[N][i]) % d;
        }
        System.out.println(result);
    }
}
