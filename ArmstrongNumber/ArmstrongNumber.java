import java.util.*;  // Importing the Scanner class for user input

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object for input
        String num = sc.nextLine();           // Read input number as a String

        int sum = 0;  // Variable to store sum of cubes of digits

        // Loop through each character (digit) in the string
        for (int i = 0; i < num.length(); i++) {
            // Convert character to integer and add its cube to the sum
            sum += Math.pow(Integer.parseInt(String.valueOf(num.charAt(i))), 3);   
        }

        // Compare the calculated sum with the original number
        if(sum == Integer.parseInt(num)) {
            System.out.println("Yes, the number is an Armstrong number.");
        } else {
            System.out.println("No, the number is not an Armstrong number.");
        }

        sc.close();  // Close the scanner (good practice)
    }
}
