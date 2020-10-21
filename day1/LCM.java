// LCM - Write a program that provides the least common multiple of two given numbers(use the HCF program)
// Input: 2 numbers

public class LCM {
  public static void main(String[] args) {
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);

    int gcd = 0;
    int lcm;
    int divisor = num1 < num2 ? num1 : num2;

    while(divisor > 0 && gcd == 0){
      boolean isDivisible = num1 % divisor == 0 && num2 % divisor == 0;
      if(isDivisible){
        gcd = divisor;
      }
      divisor--;
    }

    lcm = (num1 * num2 ) / gcd;
    System.out.println(lcm);
  }
}