// GCD - Write a program that provides the greatest common divisor of two given numbers
// Input: 2 numbers

public class GCD {
  public static void main(String[] args) {
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);

    int gcd = 0;
    int divisor = Math.min(num1, num2);

    while(divisor > 0 && gcd == 0){
      boolean isDivisible = num1 % divisor == 0 && num2 % divisor == 0;
      if(isDivisible){
        gcd = divisor;
      }
      divisor--;
    }
    
    System.out.println(gcd);
  }
}