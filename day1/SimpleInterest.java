// Simple Interest - Write a program that calculates the simple interest on a given sum with a rate of interest over a given time period.
// Input: 3 numbers (principal, rate of interest, period)

public class SimpleInterest {
  public static void main(String[] args) {
    int principal = Integer.parseInt(args[0]);
    int interestRate = Integer.parseInt(args[1]);
    int period = Integer.parseInt(args[2]);

    double simpleInterest = (principal * interestRate * period) / 100;

    System.out.println(simpleInterest);
  }
}