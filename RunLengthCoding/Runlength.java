import java.util.*;

public class CharRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int count = 1;  // Start with 1 because we already have the first character

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;  // Same as previous character, increment count
            } else {
                // Different character, print previous character and count
                System.out.print(s.charAt(i - 1) + "" + count);
                count = 1;  // Reset count for the new character
            }
        }

        // Print the last character and its count
        System.out.println(s.charAt(s.length() - 1) + "" + count);
    }
}
