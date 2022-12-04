package baekjoon.basic1.data_structure1.silver4.bj01158_요세푸스문제;

import java.util.*;
import java.io.*;
public class Bj01158_Queue {
    public static void main(String[] args) throws Exception{
        Queue<Integer> queue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);

        for(int i=1 ; i<=N ; i++){
            queue.add(i);
        }
        if(!queue.isEmpty()){ //N은 1보다 크거나 같기 때문에 안해주어도 되긴한다.
            for(int i = 1 ; i< K ; i++){
                queue.add(queue.remove());
            }
        }
        StringBuilder sb = new StringBuilder("<").append(queue.remove());

        while(!queue.isEmpty()){
            for(int i = 1 ; i< K ; i++){
                queue.add(queue.remove());
            }
            sb.append(", ").append(queue.remove());
        }
        sb.append(">");
        System.out.println(sb);
    }
}
