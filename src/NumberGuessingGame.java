import java.sql.SQLOutput;
import java.util.Scanner;

public class NumberGuessingGame {
    public static int getNumber(){
        return (int) Math.round(Math.ceil(10 * Math.random()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to a Number Guessing Game !\n");

        while(true){
            System.out.println("Guess a number in between 1 to 10 : ");
            int guess = sc.nextInt();
            if(guess == getNumber()){
                System.out.println("You guess the correct number.");
                break;
            }
            else{
                System.out.println("Wrong guess, Please Try again.");
            }
        }
        sc.close();

    }
}
