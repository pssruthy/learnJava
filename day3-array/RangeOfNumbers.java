public class RangeOfNumbers {
  public static void printArray(int[] array) {
    for (int i : array) {
      System.out.println(i);
    }
  }
  
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4};
    printArray(numbers);
  }
}