//Wyatt Wilhelmi
//wyattw1@umbc.edu
//This program is designed to create an account with a balance and then calculate interest.


public class ExamAccount{

   public static void main(String[] args){
   
      Account account1 = new Account();
      
      account1.setId (212354);
      account1.setBalance (50000);
      account1.setAnnualInterestRate (5.5);
      
      print(account1);
   
   }
   public static void print(Account a){
   
      System.out.println(a.getId());
      System.out.println("$" + a.getBalance());
      System.out.println(a.getAnnualInterestRate() + "%");
      System.out.println("%/M: " + a.getMonthlyInterestRate());
      System.out.println("$" + a.getMonthlyInterest() + " per month");
   }
}