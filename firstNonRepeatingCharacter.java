import java.util.*;

public class firstNonRepeatingCharacter {

    public static void main(String[] args) {
        String str1 = "wwertte";
        char c = ' ';
        for (int i = 0; i < str1.length(); i++) {
            int count = 0;
            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(i) == str1.charAt(j) && i != j) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(str1.charAt(i));
                break;
            }
        }
    }

    // public static void main(String[] args) {
    // String str1 = "wwertte";
    // Map<Character, Integer> map = new HashMap<Character, Integer>();
    // for (char c : str1.toCharArray()) {
    // if (map.containsKey(c)) {
    // map.put(c, map.get(c) + 1);
    // } else
    // map.put(c, 1);
    // }
    // for (Map.Entry<Character, Integer> entry : map.entrySet()) {
    // if (entry.getValue() == 1) {
    // System.out.println(entry.getKey());
    // break;
    // }

    // }
    // }
}
