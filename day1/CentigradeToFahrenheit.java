//Temperature Conversion - Write a program that converts a temperature from centigrade to fahrenheit.
// Input: 1 number (temperature in Celsius)

public class CentigradeToFahrenheit{
  public static void main(String[] args) {
    int centigrade = Integer.parseInt(args[0]);
    float fahrenheit = (centigrade * 9 / 5F) + 32;

    System.out.println("Centigrade : " + centigrade );
    System.out.println("Fahrenheit : " + fahrenheit );
  }
}