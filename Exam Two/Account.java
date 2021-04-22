//Wyatt Wilhelmi
//wyattw1@umbc.edu
//This program is designed to create an account with a balance and then calculate interest.

public class Account{

   private int id;
   private double balance;
   private double annualInterestRate;
   
   
   Account(){}
   
   public void setId(int id){
   
      this.id = id;
   
   }
    
   public int getId(){
   
      return id;
   
   }
 
   public void setBalance(double balance){
   
      this.balance = balance;
   
   }
    
   public double getBalance(){
   
      return balance;
   
   }

   public void setAnnualInterestRate(double annualInterestRate){
   
      this.annualInterestRate = annualInterestRate;
   
   }
    
   public double getAnnualInterestRate(){
   
      return annualInterestRate;
   
   }
   
   public double getMonthlyInterestRate(){
      
      return (annualInterestRate / 12);
   
   }
   
   public double getMonthlyInterest(){
   
      return ((annualInterestRate / 12) * balance);   
   }
   
}