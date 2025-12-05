import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Marks: ");
        float marks = input.nextFloat();
        if(marks >= 90) {
            System.out.println("Grade is A");
        }else if(marks >= 75){
            System.out.println(" Grade is B");
        }else if(marks >= 60){
            System.out.println(" Grade is C");
        }else if(marks >= 30){
            System.out.println(" Grade is D");
        }
        else {
            System.out.println(" Grade is F");
        }
    }
}
