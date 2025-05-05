import java.util.HashMap;
import java.util.Map;

public class annagram {
    public static void main(String[] args) {
        String str1 = "worth";
        String str2 = "throw";
        Map<Character, Integer> hmap1 = new HashMap<>();
        Map<Character, Integer> hmap2 = new HashMap<>();
        if (str1.length() != str2.length()) {
            System.out.println("This is not Annagram Size is not same");
            return;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (hmap1.containsKey(str1.charAt(i))) {
                hmap1.put(str1.charAt(i), hmap1.get(str1.charAt(i)) + 1);
            } else
                hmap1.put(str1.charAt(i), 1);

            hmap2.put(str2.charAt(i), hmap2.getOrDefault(str2.charAt(i), 0) + 1);

        }

        for (Map.Entry<Character, Integer> entry : hmap1.entrySet()) {
            char ch = entry.getKey();
            if (hmap2.get(ch) != entry.getValue()) {
                System.out.println("This is not Annagram");
                return;
            }

        }
        System.out.println("This is Aanagram");

    }

    // public static void main(String[] args) {
    // String str1 = "lislln";
    // String str2 = "siltnl";
    // boolean flag = false;

    // int[] num = new int[str1.length()];
    // if (str1.length() == str2.length()) {
    // for (int i = 0; i < str1.length(); i++) {
    // flag = false;

    // for (int j = 0; j < str2.length(); j++) {
    // if (str1.charAt(i) == str2.charAt(j) && num[j] == 0) {
    // num[j] = -1;
    // flag = true;
    // break;
    // }
    // }

    // if (!flag) {
    // System.out.println("Strings are not anagram");
    // return;
    // }
    // }
    // }

    // System.out.println("Strings are anagram");
    // }

    // public static void main(String[] args) {
    // String str1 = "lislln";
    // String str2 = "sillnl";

    // char[] arr1 = str1.toCharArray();
    // char[] arr2 = str2.toCharArray();

    // Arrays.sort(arr1);
    // Arrays.sort(arr2);

    // if (Arrays.equals(arr1, arr2)) {
    // System.out.println("This is anagram");
    // } else
    // System.out.println("This is not anagram");

    // }
}
