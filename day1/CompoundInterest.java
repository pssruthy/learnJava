// Compound Interest - Write a program that calculates the compound interest on a given sum with a rate of interest over a given time period.
// Input: 3 numbers (principal, rate of interest, period)

public class CompoundInterest {
  public static void main(String[] args) {
    int principal = Integer.parseInt(args[0]);
    double interestRate = Integer.parseInt(args[1]) / 100.0;
    int period = Integer.parseInt(args[2]);

    double totalAmount = principal;
    for(int year = 1;year <= period; year++){
      totalAmount *= (1 + interestRate);
    }

    double compoundInterest = totalAmount - principal;
    System.out.println(compoundInterest);
  }
}