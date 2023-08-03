import java.util.Scanner;

public class CountDigits {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int numOfDigits = 0;
    //     int original_n = n;

    //     while (n > 0) {
    //         n = n / 10;
    //         numOfDigits++;
    //     }

    //     System.out.println("Number of Digits in " + original_n + " = " + numOfDigits);
    // }



// Question num 2:-/
// find the sum of digits in a given number 
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int SumOfDigits = 0;
    int original_n = n;


    while(n > 0){
        SumOfDigits += n % 10;
        n= n/10;
    }
    System.out.println("Number of Digits in " + original_n + " = " + SumOfDigits);
    
}




}

