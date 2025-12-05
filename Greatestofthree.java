import java.util.Scanner;

public class Greatestofthree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number one: ");
        int numone = input.nextInt();
        System.out.println("Please enter a number two : ");
        int numtwo = input.nextInt();
        System.out.println("Please enter a number three: ");
        int numthree = input.nextInt();

        if(numone>= numtwo && numone>=numthree){
            System.out.println("Numone is Greatest Number");
        }
        else if (numtwo>= numone && numtwo>=numthree){
            System.out.println("Numtwo is Greatest Number");
        } else{
            System.out.println("Numthird is Greatest Number");
        }
    }
}
