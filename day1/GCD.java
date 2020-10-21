// GCD - Write a program that provides the greatest common divisor of two given numbers
// Input: 2 numbers

public class GCD {
  public static void main(String[] args) {
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);

    int gcd = 0;
    int smaller = num1 < num2 ? num1 : num2;

    for(int number = smaller; number > 0 && gcd == 0; number--){
      boolean isDivisible = num1 % number == 0 && num2 % number == 0;
      if(isDivisible){
        gcd = number;
      }
    }
    System.out.println(gcd);
  }
}