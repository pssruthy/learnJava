public class RangeOfNumbers {
  public static void printArray(int[] array) {

    for (int i : array) {
      System.out.println(i);
    }
  }

  public static int[] getRangeOfNumbers(int start, int end, int step){
    int numbersCount = (end - start) / step + 1;
    int[] rangeOfNumbers = new int[numbersCount];
    int currentNumber = start;

    for(int index = 0; index < numbersCount; index++){
      rangeOfNumbers[index] = currentNumber;
      currentNumber += step;
    }
    return rangeOfNumbers;
  }

  public static int[] getRangeOfNumbers(int start, int end){
    return getRangeOfNumbers(start, end, 1);
  }
  
  public static void main(String[] args) {
    printArray(getRangeOfNumbers(2, 10, 2));
    System.out.println();
    printArray(getRangeOfNumbers(5, 8));
  }
}