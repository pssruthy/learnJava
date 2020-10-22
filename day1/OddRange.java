public class OddRange {
  public static void main(String[] args) {
    int start = Integer.parseInt(args[0]);
    int end = Integer.parseInt(args[1]);

    int number = start % 2 == 0 ? start + 1: start;

    while(number <= end){
      System.out.println(number);
      number += 2;
    }
  }
}