
//7. Write a java program to input any number and find out if it’s odd or even.


import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        //to take input from the user
        //Create an object of scanner

        Scanner input = new Scanner(System.in);
        int a;// declare variable

        System.out.println("enter a number");
        a = input.nextInt();

        if (a  % 2 ==0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }






}






















