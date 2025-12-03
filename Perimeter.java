import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter all values in cms");
        System.out.println("Value of A: ");
        int a = input.nextInt();
        System.out.println("Value of B: ");
        int b = input.nextInt();
        System.out.println("Value of C: ");
        int c = input.nextInt();
        System.out.println("Value of D: ");
        int d = input.nextInt();
        int perimeter = a+b+c+d;
        System.out.println("The perimeter is: "+ perimeter);
    }
}
