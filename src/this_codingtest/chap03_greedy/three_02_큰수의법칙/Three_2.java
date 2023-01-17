package this_codingtest.chap03_greedy.three_02_큰수의법칙;

import java.util.Arrays;

public class Three_2 {
    public static void main(String[] args) {
//        답 46
        String N_M_K = "5 8 3";//첫째 줄
        String nums = "2 4 5 4 6";//둘째 줄
//        답 28
        String N_M_K2 = "5 7 2";//첫째 줄
        String nums2 = "3 4 3 4 3";//둘째 줄

        Three_2 three2 = new Three_2();

        System.out.println(three2.solution(N_M_K, nums));
        System.out.println(three2.solution2(N_M_K2, nums2));
        System.out.println(three2.solution3(N_M_K, nums));
    }

    public int solution(String N_M_K, String nums){
        int[] arr = Arrays.stream(N_M_K.split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = arr[0];
        int M = arr[1];
        int K = arr[2];

        int[] numArr = Arrays.stream(nums.split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(numArr);
        int first = numArr[N-1];
        int second = numArr[N-2];

        int sum = 0;
        for(int i=0; i<M ; i++){
            for(int j=0; j<K && i<M ; j++, i++){
                sum+=first;
            }
            if(i>=M) break;
            sum+=second;
        }

        return sum;
    }

    public int solution2(String N_M_K, String nums){
        int[] arr = Arrays.stream(N_M_K.split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = arr[0];
        int M = arr[1];
        int K = arr[2];

        int[] numArr = Arrays.stream(nums.split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(numArr);
        int first = numArr[N-1];
        int second = numArr[N-2];

        int sum = 0;
        while(true){
            for(int i=0 ; i<K && M!=0 ; i++,M--){
                sum+=first;
            }
            if(M==0)break;
            sum+=second;
            M--;
        }

        return sum;
    }

    public int solution3(String N_M_K, String nums){
        int[] arr = Arrays.stream(N_M_K.split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = arr[0];
        int M = arr[1];
        int K = arr[2];

        int[] numArr = Arrays.stream(nums.split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(numArr);
        int first = numArr[N-1];
        int second = numArr[N-2];

        int sum = (first*K + second)*(M/(K+1)) + first*(M%(K+1));

        return sum;
    }
}
