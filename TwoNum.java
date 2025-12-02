import java.util.Scanner;

public class TwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 4;
        int b = 5;
        int sum = a+b;
        System.out.println(sum);

        System.out.println("Welcome to our Calculator");
        System.out.print("Please enter first number: ");
        int firstNum = input.nextInt();
        System.out.print("Now, please enter the second number: ");
        int secondNum = input.nextInt();
        int sum1 = firstNum + secondNum;
        System.out.println("Sum of your numbers is: " + sum1);
    }
}


