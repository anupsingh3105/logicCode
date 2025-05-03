public class longestPallindrome {
    public static void main(String[] args) {
        String str = "treeeeeertpapapapaapa";
        String sub = "";
        String larg = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                sub = str.substring(i, j);
                if (isPalindrome(sub)) {
                    if (sub.length() > larg.length()) {
                        larg = sub;
                    }
                }
            }
        }
        System.out.println("Longest Palindromic Substring: " + larg);
    }

    // public static boolean isPalindrome(String s) {
    // String rev = "";
    // for (int i = s.length() - 1; i >= 0; i--) {
    // rev += s.charAt(i);
    // }
    // return s.equalsIgnoreCase(rev);
    // }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != (s.charAt(right))) {
                return false;
            }

            left++;
            right--;

        }
        return true;
    }
}
