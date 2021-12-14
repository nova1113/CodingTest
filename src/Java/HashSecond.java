package Java;

import java.util.*;

public class HashSecond {

    public static void main(String[] args) {

        String[] phone_book = {"119", "97674223", "1195524421"};
//        String[] phone_book = {"123","456","789"};
//        String[] phone_book = {"12","123","1235","567","88"};

        System.out.println(solution(phone_book));
    }

    public static boolean solution(String[] phone_book){
        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<>();

        for(String p : phone_book){
            map.put(p, p.length());
        }

        for(String key : map.keySet()){
            for(int i = 1; i < map.get(key) ; i++){         //중복 제거된 map.values로 for돌려 보고 싶음
                if (map.containsKey(key.substring(0, i))){
                    return false;
                }
            }
        }



        return answer;
    }
}
