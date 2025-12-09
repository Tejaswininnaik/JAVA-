import java.util.Scanner;

public class leftshift {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Showcasing Bitwise XOR operator\n");
        System.out.print("Enter your number:");
        int num1 = input.nextInt();
        int number = num1 << 4;
        System.out.println("The number is " + number);
    }
}

