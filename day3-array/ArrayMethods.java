public class ArrayMethods {
  public static void printArray(int[] array) {

    for (int i : array) {
      System.out.println(i);
    }
  }

  public static int indexOf(int number, int[] numbers) {

    for(int index = 0; index < numbers.length; index++) {
      if(number == numbers[index]) {
        return index;
      }
    }
    return -1;
  }

  public static int lastIndexOf(int number, int[] numbers) {
    int numberAt = -1;

    for(int index = 0; index < numbers.length; index++) {
      if(number == numbers[index]) {
        numberAt = index;
      }
    }
    return numberAt;
  }

  public static int[] reverse(int[] numbers) {
    int[] reversedNumbers = new int[numbers.length];

    for(int index = 0; index < numbers.length; index++) {
      reversedNumbers[index] = numbers[numbers.length - index - 1];
    }

    return reversedNumbers;
  }

  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4 , 4, 3};
    printArray(reverse(numbers));
  }
}