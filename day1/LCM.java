// LCM - Write a program that provides the least common multiple of two given numbers(use the HCF program)
// Input: 2 numbers

public class LCM {
  public static int getLcm(int num1, int num2){
    int smallerNum = Math.min(num1, num2);
    int biggerNum = Math.max(num1, num2);

    int lcm = biggerNum;
    while(lcm % smallerNum != 0){
      lcm += biggerNum;
    }

    return lcm;
  }

  public static void main(String[] args) {

    if(args.length < 2){
      System.out.println("Please give 2 numbers");
      return;
    }

    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);

    System.out.println("LCM of " + num1 + " and " + num2 + " is " + getLcm(num1, num2));
  }
}