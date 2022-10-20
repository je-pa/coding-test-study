package programmers.kit.완전탐색.Lv1_모의고사;
//1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

import programmers.kit.완전탐색.Lv1_최소직사각형.Lv1_MinimumRectangle;

import java.util.ArrayList;
import java.util.Arrays;

public class Lv1_mockTest {
    public static void main(String[] args) {
        Lv1_mockTest test = new Lv1_mockTest();
        System.out.println(Arrays.toString(test.solution(new int[]{1,1,3,2,4,5,3,2,1,4,3})));
    }
    public int[] solution(int[] answers) { // 5점
        ArrayList<Integer> arr = new ArrayList<>();
        int[] mans = new int[3];
        int[] man2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] man3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        for(int i = 0 ; i<answers.length ; i++){
            int answer = answers[i];
            mans[0] += i%5+1 == answer ? 1 : 0;
            mans[1] += man2[i%man2.length] == answer ? 1 : 0;
            mans[2] += man3[i%man3.length] == answer ? 1 : 0;
        }
        int o = Math.max(mans[0],Math.max(mans[1],mans[2]));

        for(int i=0 ; i<3 ;i++){
            if(o == mans[i]){
                arr.add(i+1);
            }
        }

// Integer to int
//        Integer in = 1;
//        int a = in.intValue();

// Integer[] to int[]
//        Integer[] arr = {1,2,3,4,5};
//        Arrays.stream(arr).mapToInt(i -> i.intValue());

// ArrayList<Integer> to int[]
        return arr.stream().mapToInt(Integer::intValue).toArray();
//        return arr.stream().mapToInt(i->i.intValue()).toArray();
//        return Arrays.stream(arr.toArray(new Integer[arr.size()])).mapToInt(Integer::intValue).toArray();
    }
}
