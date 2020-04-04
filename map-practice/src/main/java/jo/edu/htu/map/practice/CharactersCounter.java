package jo.edu.htu.map.practice;

import java.util.HashMap;
import java.util.Map;

public class CharactersCounter {

    public Map<Character, Integer> countCharacters(String sentence) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            Character temp = Character.toLowerCase(sentence.charAt(i));
            if (temp >= 'a' && temp <= 'z')
                map.put(temp, map.get(temp) != null ? map.get(temp) + 1 : 1);
        }
        return map;
    }
}
