package baekjoon.basic1.data_structure1.silver4.bj10828스택;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class  Bj10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(br.readLine());

        // Stack 객체 생성.
        Stack<Integer> stack = new Stack<>();

        // 동일.
        for(int i = 0;i<n;i++) {
            String[] str = br.readLine().split(" ");
            switch (str[0]){
                case "push":
                    stack.push(Integer.parseInt(str[1]));
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    sb.append(stack.empty()?1:0).append("\n");
                    break;
                case "top":
                    sb.append(stack.empty()?-1:stack.get(stack.size()-1)).append("\n");
                    break;
                case "pop":
                    sb.append(stack.empty()?-1:stack.pop()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }

}