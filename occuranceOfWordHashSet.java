
import java.util.*;

class Main {
    public static void main(String[] args) {
        String str = "This is business This is";

        String[] words = str.split(" ");
        Set<String> hs = new HashSet<>();
        for (String word : words) {
            hs.add(word);
        }
        System.out.println(hs);
        for (String h : hs) {
            int count = 0;
            for (String word : words) {
                if (h.equals(word)) {
                    count++;
                }
            }
            System.out.println(h + " : " + count);
        }

    }
}