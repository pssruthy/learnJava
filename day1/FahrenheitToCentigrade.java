// Temperature Conversion - Write a program that converts a temperature from fahrenheit to centigrade.
// Input: 1 number (temperature in Fahrenheit)

public class FahrenheitToCentigrade{
  public static void main(String[] args) {

    if(args.length < 1){
      System.out.println("Please give temperature in fahrenheit");
      return;
    }

    float fahrenheit = Float.parseFloat(args[0]);
    float centigrade = (fahrenheit - 32) * (5/ 9F);

    System.out.println("Fahrenheit : " + fahrenheit );
    System.out.println("Centigrade : " + centigrade );
  }
}