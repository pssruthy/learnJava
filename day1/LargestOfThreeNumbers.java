public class LargestOfThreeNumbers {
  public static void main(String[] args) {
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int num3 = Integer.parseInt(args[2]);

    int largest = num1 > num2 ? num1 : num2;
    largest = largest > num3 ? largest : num3;

    System.out.println(largest);
  }
}