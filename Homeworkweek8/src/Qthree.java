


//3.	Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel of Consonant, depending on the user input. If the user input Is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message. For eg:
//        Input an alphabet: p Expected Output:
//        Input letter is Consonant


import java.util.Scanner;

public class Qthree {
    public static void main(String[] args) {
        int i = 0;
        Scanner k = new Scanner(System.in);
        System.out.println("enter Character:  ");
        char cs = k.next().charAt(0);
        switch (cs) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                i++;
        }
        if(i==1)
            System.out.println("Entered character "+cs+" is  Vowel");
        else
        if((cs>='a'&&cs<='z')||(cs>='A'&&cs<='Z'))
            System.out.println("Entered character "+cs+" is Consonent");
        else
            System.out.println("Not an alphabet");
    }



        }






