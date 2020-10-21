//Multiplication Table - Write a program that will PRINT a multiplication table of any number 'm' up until a number 'n'. So, m*1, m*2....m*n.
// Input: 2 numbers (m and n)

public class MultiplicationTable {
  public static void main(String[] args) {
    int m = Integer.parseInt(args[0]);
    int n = Integer.parseInt(args[1]);

    for(int count = 1; count <= n; count++){
      int product = m * count;
      System.out.println(m + " X " + count + " = " + product );
    }
  }
}