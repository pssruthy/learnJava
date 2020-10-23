public class Repeat {
  public static void printArray(int[] array) {

    for (int i : array) {
      System.out.println(i);
    }
  }

  public static int[] repeat(int number, int count) {
    int[] collection = new int[count];

    for(int index = 0; index < count; index++) {
      collection[index] = number;
    }
    return collection;
  }
  
  public static void main(String[] args) {
    printArray(repeat(2, 10));
  }
}