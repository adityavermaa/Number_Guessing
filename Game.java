package Oasis;
import java.util.Random;
import java.util.Scanner;
public class Game {
    public static void main(String[] args){
        System.out.println("Welcome! to number guessing Game!");
        System.out.println("You have provided with 10 chances!");
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int oneTOhundred = rand.nextInt(100);
        System.out.println("Enter the Number between 1-100: ");
        for(int i=0; i<10; i++){
        int b = sc.nextInt();
        System.out.println("random no. is "+ oneTOhundred);
            if(b>100){
                System.out.println("Out of range");
            }
            else if(b==oneTOhundred){
                System.out.println("You guessed it right Wohooo!");
                break;
            }
            else if(b>oneTOhundred){
                System.out.println("Enter the smaller number!");
            }
            else if(b<oneTOhundred){
                System.out.println("Enter the bigger number! ");
            }
            else{
                System.out.println("Enter the number within the Range!");
            }
        }
    }
}
