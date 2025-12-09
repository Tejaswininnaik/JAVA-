import java.util.Scanner;

public class Compliment {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Showcasing Bitwise compliment operator\n");
        System.out.println("Enter your  number: ");
        int num = input.nextInt();
        int number = ~ num;
        System.out.println(" The number is " + number);
    }
}
