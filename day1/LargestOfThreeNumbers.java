public class LargestOfThreeNumbers {
  public static int getLargestOfThree(int num1, int num2, int num3){
    int largest = Math.max(num1, num2);
    return Math.max(largest, num3);
  }

  public static void main(String[] args) {

    if(args.length < 3){
      System.out.println("Please give 3 numbers");
      return;
    }

    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int num3 = Integer.parseInt(args[2]);

    System.out.println(getLargestOfThree(num1, num2, num3));
  }
}