public class ArrayMethods {
  public static int indexOf(int number, int[] numbers) {

    for(int index = 0; index < numbers.length; index++) {
      if(number == numbers[index]) {
        return index;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4 };
    System.out.println(indexOf(9, numbers));
  }
}