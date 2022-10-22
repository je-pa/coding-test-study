package programmers.kit.hash.Lv1_완주하지못한선수;
import java.util.*;

public class Lv1_marathon {// 5점
    public static void main(String[] args) {
        String[] participant = new String[]{"leo", "kiki", "eden"};
        String[] completion = new String[]{"eden", "kiki"};

        Lv1_marathon hash = new Lv1_marathon();

        System.out.println(hash.solution(participant, completion));
    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        // HashMap에 Participant를 전부 추가 - Count Table 역할
        // HashMap.put(Key,Value) : Hash Map에 Key와 Value를 한 쌍으로 입력하는 함수
        // HashMap.getOrDefault('B', 0)
        // 'B'라는 Key에 해당하는 Value가 있으면 가져오고, 아닐 경우 0을 Default로 지정하여 사용하겠다는 의미의 함수
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        // 완주한 사람들은 Value를 1씩 빼는 동작
        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }


//        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();

//        while(iter.hasNext()){
//            Map.Entry<String, Integer> entry = iter.next();
//            if (entry.getValue() != 0){
//                answer = entry.getKey();
//                break;
//            }
//        }

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() != 0){
                answer = entry.getKey();
                break;
            }
        }

//        for (String key : map.keySet()) {
//            if (map.get(key) != 0){
//                answer = key;
//            }
//        }
        return answer;
    }
}
