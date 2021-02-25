import java.util.Scanner;

public class WWExamQuestionTwo{
   
   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
   
   System.out.println("Enter your year of birth:");
   double year = input.nextDouble();
   
   System.out.println("Enter the month you were born:");
   double month = input.nextDouble();
   int myMonth = (int) month;
   
   System.out.println("Enter the day you were born:");
   double day = input.nextDouble(); 
   int myDay = (int) day;
   
   double yearOverMonth = year / month;
   
   System.out.println("Your birth year divided by your birth month is " +yearOverMonth);

   int monthOverDay = myDay % myMonth;
   
   System.out.println("The remainder of your birth day divided by your birth month is: " +monthOverDay);
   
   }
}   