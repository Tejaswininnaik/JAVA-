import java.util.Scanner;

public class FahrenheitCelsius {
    public static void main(String[] args) {
        System.out.println("Welcome to  Fahrenheit to Celsius Calculator\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your temperature");
        int f = input.nextInt();
        int FahrenheitCelsius = (f - 32) * 5 / 9;
        System.out.println("\n\n Your Fahrenheit to Celsius is:" + FahrenheitCelsius +"C");
    }
}