// Temperature Conversion - Write a program that converts a temperature from fahrenheit to centigrade.
// Input: 1 number (temperature in Fahrenheit)

public class FahrenheitToCentigrade{
  public static void main(String[] args) {
    int fahrenheit = Integer.parseInt(args[0]);
    float centigrade = (fahrenheit - 32) * (5/ 9F);

    System.out.println("Fahrenheit : " + fahrenheit );
    System.out.println("Centigrade : " + centigrade );
  }
}