
class Main {
    public static void main(String[] args) {
        String str = "This isg business";
        String out = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // if (out.indexOf(ch) == -1 || ch == ' ') {
            // out = out + ch;
            // }
            // if (ch == ' ') {
            // out = out + ch;
            // }
            if (out.indexOf(ch) == -1) {
                out = out + ch;
            }
        }
        System.out.println(out);

    }
}