import java.util.Scanner;
import java.util.Random;

  public class GuessTheNumber{
    public static void main(String[] args) {
      Scanner scannner=new Scanner(System.in);
      Random random=new Random();

      int numberOfAttemps=0;
      int useGuess=0;
      boolean hasGuessCorrectly =false;
      System.out.println("Welcome to the Guessing Game--");
      System.out.println("I have picked a number btw 1 to 100");
      while(!hasGuessCorrectly){

        System.out.print("enter your guess");

         if(scanner.hasNextInt());{
          userGuess=scanner.hasNextInt();
          numberOfAttempts++;

            if(userGuess<1||userGuess>1000){
              System.out.println("Please stay within the 1-100 range!");
            }else if(userGuess<numberToGuess)
            {
              System.out.println("To Low! try again.");

            }else if(userGuess>numberToGuess)
            {
              System.out.println("To high! try again.");

         }else{
            hasGuessCorrectly=true;
            System.out.println("\nYou got it in "+numberOfAttempts+"tries.");
         }
        }else{
           System.out.println("Thats not a valid number. Try again");
            scanner.next();
        }


      }
      scanner.close();
      
    }
    
  }
  
    
  
