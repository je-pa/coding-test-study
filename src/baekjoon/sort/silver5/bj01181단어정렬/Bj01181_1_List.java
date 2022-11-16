package baekjoon.sort.silver5.bj01181단어정렬;
import java.util.*;
import java.io.*;

public class Bj01181_1_List {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());
        List<String> strList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            strList.add(br.readLine());
        }
        MyCompartor myCompartor = new MyCompartor();
        Collections.sort(strList,myCompartor);

        for(int i=0 ; i<strList.size() ; i++){
            if(!(i>0 && strList.get(i).equals(strList.get(i-1)))){
                sb.append(strList.get(i)).append("\n");
            }
        }
        System.out.println(sb);
    }
    public static class MyCompartor implements Comparator<String>{

        @Override
        public int compare(String str1, String str2) {
            if(str1.length() < str2.length()){ // 길이가 짧은 단어 먼저
                return -1;
            }else if(str1.length() > str2.length()){
                return 1;
            }else{
                return str1.compareTo(str2);
            }
        }
    }

}
