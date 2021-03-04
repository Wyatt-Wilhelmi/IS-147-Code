import java.util.Scanner;
public class SimpleMath{

   public static void main(String[] args){
   
   int number1 = (int) (Math.random() * 10);
   int number2 = (int) (Math.random() * 10);
   
   System.out.println(" what is " + number1 + " + " + number2 + " ? ");
   Scanner input = new Scanner(System.in);
   int sum = input.nextInt();
   
   int number3 = number1 + number2;
   
   if(sum==number3){
      System.out.println("You answered correctly");
   }else {
      System.out.println("You answered incorrectly");
      }
   }

}