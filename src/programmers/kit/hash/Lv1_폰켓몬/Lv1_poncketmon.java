package programmers.kit.hash.Lv1_폰켓몬;
import java.util.*;
import java.util.stream.*;

public class Lv1_poncketmon {
    public int solution(int[] nums) {//1점..
        int answer = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : nums){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        int length2 = nums.length/2;
        return length2 < hm.size() ? length2 : hm.size();
    }

    public int solution2(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.toSet(),
                        phonekemons -> Integer.min(phonekemons.size(), nums.length / 2)));
    }

    public int solution3(int[] nums) {
        //1. 기존 length를 구한다.
        //2. 중복값을 제거한 length를 구한다.
        //3. 두 값중 최소값이 정답.
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }

        return nums.length/2 > list.size()?list.size():nums.length/2;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,3,3,2,2,2};
        System.out.println(new Lv1_poncketmon().solution(nums));
    }
}
