// Simple Interest - Write a program that calculates the simple interest on a given sum with a rate of interest over a given time period.
// Input: 3 numbers (principal, rate of interest, period)

public class SimpleInterest {
  public static double getSimpleInterest(int principal, int interest, int period){
    return (principal * interest * period) / 100.0;
  }

  public static void main(String[] args) {
    if(args.length < 3){
      System.out.println("Please give 3 parameters");
      return;
    }

    int principal = Integer.parseInt(args[0]);
    int interest = Integer.parseInt(args[1]);
    int period = Integer.parseInt(args[2]);

    System.out.println(getSimpleInterest(principal, interest, period));
  }
}