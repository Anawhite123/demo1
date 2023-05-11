import java.util.Scanner;

public class twelve {

    public static void main(String[] args) {
        c();
    }

    public static void c(){
        Scanner N = new Scanner(System.in);
        System.out.println("Enter any characters between A to F : ");
        // int city = sc.nextInt();
        char city = N.next().charAt(0);

        switch (city){// use of Switch statement
            case 'A':
                System.out.println("Northampton");
                break;
            case 'B' :
                System.out.println("Perth");
                break;
            case 'C' :
                System.out.println("Surat");
                break;
            case 'D' :
                System.out.println("Kettering");
                break;
            case 'E' :
                System.out.println("Ahmedabad");
                break;
            case 'F' :
                System.out.println("Baroda");
                break;
            default:
                System.out.println("Invalid Input");
        }


        c();
    }
}