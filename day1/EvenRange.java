public class EvenRange {
  public static void printEvenRange( int start, int end){
    int currentEven = start % 2 == 0 ? start : start + 1;

    while(currentEven <= end){
      System.out.println(currentEven);
      currentEven += 2;
    }
  }

  public static void main(String[] args) {

    if(args.length < 2){
      System.out.println("Please 2 parameters");
      return;
    }

    int start = Integer.parseInt(args[0]);
    int end = Integer.parseInt(args[1]);

    printEvenRange(start, end);
  }
}