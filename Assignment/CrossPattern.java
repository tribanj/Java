public class CrossPattern {
    public static void main(String[] args) {
        int size = 5;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print spaces for other positions
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
