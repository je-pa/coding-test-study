package baekjoon.basic1.data_structure1.bronze1.bj09093단어뒤집기;
import java.io.*;
import java.util.*;

public class Bj09093 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());

        for(int i=0 ; i<N ; i++){
            String[] wordArr = br.readLine().split(" ");
            for(String word : wordArr){
                String[] wordSplit = word.split("");
                for(int j=wordSplit.length-1 ; j>=0 ; j--){
                    sb.append(wordSplit[j]);
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
