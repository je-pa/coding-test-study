package this_codingtest.chap03_greedy.q04_1이될때까지;

import java.util.Arrays;

public class three_4 {
    public static void main(String[] args) {
        String input = "17 4";
        System.out.println(solution1(input)); //3
        System.out.println(bookAnswer(input)); //3

        String input2 = "25 5";
        System.out.println(solution1(input2)); //2
        System.out.println(bookAnswer(input2)); //3
    }

    private static int solution1(String input2) {
        int[] arr = Arrays.stream(input2.split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = arr[0];
        int K = arr[1];
        int answer = 0;
        while (true) {
            if(N < K){
                break;
            }
            if(N%K==0){
                answer++;
                N/=K;
            }else{
                int kMultiple = N/K*K;
                answer += N - kMultiple;
                N = kMultiple;
            }
        }
        return answer+N-1;
    }

    private static int bookAnswer(String input2) {
        int[] arr = Arrays.stream(input2.split(" ")).mapToInt(Integer::parseInt).toArray();
        // N, K를 공백을 기준으로 구분하여 입력 받기
        int n = arr[0];
        int k = arr[1];
        int result = 0;

        while (true) {
            // N이 K로 나누어 떨어지는 수가 될 때까지만 1씩 빼기
            int kMultiple = (n / k) * k;
            result += (n - kMultiple);
            n = kMultiple;
            // N이 K보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
            if (n < k) break;
            // K로 나누기
            result += 1;
            n /= k;
        }

        // 마지막으로 남은 수에 대하여 1씩 빼기
        return result + (n - 1);
    }
}
