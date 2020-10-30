package calculator;

public class Calculator {
  public double result;

  public Calculator() {
    this.result = 0;
  }

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
}