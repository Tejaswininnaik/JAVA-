import java.util.Scanner;

public class Tarea {
    public static void main(String[] args) {
        System.out.println("Welcome to Area calculator\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter base value: ");
        int base = input.nextInt();
        System.out.println("Please enter height value: ");
        int height = input.nextInt();
        int area = (base*height)/2;
        System.out.println("The Area of Triangle is: "+ area);
    }
}
