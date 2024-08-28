package datastructures.hashtable;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Mosh");
        map.put(2, "John");
        map.put(3, "Mary");
    }

    private static char findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        var chars = str.toCharArray();

        for (var ch : chars) {
            var count = map.getOrDefault(ch, 0);
            map.put(ch, count + 1);
        }

        for (var ch : chars) {
            if(map.get(ch) == 1)
                return ch;
        }
        return Character.MIN_VALUE;
    }
}
