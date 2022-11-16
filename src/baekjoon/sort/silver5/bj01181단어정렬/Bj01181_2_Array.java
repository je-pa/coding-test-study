package baekjoon.sort.silver5.bj01181단어정렬;
import java.util.*;
import java.io.*;

public class Bj01181_2_Array {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());
        String[] strArr = new String[N];
        for(int i=0; i<N ; i++){
            strArr[i] = br.readLine();
        }

        Arrays.sort(strArr , new Comparator<String>(){
           public int compare(String str, String str2){
               if(str.length() == str2.length()){
                   return str.compareTo(str2);
               }else{
                   return str.length() - str2.length();
               }
           }
        });

        for(int i =0 ; i<N ; i++){
            if(!(i>0 && strArr[i].equals(strArr[i-1]))){
                sb.append(strArr[i]).append("\n");
            }
        }
        System.out.println(sb);
    }
}
