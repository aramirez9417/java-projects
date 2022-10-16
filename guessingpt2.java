import java.util.Scanner;


public class guessingpt2 {
    // Java program for the above approach
public static void main(String args[]) {
   
    {
        try (Scanner sc = new Scanner(System.in)) {
            
            // Generate the numbers
            int number = 1 + (int)(10000 * Math.random());
 
            // Given K tries
            int K = 15;
 
            int i, guess;
 
            System.out.println("A number is chosen between 1 to 10000. Guess the number within 15 tries.");
 
            // Iterate over K Trials
            for (i = 0; i < K; i++) {
 
                System.out.println("Guess the number:");
 
                // Take input for guessing
                guess = sc.nextInt();
 
                // If the number is guessed
                if (number == guess) {
                    System.out.println("Congratulations! You Won!");
                    break;
                }
               
               
                // if not run through rest of block
                
                else if (number > guess && i != K - 1) {
                    System.out.println("The number is greater than " + guess);
                }
                
                
                else if (number < guess && i != K - 1) {
                    System.out.println("The number is less than " + guess);
                }
            }
 
            if (i == K) {
                
                System.out.println("You are all out of tries.");
                System.out.println("The number was " + number);
            }
        }
    }



    }
}
