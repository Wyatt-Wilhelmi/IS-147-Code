import java.util.Scanner;

public class WWExamQuestionOne {
   
   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
   
   System.out.println("Enter the exchange rate:");
   double exchangeRate = input.nextDouble();
   
   System.out.println("Enter the amount you want to exchange:");
   double amount = input.nextDouble();
   
   double total = amount * exchangeRate;
   
   System.out.println("$" +amount+ " is " +total+ " GBP");
   
   }


}