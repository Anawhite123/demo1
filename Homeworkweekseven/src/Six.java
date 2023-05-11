
//WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
//        HRA = basic salary 10%
//        DA = Basic salary 8%
//        TA = Basic salary 9%
//        PF= Basic salary 20%
//        Gross salary = basic salary + HRA + TA + DA –PFPrint in following format
//        | Salary Slip |
//        | |
//        | |
//        | Employee Id : 2564 |
//        | Employee Name : Jay |
//        |
//        |
//        | Basic Salary : 25000.0 |
//        | HRA 10% : 2500.0 |
//        | TA 8% : 2250.0 |
//        | DA 9% : 2000.0 |
//        | PF - 20& : 5000.0 |
//        |
//        |
//        | Gross Salary : 26750.0 |
//        |===========================|
//


import java.util.Scanner;

public class Six {

    public static void main(String[] args)
        {
            double basicSalary,HRA,DA,PF,TA,Gross;
            String eName;
            int eId;

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter employee Id:");
            eId = sc.nextInt();
            System.out.println("Enter employee Name:");
            eName = sc.next();
            System.out.println("Basic salary");
            basicSalary = sc.nextDouble();

            HRA=(basicSalary*10)/100;
            DA = (basicSalary*8)/100;
            TA = (basicSalary*9)/100;
            PF=  (basicSalary*20)/100;
            Gross = basicSalary+TA+HRA+DA-PF;

            System.out.println("|-------------------------|");
            System.out.println("|      Salary Slip        |");
            System.out.println("|-------------------------|");
            System.out.println("| Employee Id   : "+eId+" |");
            System.out.println("| Employee Name : "+eName+" |");
            System.out.println("|------------------------- |");
            System.out.println("| Basic Salary  : "+basicSalary+" |");
            System.out.println("| HRA 10%       : "+HRA+" |");
            System.out.println("| TA 8%         : "+TA+" |");
            System.out.println("| DA 9%         : "+DA+" |");
            System.out.println("| PF - 20%      : "+PF+" |");
            System.out.println("|-------------------------| ");
            System.out.println("| Gross Salary  : "+Gross+" |");
            System.out.println("|=========================|");
        }
    }



