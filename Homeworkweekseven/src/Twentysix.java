


//Write a Java program to reverse a word.
//        Sample Output:
//        Input a word: dsaf
//        Reverse word: fasd


public class Twentysix {
    public static void main(String[] args) {


        String o = "dsaf";
        String reverse = "";
        for (int i = o.length() -1; i >=0; i--)
        {reverse = reverse + o.substring(i,i+1);

    }
        System.out.println(reverse);
}}
