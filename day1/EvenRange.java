public class EvenRange {
  public static void main(String[] args) {
    int start = Integer.parseInt(args[0]);
    int end = Integer.parseInt(args[1]);

    int currentEven = start % 2 == 0 ? start : start + 1;

    while(currentEven <= end){
      System.out.println(currentEven);
      currentEven += 2;
    }
  }
}