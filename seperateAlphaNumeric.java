import java.util.*;

class Main {
    public static void main(String[] args) {
        String str = "ab1b2v35v50898ju80";
        List<Character> nums = new ArrayList<>();
        List<Character> words = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                nums.add(ch);
            } else {
                words.add(ch);
            }
        }
        System.out.println(nums + " : " + words);
    }
}