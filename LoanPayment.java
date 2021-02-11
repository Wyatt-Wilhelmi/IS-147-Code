import java.util.Scanner;

public class LoanPayment {

   public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);
   
   System.out.println("Enter interest rate:");
   double monthlyInterestRate = input.nextDouble();
   
   System.out.println("Enter # of years:");
   double numberOfYears = input.nextDouble();
   
   System.out.println("Enter loan amount:");
   double loanAmount = input.nextDouble();
   
   double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1/(Math.pow((1 + monthlyInterestRate), (numberOfYears * 12)))));
   
   System.out.println("The monthly payment is: " + monthlyPayment);
   }
}