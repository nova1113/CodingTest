package Java;

import java.util.*;

public class HashThird {
    public static void main(String[] args) {
        String[][] clothes = {{"yellowhat", "headgear"},{"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};

        System.out.println(solution(clothes));
    }

    public static int solution(String[][] clothes){
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<>();

        for (String[] clothe : clothes) {
            if (map.containsKey(clothe[1])) {
                map.replace(clothe[1], map.get(clothe[1]) + 1);
            } else map.put(clothe[1], 1);
        }


        for(String key : map.keySet()){
            answer = answer * (map.get(key) + 1);
        }


    return (answer - 1);
    }
}
