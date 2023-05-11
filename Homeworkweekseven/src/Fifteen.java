
//Write a program that tells us input value is number or an alphabet or symbol.
//


import java.util.Scanner;

public class Fifteen {
    public static void main(String[] args) {
        bf();
    }

    public static void bf(){
        Scanner df = new Scanner(System.in);
        System.out.println( "Enter any  number or an alphabet or symbol:   ");
        char sm = df.next().charAt(0);
        String sd = "a" ,  ds="z";
        if((sm >= 'a' && sm <= 'z')){
            System.out.println("The input you have entered is Character: ");}
        else if (sm >= '0' && sm <= '9') {
            System.out.println("The input you have entered is number: ");
        } else{
            System.out.println("The input you have entered is Symbol: ");

        }
bf();

    }
}
