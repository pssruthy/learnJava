//Multiplication Table - Write a program that will PRINT a multiplication table of any number 'm' up until a number 'n'. So, m*1, m*2....m*n.
// Input: 2 numbers (m and n)

public class MultiplicationTable {
  public static int getProduct(int num1, int num2){
    return num1 * num2;
  }

  public static void printMultiplicationTable(int number, int multiplier){
    
    for(int count = 1; count <= multiplier; count++){
      System.out.println(count + " x " + number + " = " + getProduct(count, number));
    }

  }

  public static void main(String[] args) {
    if(args.length < 2){
      System.out.println("Please give 2 parameters");
      return;
    }

    int number = Integer.parseInt(args[1]);
    int multiplier = Integer.parseInt(args[0]);

    printMultiplicationTable(number, multiplier);
  }
}