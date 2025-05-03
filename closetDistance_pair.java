import java.util.Arrays;

public class closetDistance_pair {

    // public static void main(String[] args) {
    // int arr[] = { -40, 0, 6, 7, 8, 20 };
    // int pair[] = new int[2];
    // int dist = Integer.MAX_VALUE;
    // int target = 9;
    // int sum = 0;
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i + 1; j <= arr.length - 1; j++) {
    // sum = arr[i] + arr[j];
    // int diff = Math.abs(target - sum);
    // if (diff <= dist) {
    // dist = diff;
    // pair[0] = arr[i];
    // pair[1] = arr[j];
    // }

    // }
    // }
    // System.out.println(Arrays.toString(pair));
    // }

    public static void main(String[] args) {
        int arr[] = { 4, 0, 6, 7, 8, 2 };
        int pair[] = new int[2];
        int sum = 0;
        int dist = Integer.MIN_VALUE;
        int target = 9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                sum = arr[i] + arr[j];
                int diff = Math.abs(target - sum);
                if (diff >= dist) {
                    dist = diff;
                    pair[0] = arr[i];
                    pair[1] = arr[j];
                }

            }
        }
        System.out.println(Arrays.toString(pair));
    }
}
