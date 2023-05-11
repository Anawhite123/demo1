
//Write a java program to get numbers from users and print whether it is positive or negative.


import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        hk();

    }

    public static void hk(){

        Scanner num = new Scanner(System.in);//scanner class

        System.out.println("enter a number");
        int b= num.nextInt();
        if (b >= 0) {
            System.out.println("positive number");
        } else {
            System.out.println("negative number");
        }


    }

}
