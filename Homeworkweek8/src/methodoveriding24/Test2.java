package methodoveriding24;

class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        Axis a = new Axis();

        System.out.println("SBI Rate pof interest:" +s.getRateOfInterest());
        System.out.println("ICICI Rate pof interest:" +i.getRateOfInterest());
        System.out.println("AXIS Rate pof interest:" +a.getRateOfInterest());
    }
}
