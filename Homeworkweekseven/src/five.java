
//5. Write a java program to input student Name, roll No, and three subjects Math, Science and English
//        marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
//        should between 0 to 100”) and find out total, percentage and result.
//        If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
//        %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
//        |
//        |
//
//        Mark Sheet
//
//        |
//        |
//
//        |
//        |
//        |
//        Name
//        Roll No
//
//        : 08
//        : 23
//
//        J
//        a
//        y
//        |
//        |
//        |
//        | |
//        | Subjects : Marks |
//        | |
//        | Math : 98 |
//        | Science: : 90 |
//        | English : : 85 |
//        | |
//        | Total : 273 |
//        | |
//        | Percentage : 91.0 |
//        | Result : Pass |
//        | Grade : A+ |


import java.util.Scanner;

public class five {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);// scanner class

        System.out.print("Enter student name :");
        String name = in.next();
        System.out.print("Enter student class: ");
        String sclass = in.next();
        System.out.print("Enter student roll no.: ");
        String sroll = in.next();
        System.out.print(" Math: ");
        int math= in.nextInt();
        System.out.print(" Science: ");
        int sci = in.nextInt();
        System.out.print(" English: ");
        int eng = in.nextInt();

        int total = math + sci + eng ;
        double p = total / 300.0 * 100.0;
        String g = "";
        if (p >= 90)
            g = "A+";
        else if (p >= 80)
            g = "A";
        else if (p >=70)
            g = "B+";
        else if (p >= 60)
            g = "B";
        else if (p >= 50)
            g = "C";
        else if (p >= 40)
            g = "D";
        else if (p >= 35)
            g = "E";
        String result = "Pass";
        if (p<35)
            result = "Fail";
        System.out.println("|_________|");
        System.out.println("|       Mark Sheet        |");
        System.out.println("|_________|");
        System.out.println("|   Name       : "+name+" |");
        System.out.println("|   Roll No    : "+sroll+"|");
        System.out.println("|-------------------------|");
        System.out.println("|   Math       : "+math+" |");
        System.out.println("|   Science    : "+sci+"  |");
        System.out.println("|   English    : "+eng+"  |");
        System.out.println("|-------------------------|");
        System.out.println("|   Total      : "+total+"|");
        System.out.println("|_________|");
        System.out.println("|   Percentage : "+p+"    |");
        System.out.println("|   Result     : "+result+"|");
        System.out.println("|   Grade      : "+g+"    |");
        System.out.println("|-------------------------|");
    }
    }






