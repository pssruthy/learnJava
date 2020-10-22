// Fibonacci - Write a program that PRINTS the fibonacci series of n terms
// Input: 1 number(number of terms to print)

public class Fibonacci {
  public static void main(String[] args) {

    if(args.length < 1){
      System.out.println("Please give 2 parameters");
      return;
    }

    int termLimit = Integer.parseInt(args[0]);
    
    int currentTerm = 0;
    int nextTerm = 1;

    for(int term = 1; term <= termLimit; term++){
      System.out.println(currentTerm);
      nextTerm = currentTerm + nextTerm;;
      currentTerm = nextTerm - currentTerm;
    }
  }
}