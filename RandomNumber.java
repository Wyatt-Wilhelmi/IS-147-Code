import java.util.Scanner;

public class RandomNumber{

   public static void main(String[] args){
   
      double random = (int)(Math.random() * 101);
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter your guess");
      int guess = input.nextInt();
      
      while(guess < random) {
      
      System.out.println("Too low, please try again");
      guess = input.nextInt();
      
      }
      
       while(guess > random) {
      
      System.out.println("Too high, please try again");
      guess = input.nextInt();
      
      }

      System.out.println("You got it");
      }
}