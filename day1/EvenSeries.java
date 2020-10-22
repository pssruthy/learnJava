public class EvenSeries {
  public static void main(String[] args) {
    int limit = Integer.parseInt(args[0]);

    int number = 2;
    for(int count = 1; count <= limit; count++){
      System.out.println(number);
      number += 2;
    }
  }
}