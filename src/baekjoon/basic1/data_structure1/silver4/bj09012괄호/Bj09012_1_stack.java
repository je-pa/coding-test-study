package baekjoon.basic1.data_structure1.silver4.bj09012괄호;
import java.util.*;
import java.io.*;

public class Bj09012_1_stack {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());

        for(int i=0 ; i<N; i++){
            char[] chars = br.readLine().toCharArray();
            Stack<Character> stack = new Stack<>();
            boolean check = false;
            for(char c : chars){
                if(c=='('){
                    stack.push(c);
                }else{
                    if(stack.empty()){
                        check = true;
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }
            sb.append(stack.empty() && !check ?"YES":"NO").append("\n");
        }
        System.out.println(sb);
    }
}
