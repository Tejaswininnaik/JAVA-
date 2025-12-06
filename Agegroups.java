import java.util.Scanner;
public class Agegroups {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age  = input.nextInt();
        if(age <= 13) {
            System.out.println("Your are a child ");
        }else if(age <= 20) {
            System.out.println("Your are a Teen ");
        }else if(age <= 60) {
            System.out.println("Your are a Adult");}
        else {
            System.out.println("You are a Senior");
        }
    }
}

