import java.util.Scanner;

public class Weather{

   public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);
   
      System.out.println("What is the temperature");
      int temp = input.nextInt();
      
      if((temp >= 80) && (temp < 95)){
         System.out.println("Swimming");
         }
   
      else if((temp >= 60) && (temp < 80)){
         System.out.println("Tennis");
         }
   
      else if((temp >= 40) && (temp < 60)){
         System.out.println("Golf");
      }
   
      else if((temp < 40) && (temp >20)){
         System.out.println("skiing");
      }
   
      else if((temp >=95) && (temp <=20)){
         System.out.println("Visit our shops!");
      }
   
   
   }

}