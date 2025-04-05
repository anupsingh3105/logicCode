import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] num2 = new int[num.length];
        int rotate = 1;
        int index = 0;
        for (int i = num.length - rotate; i < num.length; i++) {
            num2[index] = num[i];
            index++;
        }
        for (int i = 0; i < num.length - rotate; i++) {
            num2[index] = num[i];
            index++;
        }
        System.out.println(Arrays.toString(num2));
    }
}