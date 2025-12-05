import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year ");
        int year = input.nextInt();

        if(year % 400==0 || (year % 100 !=0 && year % 4 ==0)){
            System.out.println("Is a leap year");
        } else{
            System.out.println("Is not a leap year");
        }
    }
}

