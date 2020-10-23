public class CollatzSequence{
  public static boolean isEven(int number) {
    return number % 2 == 0;
  }
 
  public static void printCollatz(int number){
    if(number == 1){
      return;
    }

    System.out.println(number);
    
    if(isEven(number)){
      printCollatz(number / 2);
      return;
    }

    printCollatz(number * 3 + 1);
  }

  public static void main(String[] args){
    if(args.length < 1){
      System.out.println("Please enter a number");
      return;
    }
    
    int number = Integer.parseInt(args[0]);
    printCollatz(number);
  }
}