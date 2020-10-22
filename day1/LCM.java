// LCM - Write a program that provides the least common multiple of two given numbers(use the HCF program)
// Input: 2 numbers

public class LCM {
  public static void main(String[] args) {
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);

    int small = num1 < num2 ? num1 : num2;
    int big = num1 > num2 ? num1 : num2;

    int number = big;
    while(number % small != 0){
      number = number + big;
    }

    System.out.println("LCM of " + small + " and " + big + " is " + number);
  }
}