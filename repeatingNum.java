
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] num = { 1, 2, 2, 3, 4, 4, 5, 0 };
        Map<Integer, Integer> hm = new HashMap<>();
        for (int n : num) {
            if (hm.containsKey(n)) {
                System.out.println(n);
            } else {
                hm.put(n, 1);
            }

        }
    }
}

// // using ArrayList
// class Main {
// public static void main(String[] args) {
// int[] num = { 1, 2, 2, 3, 4, 4, 5, 0, 0, 5 };
// List<Integer> list = new ArrayList<>();
// for (int n : num) {
// if (list.contains(n)) {
// System.out.println(n);
// } else {
// list.add(n);
// }
// }
// }
// }