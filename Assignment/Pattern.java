// import java.util.Scanner;

// public class Pattern {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of terms: ");
//         int n = scanner.nextInt();
//         scanner.close();

//         if (n <= 0) {
//             System.out.println("Please enter a positive integer.");
//         } else {
//             System.out.println("Fibonacci Series of " + n + " terms:");
//             printFibonacciSeries(n);
//         }
//     }

//     public static void printFibonacciSeries(int n) {
//         int a = 0, b = 1;

//         for (int i = 0; i < n; i++) {
//             System.out.print(a + " ");
//             int nextTerm = a + b;
//             a = b;
//             b = nextTerm;
//         }
//     }
// }


