

//2.	-Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
//        -Before the user enters the number, print the message Enter number:
//
//        -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
//
//        Hint:
//
//        -Use an endless while loop.
//
//        -Create a class with the name MinAndMaxInputChallenge.


import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void minMax(){
        int i;
        int min=0, max=0;
        Scanner st=new Scanner(System.in);
        while (true) {
            System.out.println("Enter number : ");
            if (st.hasNextInt()){
                int number =st.nextInt();
                if(number>max){   //Declare max value
                    max=number;}
                if (number<max) { min=number;}  //Declare min value
            }
            else {
                System.out.println("maximun number : "+max);
                System.out.println("minimum number : "+min);
                break;
            }
        }
    }      public static void main(String[] args) {
        minMax();
    }
}
