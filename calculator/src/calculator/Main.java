package calculator;

public class Main {
  public static void main(String[] args) {

    Calculator calc = args.length == 0 ? new Calculator() : new Calculator(Double.parseDouble(args[0]));

    for(int index = 1; index < args.length; index += 2) {
      calc.execute(args[index], Double.parseDouble(args[index + 1]));
    }

    System.out.println(calc.getResult());
  }
}