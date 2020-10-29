public class Calculator {
  public static double execute(String operator, double operand1, double operand2) {
    double result = 0;

    switch(operator) {
      case "+" : 
        result = operand1 + operand2;
        break;

      case "-" : 
        result = operand1 - operand2;
        break;

      case "x" : 
        result = operand1 * operand2;
        break;

      case "/" : 
        result = operand1 / operand2;
        break;

    }
    return result;   
  }
}