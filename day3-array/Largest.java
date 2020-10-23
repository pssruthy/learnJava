public class Largest {
  public static int largest(int[] numbers) {
    int currentLargest = numbers[0];

    for(int index = 0; index < numbers.length; index++) {
      if(currentLargest < numbers[index]) {
        currentLargest = numbers[index];
      }
    }

    return currentLargest;
  }

  public static void main(String[] args) {
    int[] numbers = {11, 11, 12};
    System.out.println(largest(numbers));
  }
}