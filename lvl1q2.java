import java.util.Scanner;

public class lvl1q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] table = new int[10];   // array to store results

        // Store multiplication results
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display the table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}