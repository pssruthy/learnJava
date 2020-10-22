// Give command line arguments in this format
// java Calculator <operator> <operand1> <operand2> 
//eg java Calculator + 1 2

public class Calculator {
  public static void main(String[] args) {
    String operator = args[0];
    int operand1 = Integer.parseInt(args[1]);
    int operand2 = Integer.parseInt(args[2]);

    int result;

    switch(operator){
      case "+" : 
        result = operand1 + operand2;
        break;

      case "-" : 
        result = operand1 - operand2;
        break;

      case "*" : 
        result = operand1 * operand2;
        break;

      case "/" : 
        result = operand1 / operand2;
        break;

      case "%" : 
        result = operand1 % operand2;
        break;

      default : 
        System.out.println("Please enter a valid operator"); 
        return;
    }

    System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
  }
}