public class reverseStringPreservingSpaces {
    public static void main(String[] args) {
        String str1 = "welcome to java";
        // seir eS ISM eht sisihT
        String rev = "";
        int strIndex = 0;
        for (int i = str1.length() - 1; i >= 0; i--) {
            if (str1.charAt(strIndex) == ' ') {
                rev += " ";
                strIndex++;
            }
            if (str1.charAt(i) != ' ') {
                rev = rev + str1.charAt(i);
                strIndex++;
            }

        }
        System.out.println(rev);
    }
}
