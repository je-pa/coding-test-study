package baekjoon.basic1.data_structure1.bronze1.bj09093단어뒤집기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bj09093_3_stack_charArr {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();

        for(int i=0 ; i<N ; i++){
            String sentence = br.readLine()+" ";
            char[] strArr = sentence.toCharArray();
            for(char c : strArr){
                if(c==' '){
                    while(!stack.empty()){
                        sb.append(stack.pop());
                    }
                    sb.append(" ");
                }else{
                    stack.push(c);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
