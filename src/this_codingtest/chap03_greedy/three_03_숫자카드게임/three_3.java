package this_codingtest.chap03_greedy.three_03_숫자카드게임;

import java.util.Arrays;

public class three_3 {
    public static void main(String[] args) {
        String input = "3 3\n" + //N,M
                        "3 1 2\n" +
                        "4 1 4\n" +
                        "2 2 2\n";
        System.out.println(solution1(input)); //2

        String input2 = "2 4\n" + //N,M
                "7 3 1 8\n" +
                "3 3 3 4\n";
        System.out.println(solution1(input2)); //3
    }
    public static int solution1(String str){
        String[] arr = str.split("\n");
        int[] N_M = Arrays.stream(arr[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = N_M[0];
//        int M = N_M[1];
        int answer = 0;
        for(int i=1 ; i<=N ; i++){
            int[] nums = Arrays.stream(arr[i].split(" ")).mapToInt(Integer::parseInt).toArray();
            int min = 10000;
            for(int n : nums){
                if(n < min){
                    min = n;
                }
            }
            if(answer < min){
                answer = min;
            }
        }
        return answer;
    }
}
