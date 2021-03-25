import java.util.Scanner;

public class Lottery {

   public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in); 
    
    String ans = "Y";
    
       while(ans.equals("Y")) {
       
         int r = (int) (Math.random() * 100);
      
         System.out.println("Enter your two digit number:");
         int guess = input.nextInt();
         
         if(guess==r){
            System.out.println("You win $10,000!");
         }
         
         else if((r/10 == guess/10) || (r%10==guess%10)){
            System.out.println("You win $3,000!");
         }
         
         else if((r/10 == guess%10) || (r%10==guess/10)){
            System.out.println("You win $1,000!");
         }
         
         else{
            System.out.println("You lose!");
         }
         
         Scanner input2 = new Scanner(System.in);
         System.out.println("Do you want to continue: Y/N");
         ans = input2.nextLine(); 
       
         }         

         System.out.println("Goodbye");
      }      
   }
