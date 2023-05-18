public class SimpleCalculator {
    double firstNumber;
    double secondNumber;

   public SimpleCalculator(double firstNumber,double secondNumber){//constructor
       this.firstNumber = firstNumber;
       this.secondNumber = secondNumber;
   }
    public double getFirstNumber() {
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public double setFirstNumber(double firstNumber){
        return firstNumber;
    }
    public double setSecondNumber(double secondNumber){
        return secondNumber;
    }

    public double getAdditionResult(){
      double  addition = firstNumber + secondNumber;
      return addition;
    }
    public double getSubtractionResult(){
        double Subtraction = firstNumber - secondNumber;
        return Subtraction;
    }
    public double getMultiplicationResult(){
        return firstNumber*secondNumber;

    }
    public double getDivisionResult(){
       if (secondNumber ==0){
           return this.secondNumber=0;
       }else {return firstNumber/secondNumber;
       }




    }

    public static void main(String[] args) {
  SimpleCalculator calculator = new SimpleCalculator(5.0,4);
  calculator.setFirstNumber(5.0);
  calculator.setSecondNumber(4);
        System.out.println("add=" +calculator.getAdditionResult());
        System.out.println("subtract=" +calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply="+ calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
