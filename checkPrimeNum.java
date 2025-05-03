public class checkPrimeNum {
    public static void main(String[] args) {

        boolean flag = checkPrime(6);
        if (flag) {
            System.out.println("prime Num");
        } else {
            System.out.println("Not a Prime Number");
        }

    }

    public static boolean checkPrime(int n) {
        if (n <= 1) {
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
