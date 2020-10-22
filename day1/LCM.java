// LCM - Write a program that provides the least common multiple of two given numbers(use the HCF program)
// Input: 2 numbers

public class LCM {
  public static void main(String[] args) {
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);

    int smallerNum = Math.min(num1, num2);
    int biggerNum = Math.max(num1, num2);

    int number = biggerNum;
    while(number % smallerNum != 0){
      number += biggerNum;
    }

    System.out.println("LCM of " + smallerNum + " and " + biggerNum + " is " + number);
  }
}