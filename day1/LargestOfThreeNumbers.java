public class LargestOfThreeNumbers {
  public static void main(String[] args) {

    if(args.length < 3){
      System.out.println("Please give 3 numbers");
      return;
    }

    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int num3 = Integer.parseInt(args[2]);

    int largest = Math.max(num1, num2);
    largest = Math.max(largest, num3);

    System.out.println(largest);
  }
}