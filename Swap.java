import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Swappping");
        System.out.println("Please Enter A: ");
        int a =input.nextInt();
        System.out.println("Please Enter B: ");
        int b =input.nextInt();

        int c=a;
        a=b;
        b=c;
        System.out.println("Swappping done");
        System.out.println("The Value of A is: "+ a);
        System.out.println("The Value of B is: "+ b);

    }
}
