
import java.util.*;

class Main {
    public static void main(String[] args) {
        String str = "sushmitasriwastva";
        String newStr = "";
        Map<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hm.get(ch) > 1) {
                newStr = newStr + hm.get(ch);
            } else {
                newStr = newStr + ch;
            }
        }
        System.out.println(newStr);
    }
}