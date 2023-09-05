import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter a number (negative to exit): ");
            int num = scanner.nextInt();

            if (num < 0) {
                System.out.println("-1");
                break; // Exit the loop if a negative number is encountered
            } else {
                sum += num;
            }
        }

        System.out.println("Sum of numbers entered until a negative number: " + sum);
        scanner.close();
    }
}