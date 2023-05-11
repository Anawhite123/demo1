


//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any
//        other alphabet should be invalid entry.


import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {
        city();
    }

    public static void city(){
        Scanner k =new Scanner(System.in);
        System.out.println("Enter any alphabet from A to F");
        String a = k.next();
        if(a.equalsIgnoreCase("A")){
            System.out.println("Ahmedabad");}
            else if (a.equalsIgnoreCase("B")){
            System.out.println("Bombay");}
            else if (a.equalsIgnoreCase("C")){
            System.out.println("Chennai");}
            else if (a.equalsIgnoreCase("D")){
            System.out.println("Delhi");}
            else if (a.equalsIgnoreCase("E")){
            System.out.println("EastIndia");}
            else if(a.equalsIgnoreCase("F")){
            System.out.println("faridabad");
            }
            else {
            System.out.println("invalid entry");

            }
city();
        }


    }














