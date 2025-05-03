import java.util.Arrays;

public class allZerosOnLeft {
    // public static void main(String[] args) {
    // int[] arr = { 0, 1, 2, 4, 0, 0, 6, 0, 0, 7 };
    // int[] arr2 = new int[arr.length];
    // int count = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == 0) {
    // count++;
    // }
    // }
    // for (int i = 0; i < count; i++) {
    // arr2[i] = 0;
    // }
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] != 0) {
    // arr2[count] = arr[i];
    // count++;
    // }
    // }
    // System.out.println(Arrays.toString(arr2));
    // }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 4, 0, 0, 6, 0, 0, 7 };
        int[] arr2 = new int[arr.length];
        int EndInd = arr.length - 1;
        int startInd = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                arr2[startInd] = arr[i];
                startInd++;
            } else {
                arr2[EndInd] = arr[i];
                EndInd--;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }

    // public static void main(String[] args) {
    // int[] arr = { 0, 8, 2, 4, 0, 0, 6, 0, 0, 7, 0 };
    // int endIndex = arr.length - 1;
    // for (int i = arr.length - 1; i >= 0; i--) {
    // if (arr[i] != 0) {
    // arr[endIndex] = arr[i];
    // endIndex--;
    // arr[i] = 0;
    // }
    // }
    // System.out.println(Arrays.toString(arr));
    // }
}
