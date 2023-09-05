import java.util.Scanner;

public class PrimeNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines for the prime number triangle: ");
        int lines = scanner.nextInt();
        scanner.close();

        int currentNumber = 2; // Start with the first prime number
        int lineNumber = 1;

        while (lineNumber <= lines) {
            int count = 0; // Initialize the count of factors
            for (int i = 1; i <= currentNumber; i++) {
                if (currentNumber % i == 0) {
                    count++;
                }
            }

            if (count == 2) { // If the number has exactly 2 factors (prime)
                for (int i = 1; i <= lineNumber; i++) {
                    System.out.print(currentNumber + " ");
                }
                System.out.println();
                lineNumber++;
            }

            currentNumber++; // Move to the next number
        }
    }
}
