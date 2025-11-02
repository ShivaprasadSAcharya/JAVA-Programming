package BitUpdate;
import java.util.*;

public class bitUpdation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;  // Original number
        System.out.println("Original number (n): " + n + " (Binary: " + Integer.toBinaryString(n) + ")");

        System.out.print("Enter operation (1 to set bit, 0 to clear bit): ");
        int oper = sc.nextInt();

        System.out.print("Enter bit position (0-based index): ");
        int pos = sc.nextInt();

        int bitMask = 1 << pos;

        if (oper == 1) {
            // Set the bit
            int newNumber = bitMask | n;
            System.out.println("After setting bit at position " + pos + ": " + newNumber +
                    " (Binary: " + Integer.toBinaryString(newNumber) + ")");
        } else if (oper == 0) {
            // Clear the bit
            int newBitMask = ~bitMask;
            int newNumber = newBitMask & n;
            System.out.println("After clearing bit at position " + pos + ": " + newNumber +
                    " (Binary: " + Integer.toBinaryString(newNumber) + ")");
        } else {
            System.out.println("Invalid operation. Enter 1 to set or 0 to clear.");
        }

        sc.close();
    }
}
