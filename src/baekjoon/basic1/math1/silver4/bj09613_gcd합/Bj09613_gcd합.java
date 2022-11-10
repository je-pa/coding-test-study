package baekjoon.basic1.math1.silver4.bj09613_gcd합;
import java.util.*;
import java.io.*;
public class Bj09613_gcd합 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for(int i=0 ; i<N ; i++){
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int len = arr[0];
            long sum = 0; //long 주의
            for(int x=1; x<len ; x++){ //x는 len까지 y는 len+1까지 주의
                for(int y=x+1 ; y<=len ; y++){ // y는 x+1부터 주의
                    sum+=gcd(arr[x], arr[y]);
                }
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
    static int gcd(int x, int y){
        if(x == 0) return y;
        return gcd(y%x, x);
    }
}
