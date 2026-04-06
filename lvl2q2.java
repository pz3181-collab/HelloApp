import java.util.Scanner;

public class lvl2q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits
        while (number != 0) {

            if (index == maxDigit) {

                maxDigit += 10;  // increase size by 10

                int[] temp = new int[maxDigit];

                // copy old array to new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp; // assign new array
            }

            digits[index] = number % 10;
            index++;

            number = number / 10;
        }

        int largest = digits[0];
        int secondLargest = digits[0];

        // find largest and second largest
        for (int i = 1; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            }
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}