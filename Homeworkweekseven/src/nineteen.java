import java.util.Scanner;

public class nineteen  {
    static void checkNumber(int num){
        //check if number is positive, negative or zero
        if(num>0)
            System.out.println(num + " is POSITIVE NUMBER.");
        else if(num<0)
            System.out.println(num + " is NEGATIVE NUMBER.");
        else
            System.out.println(num + " is a ZERO.");
    }
    public static void main( String args[] ) {
        // create some number values
        Scanner sc = new Scanner(System.in);
        checkNumber(-10);

    }
}

