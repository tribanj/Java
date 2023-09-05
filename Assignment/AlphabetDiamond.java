public class AlphabetDiamond {
    public static void main(String[] args) {
        int n = 5; 
        char currentChar = 'A';

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(currentChar);
                currentChar++;
            }

            System.out.println();
            currentChar = 'A';
        }

        // Print the bottom half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print characters in decreasing order
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(currentChar);
                currentChar++;
            }

            System.out.println();
            currentChar = 'A';
        }
    }
}
