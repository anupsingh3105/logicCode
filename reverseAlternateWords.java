public class reverseAlternateWords {
    public static void main(String[] args) {
        String str = "anup is good boy";
        String out = ""; // Initialize an empty string to store the output
        String rev;

        // Split the input string into words
        String arr[] = str.split(" ");

        // Loop through each word
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) { // If the index is even, keep the word as it is
                out += arr[i] + " ";
            } else { // If the index is odd, reverse the word
                rev = "";
                for (int j = arr[i].length() - 1; j >= 0; j--) {
                    rev += arr[i].charAt(j);
                }
                out += rev + " ";
            }
        }

        // Print the final result
        System.out.println(out.trim());
    }

}
