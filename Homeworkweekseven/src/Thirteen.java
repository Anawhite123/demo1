
//13. Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
//        find addition, Subtraction, multiplication and division according to theirsymbol(using if else)


import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {
        number();
    }

    public static void number(){
        Scanner cal = new Scanner(System.in);
        double numb1 =cal.nextInt();
        System.out.println("Enter Number1:");
        double numb2 = cal.nextInt();
        System.out.println("Enter Number2:");
        System.out.println("enter symbol");
        String symbol = cal.next();
        if (symbol.equals("+")){
            System.out.println("addition ="+(numb1+numb2));
        }
        if(symbol.equals("-")){
            System.out.println("subtraction ="+(numb1-numb2));
        }
        if(symbol.equals("*")){
            System.out.println("multiplication ="+(numb1*numb2));
            if(symbol.equals("/"))  {
                System.out.println("multiplication ="+(numb1/numb2));
            }
    }


}}
