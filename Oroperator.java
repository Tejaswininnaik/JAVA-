import java.util.Scanner;

public class Oroperator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Showcasing Bitwise Or operator\n");
        System.out.println("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = input.nextInt();
        int number = num1 | num2;
        System.out.println(" The number is " + number);
    }
}

