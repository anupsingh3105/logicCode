
import java.util.*;

class Main {
    public static void main(String[] args) {
        String str = "This is called the best approach";
        Map<Character, Integer> hm = new HashMap<>();
        char[] charArray = str.toCharArray();
        for (char ch : charArray) {
            if (hm.containsKey(ch)) {
                int count = hm.get(ch);
                hm.put(ch, count + 1);
            } else {
                hm.put(ch, 1);
            }

        }
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}