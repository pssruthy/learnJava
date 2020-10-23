//Temperature Conversion - Write a program that converts a temperature from centigrade to fahrenheit.
// Input: 1 number (temperature in Celsius)

public class CentigradeToFahrenheit{
  public static double getFahrenheit(float centigrade){
    return ((centigrade * 9 )/ 5.0) + 32;
  }

  public static void main(String[] args) {

    if(args.length < 1){
      System.out.println("Please give temperature in centigrade");
      return;
    }

    float centigrade = Float.parseFloat(args[0]);

    System.out.println("Centigrade : " + centigrade );
    System.out.println("Fahrenheit : " + getFahrenheit(centigrade) );
  }
}