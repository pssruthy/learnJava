public class OddSeries {
  public static void printOddSeries(int limit, int currentOdd){
    if(limit == 0){
      return;
    }

    System.out.println(currentOdd);
    printOddSeries(limit - 1, currentOdd + 2);
    return;
  }

  public static void main(String[] args) {

    if(args.length < 1){
      System.out.println("Please give the limit");
      return;
    }

    int limit = Integer.parseInt(args[0]);
    printOddSeries(limit, 1);
  }
}