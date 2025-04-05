
class Main {
    public static void main(String[] args) {
        String str = "sushmita sriwastva";
        String[] words = str.split(" ");
        String rev = "";
        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                rev += word.charAt(i);
            }
            rev = rev + " ";
        }
        System.out.println(rev);
    }
}