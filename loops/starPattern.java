// Rectangular pattenrn

// import java.util.Scanner ; 
// public class starPattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int r = sc.nextInt();
//         int c = sc.nextInt();

//         for (int i=1; i<= r; i++){
//             for(int j=1; j<=c; j++){
//                System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Rectangular pattern border/

// import java.util.Scanner;

// public class starPattern {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         int c = sc.nextInt();

//         for(int i = 1; i<=r; i++){
//             for(int j=1; j<=c; j++){
//                 if(i==1 || i==r || j==1 || j==c)
//                 System.out.print("*");
//                 else
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }

//     }

// }

// triangular pattern 
// import java.util.Scanner;
// public class starPattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         for(int i=1; i<=r; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

// reverse triangular pattern 
// import java.util.Scanner;
// public class starPattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         for(int i=1; i<=r; i++){
//             for(int j=1; j<= (r+1-i); j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }


// Pyramid pattern
import java.util.Scanner;
public class starPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++){
            //print r-1 spaces
                for(int j= 1; j<= r-i; j++){
                    System.out.print(" ");
                }

            //print 2*i-1 star 

            for(int k=1; k<= 2*i-1; k++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}


