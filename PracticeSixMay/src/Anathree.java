public class Anathree {
    int a = 8;
    static String q ="my space" ;

    public void kelly(){
        System.out.println(a);
        System.out.println(q);


    }

    public static void jelly(){
        Anathree c = new Anathree();
        System.out.println(c.a);
        System.out.println(q);


    }

    public static void main(String[] args) {
       Anathree v = new Anathree();
       v.kelly();
       jelly();


    }
}
