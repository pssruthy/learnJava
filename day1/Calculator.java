// Give command line arguments in this format
// java Calculator <operator> <operand1> <operand2> 
//eg java Calculator + 1 2

public class Calculator {
  public static void main(String[] args) {
    String operator = args[0];
    int operand1 = Integer.parseInt(args[1]);
    int operand2 = Integer.parseInt(args[2]);

    switch(operator){
      case "+" : 
        int sum = operand1 + operand2;
        System.out.println("Sum : " + sum); 
        break;

      case "-" : 
        int diff = operand1 - operand2;
        System.out.println("Difference : " + diff); 
        break;

      case "*" : 
        int product = operand1 * operand2;
        System.out.println("Product : " + product); 
        break;

      case "/" : 
        int quotient = operand1 / operand2;
        System.out.println("Quotient : " + quotient); 
        break;

      case "%" : 
        int remainder = operand1 % operand2;
        System.out.println("Remainder : " + remainder); 
        break;

      default : 
        System.out.println("Please enter a valid operator"); 
        break;
    }
  }
}