public class OddSeries {
  public static void printOddSeries(int limit){
    int currentOdd = 1;

    for(int count = 1; count <= limit; count++){
      System.out.println(currentOdd);
      currentOdd += 2;
    }

  }

  public static void main(String[] args) {

    if(args.length < 1){
      System.out.println("Please give the limit");
      return;
    }

    int limit = Integer.parseInt(args[0]);
    printOddSeries(limit);
  }
}