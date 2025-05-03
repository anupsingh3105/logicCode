public class primeNum1_100 {
    public static void main(String[] args) {
        // int num = 5;
        for (int i = 2; i <= 100; i++) {
            boolean flag = checkPrimeNum(i);
            if (flag) {
                System.out.println(i + " : " + "prime Num");
            } else {
                System.out.println("Not a Prime Number");
            }
        }

    }

    public static boolean checkPrimeNum(int n) {
        if (n < 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
