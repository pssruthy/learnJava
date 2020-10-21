// Fibonacci - Write a program that PRINTS the fibonacci series of n terms
// Input: 1 number(number of terms to print)

public class Fibonacci {
  public static void main(String[] args) {
    int currentNo = 0;
    int nextNum = 1;

    for(int count = 1; count <= Integer.parseInt(args[0]); count++){
      System.out.println(currentNo);
      nextNum = currentNo + nextNum;;
      currentNo = nextNum - currentNo;
    }
  }
}