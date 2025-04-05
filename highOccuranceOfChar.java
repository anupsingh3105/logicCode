
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
        int highCount = 0;
        char highChar = ' ';
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > highCount && entry.getKey() != ' ') {
                highCount = entry.getValue();
                highChar = entry.getKey();
            }
        }
        System.out.println(highChar + " : " + highCount);
    }
}