public class Ascending {
  public static boolean isAscending(int[] numbers) {

    for(int index = 0; index < numbers.length - 1; index++){
      if(numbers[index] >= numbers[index + 1]){
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int[] numbers = {1, 5, 7, 7};
    System.out.println(isAscending(numbers));
  }
}