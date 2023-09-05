import java.util.Scanner;

public class BulbSwitcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of bulbs (n): ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Bulbs that will be on after " + n + " fluctuations:");
        printBulbsOn(n);
    }

    public static void printBulbsOn(int n) {
        for (int i = 1; i * i <= n; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println();
    }
}
