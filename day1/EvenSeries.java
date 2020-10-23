public class EvenSeries {
  public static void printEvenSeries(int limit, int currentEven){
    if(limit == 0){
      return;
    }

    System.out.println(currentEven);
    printEvenSeries(limit - 1, currentEven + 2);
    return;
  }

  public static void main(String[] args) {

    if(args.length < 1){
      System.out.println("Please give a limit");
      return;
    }

    int limit = Integer.parseInt(args[0]);
    printEvenSeries(limit, 2);
  }
}