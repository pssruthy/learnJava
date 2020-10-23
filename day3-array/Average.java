public class Average {
  public static double average(int[] numbers) {
    int sum = 0;

    for(int index = 0; index < numbers.length; index++) {
      sum += numbers[index];
    }
    return (sum / (double)numbers.length);
  }

  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 5, 6};
    System.out.println(average(numbers));
  }
}