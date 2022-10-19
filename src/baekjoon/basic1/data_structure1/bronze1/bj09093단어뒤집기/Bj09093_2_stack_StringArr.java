package baekjoon.basic1.data_structure1.bronze1.bj09093단어뒤집기;

import java.io.*;
import java.util.*;

public class Bj09093_2_stack_StringArr {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();

        for(int i=0 ; i<N ; i++){
            String sentence = br.readLine()+" ";
            String[] strArr = sentence.split("");
            for(String str : strArr){
                if(str.equals(" ")){
                    while(!stack.empty()){
                        bw.write(stack.pop());
                    }
                    bw.write(" ");
                }else{
                    stack.push(str);
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
