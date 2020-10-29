public class MainClass {
  public static void main(String[] args) {

    double operand1 = Double.parseDouble(args[0]);
    double operand2 = Double.parseDouble(args[1]);
    String operator = args[2];
    
    System.out.println(Calculator.execute(operator, operand1, operand2));
  }
}