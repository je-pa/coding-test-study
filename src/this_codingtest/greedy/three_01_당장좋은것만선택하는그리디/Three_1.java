package this_codingtest.greedy.three_01_당장좋은것만선택하는그리디;

public class Three_1 {
    public static void main(String[] args) {
        int n =1260;
        int count = 0;
        int[] coins = {500, 100, 50, 10};

        for(int coin : coins){
            count+=n/coin;
            n%=coin;
        }
        System.out.println(count);

    }
}
