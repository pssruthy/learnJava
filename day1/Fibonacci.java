// Fibonacci - Write a program that PRINTS the fibonacci series of n terms
// Input: 1 number(number of terms to print)

public class Fibonacci {
  public static void printFibonacci(int termLimit, int currentTerm, int nextTerm ){
    if(termLimit == 0){
      return;
    }

    System.out.println(currentTerm);
    printFibonacci(termLimit - 1, nextTerm, nextTerm + currentTerm);
  }

  public static void main(String[] args) {

    if(args.length < 1){
      System.out.println("Please give 2 parameters");
      return;
    }

    int termLimit = Integer.parseInt(args[0]);
    printFibonacci(termLimit, 0, 1);
  }
}