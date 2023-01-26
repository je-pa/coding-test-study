package this_codingtest.chap04_구현.q01_2_시각;

public class q1_2_시각 {
    public static void main(String[] args) {
        System.out.println(solution(5));//11475
    }

    public static int solution(int n){
        int result = 0;
        for(int h=0 ; h <= n ; h++){
            for(int m=0 ; m<60 ; m++){
                for(int s=0 ; s < 60 ; s++){
//                    if(check3(h) || check3(m) || check3(s)) result++;
                    if(bookCheck(h,m,s)) result++;
                }
            }
        }
        return result;
    }
    public static boolean check3(int num){
        if(num%10 == 3 || num/10 ==3){
            return true;
        }
        return false;

    }

    // 특정한 시각 안에 '3'이 포함되어 있는지의 여부
    public static boolean bookCheck(int h, int m, int s) {
        if (h % 10 == 3
            || m / 10 == 3
            || m % 10 == 3
            || s / 10 == 3
            || s % 10 == 3)
            return true;
        return false;
    }
}
