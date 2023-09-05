public class StarPattern {
    public static void main(String[] args) {
        int n = 5; // Adjust the number of rows as needed

        for (int i = 1; i <= n; i++) {
            if (i == (n / 2) + 1) {
                // Print a row of asterisks when 'i' is in the middle row
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
            } else {
                // Print a single asterisk in the middle column and spaces on the sides
                for (int j = 1; j <= n; j++) {
                    if (j == (n / 2) + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
