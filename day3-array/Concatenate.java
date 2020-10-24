public class Concatenate {
  public static void printArray(int[] array) {

    for (int i : array) {
      System.out.println(i);
    }
  }

  public static int[] concatenate(int[] array1, int[] array2) {
    int[] concatenatedArray = new int[array1.length + array2.length];

    for(int index = 0; index < array1.length; index++) {
      concatenatedArray[index] = array1[index];
    }

    for(int index = array1.length; index < concatenatedArray.length; index++) {
      concatenatedArray[index] = array2[index - array1.length];
    }

    return concatenatedArray;
  }

  public static void main(String[] args) {
    int[] array1 = {1, 2, 3, 4};
    int[] array2 = {5, 6, 7, 8, 4, 9};

    printArray(concatenate(array1, array2));
  }
}