// GCD - Write a program that provides the greatest common divisor of two given numbers
// Input: 2 numbers

public class GCD {
  public static int getGcd(int num1, int num2){
    int gcd = 1;
    int divisor = Math.min(num1, num2);

    while(divisor > 0 && gcd == 1){
      boolean isDivisible = num1 % divisor == 0 && num2 % divisor == 0;
      if(isDivisible){
        gcd = divisor;
      }
      divisor--;
    }

    return gcd;
  }

  public static void main(String[] args) {

    if(args.length < 2){
      System.out.println("Please give 2 numbers");
      return;
    }

    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    
    System.out.println(getGcd(num1, num2));
  }
}