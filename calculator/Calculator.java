public class Calculator {
  public double result;

  public Calculator(double value) {
    this.result = value;
  }

  public void execute(String operator, double operand) {
    
    switch(operator) {
      case "+" : 
        this.result += operand;
        break;

      case "-" : 
        this.result -= operand;
        break;

      case "x" : 
        this.result *= operand;
        break;

      case "/" : 
        this.result /= operand;
        break;
    }
  }

  public double getResult() {
    return this.result;
  }

  public static void main(String[] args) {

    Calculator calc = new Calculator(Double.parseDouble(args[0]));

    for(int index = 1; index < args.length; index += 2) {
      calc.execute(args[index], Double.parseDouble(args[index + 1]));
    }

    System.out.println(calc.getResult());
  }
}