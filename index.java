import java.util.Scanner;

public class index {
   // public static void main(String[] args) {
   // Scanner sc = new Scanner(System.in);
   // int n = sc.nextInt();
   // int sum = 0;
   // int num = 1;

   // while (num <= n) {
   // // System.out.println(num);
   // sum = sum + num;
   // num++; // increment operator
   // }
   // System.out.println(sum);
   // }


   //for loop 


   // public static void main(String[] args) {
   //    Scanner sc = new Scanner(System.in);
   //    int n = sc.nextInt();
   //    int sum = 0;
   //    int num = 1;
   //    for (num = 1; num <= n; num++) {
   //       sum = sum + num;

   //    }
   //    System.out.println(sum);

   // }



   // Do while Loop 


      // public static void main(String[] args) {
         
      //    Scanner sc = new Scanner(System.in) ;
      //    // int n = sc.nextInt();
      //    int  num = 1;
      //    do {
      //       System.out.println(num);
      //       num ++;
      //    } while (num <=10);
      
      // }


      // print the sum of the stream of integers in the input
         // public static void main(String[] args) {
            
         //    Scanner sc = new Scanner(System.in);
         //    int num = sc.nextInt();
         //    int sum = 0;

         //    while (num != -1){
         //       sum += num;
         //       num = sc.nextInt();

         //    }
         //    System.out.println(sum);
         // }


         // BREAK *******************************
         // public static void main(String[] args) {
            // Scanner sc = new Scanner(System.in);
         //    int num = 1;

         //    while(true){
         //       if((num % 5 == 0) && (num % 7 == 0)){
         //          System.out.println("Found Ans :" + num);
         //          break ;
         //       }
         //       num++;
         //    }

         // }


         // CONTINUE ****************8

         public static void main(String[] args) {
            for (int num = 1; num<=50; num++){
               if(num % 3 == 0){
                  continue ; 
               }
               System.out.println(num);
            }
         }


}
