
//12. Write a programme to input any number and check if it is prime or not.
//(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words, prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13, 17 ... are the prime numbers.)
//Prime number is what divided by self or by 1.


import java.util.Scanner;

public class Q12 {


    public static void main(String[] args) {
        int n;
        int k=0;
        System.out.println("enter number ");
        Scanner v = new Scanner(System.in);// use of Scanner class
        n = v.nextInt();
      for (int i = 1;i <=n; i++) {
            {
               if (n % i ==0) {
                   k++;
               }
               }
           }
        if (k == 2) {
           System.out.println("Prime number");
          }else{
               System.out.println("non prime number");
          }
   }




    }

