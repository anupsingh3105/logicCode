public class pallindrome {
    public static void main(String[] args) {
        int num = 1221;
        int orgNum = num;
        int revNum = 0;

        while (num > 0) {
            int rem = num % 10;
            revNum = rem + revNum * 10;
            num = num / 10;
        }
        if (orgNum == revNum) {
            System.out.println(orgNum + " : " + "Num is pallindrom");
        } else
            System.out.println(orgNum + " : " + "Num is not pallindrom");
    }
}
