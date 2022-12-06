package this_codingtest.greedy;

public class three_1 {
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
