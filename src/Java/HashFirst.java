package Java;

import java.util.HashMap;

public class HashFirst {

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(solution(participant, completion));
    }

    public static String solution(String[] participant, String[] completion){
        String answer = "";

        HashMap<String, Integer> map = new HashMap();

        for (String p : participant) {
            int i = 1;
            if (map.containsKey(p)){
                i = map.get(p);
                i++;
            }
            map.put(p, i);
        }

        for(String c : completion) {
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) - 1);
            }
        }

        for(String key : map.keySet()){
            if(map.get(key) > 0){
                answer = key;
                break;
            }
        }

        return answer;
    }

}
