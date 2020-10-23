public class OddRange {
  public static void printOddRange(int start, int end){
    int currentOdd = start % 2 == 0 ? start + 1: start;

    while(currentOdd <= end){
      System.out.println(currentOdd);
      currentOdd += 2;
    }
  }
  
  public static void main(String[] args) {
    if(args.length < 2){
      System.out.println("Please give 2 parameters");
      return;
    }

    int start = Integer.parseInt(args[0]);
    int end = Integer.parseInt(args[1]);

    printOddRange(start, end);
  }
}