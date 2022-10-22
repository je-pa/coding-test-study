package programmers.kit.hash.Lv2_전화번호목록;
import java.util.*;
import java.util.HashMap;

public class Lv2_ListOfPhoneNumber {
    public boolean solution(String[] phone_book) {//10
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++)
            map.put(phone_book[i], i);

        // 모든 전화번호의 substring이 HashMap에 존재하는지 확인한다.
        for (int i = 0; i < phone_book.length; i++){
            for (int j = 1; j < phone_book[i].length(); j++){
                if (map.containsKey(phone_book[i].substring(0, j)))
                    return false;
            }
        }
        // 1단어 abcd
        // map.containsKey(phone_book[i].substring(0, 1))
        // map.containsKey("a");
        //
        // map.containsKey(phone_book[i].substring(0, 2))
        // map.containsKey("ab");
        // ...

        return true;
    }
    public boolean solution1(String[] phone_book) {
        // 1. phoneBook을 sorting한다.
        Arrays.sort(phone_book);

        // 2. 1중 Loop을 돌며 앞 번호가 뒷 번호의 접두어인지 확인한다.
        for (int i = 0; i < phone_book.length - 1; i++)
            if (phone_book[i + 1].startsWith(phone_book[i])){
                return false;
            }

        // 3. 여기까지 오면 접두어가 없다는 것이다.
        return true;
    }

    public static void main(String[] args) {
        String[] strArr = new String[]{};
        System.out.println(new Lv2_ListOfPhoneNumber().solution(strArr));
    }
}
