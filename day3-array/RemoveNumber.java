public class RemoveNumber {
  public static void printArray(int[] array) {

    for (int i : array) {
      System.out.println(i);
    }
  }

  public static int[] getCroppedOf(int[] array, int length) {
    int[] croppedArray = new int[length];

    for(int index = 0; index < length; index++) {
      croppedArray[index] = array[index];
    }

    return croppedArray;
  }

  public static int[] removeNumber(int[] numbers, int number ) {
    int[] filteredNumbers = new int[numbers.length];
    int count = 0;

    for(int index = 0; index < numbers.length; index++) {
      if(numbers[index] != number) {
        filteredNumbers[count] = numbers[index];
        count++;
      }
    }

    return getCroppedOf(filteredNumbers, count);
  }
  
  public static int[] removeZeros(int[] numbers) {
    return removeNumber(numbers, 0);
  }
  
  public static void main(String[] args) {
    int[] numbers = {2, 0, 0, 1};
    printArray(removeZeros(numbers));
  }
}