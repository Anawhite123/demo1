

//Write a java program to print the numbers between 1 to 100 which can be divided by 3and
//        5 separately.
//


public class fourteen {

    public static void main(String[] args) {
        System.out.println("numbers divided by 3");
        for (int i=1;i<100;i++)
        {
            if(i%3==0)
                System.out.println(i);
    }
        System.out.println("numbers divided by 5");
        for (int i=1;i<100;i++){
            if(i%5==0)
                System.out.println(i);
        }

    }
}
