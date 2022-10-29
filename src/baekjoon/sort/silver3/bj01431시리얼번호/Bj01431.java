package baekjoon.sort.silver3.bj01431시리얼번호;
import java.util.*;
import java.io.*;
public class Bj01431 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());
        String[] strArr = new String[N];
        for(int i=0; i<N ; i++){
            strArr[i] = br.readLine();
        }
        Arrays.sort(strArr, new Comparator<String>(){
            public int compare(String str, String str2){
                if(str.length() != str2.length()){
                    return str.length() - str2.length();
                }else{
                    int n1=0, n2=0;
                    for(int i=0 ; i<str.length(); i++){
                        char c1 = str.charAt(i);
                        if(c1>'0' && c1<='9'){
                            n1+= c1-'0';
                        }
                        char c2 = str2.charAt(i);
                        if(c2>'0' && c2<='9'){
                            n2+= c2-'0';
                        }
                    }
                    if(n1!=n2){
                        return n1 - n2;
                    }else{
                        return str.compareTo(str2);
                    }
                }
            }
        });

        for(String s : strArr){
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}
