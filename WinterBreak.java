// Wyatt Wilhelmi, Prof. Mathews, 2/4/2021 Winter Break

   // Task 1 The input number1 is multiplied by 1.8 and then 32 is added to that to convert the input from celcius to fahrenheit
import java.util.Scanner;

public class WinterBreak{
   
   public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);
   
   System.out.println("Enter the temperature in celcius");
      double number1 = input.nextDouble();
      
   double number2 = (number1 * 1.8) + 32;
   
   System.out.println("The temperature in Fahrenheit is:" +number2);
   
   // Task 2 The input meters1 is multiplied by 3.281 to convert it to feet
   
   System.out.println("Enter the distance in meters");
      double meters1 = input.nextDouble();
   
   double feet1 = meters1 * 3.281;
   
   System.out.println("The distance in feet is:" +feet1);
   
   // Task 3 The input distance1 is divided by the input mpg1 and then all of that is multiplied by the input price1
   
   System.out.println("Enter the distance of the drive");
      double distance1 = input.nextDouble();
   
   System.out.println("Enter the mpg of the car");
      double mpg1 = input.nextDouble();
      
   System.out.println("Enter the price per gallon");
      double price1 = input.nextDouble();
      
   double cost1 = (distance1 / mpg1) * price1;
   
   System.out.println("The cost of the trip is:" +cost1);
   
   // Task 4 The input distance1 is reused from above and is then divided by 55 to give the time spent traveling or traveltime1. Then, the total time of the trip which is four days or 96 hours is subtracted by traveltime1 and then divided by 24 to give the total time left after traveling 
   
   double traveltime1 = distance1 / 55;
   
   System.out.println("The travel time in hours is:" +traveltime1);
   
   double vacatime1 = (96 - traveltime1) / 24;
   
   System.out.println("Vacation time left in days is:" +vacatime1);
   
   }

}
