import java.util.Scanner;

public class lvl3q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        // Count digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];
        temp = number;
        int index = 0;

        // Store digits in array
        while (temp != 0) {
            digits[index] = temp % 10;
            index++;
            temp = temp / 10;
        }

        int[] frequency = new int[10]; // digits 0–9

        // Count frequency
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Display result
        System.out.println("Digit frequencies:");

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}