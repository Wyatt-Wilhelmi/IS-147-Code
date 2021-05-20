//Wyatt Wilhelmi

import java.util.Scanner;

public class FinalExamWW{

   static double[] array(){
   
      double[] scores = new double[10];
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter " + scores.length + " values: ");
   
      for (int i = 0; i < scores.length; i++){ 
         scores[i] = input.nextDouble();
         }
         return scores;
     }

   static void sum(double[] scores){
   
      double total = 0;
      
      for (int i = 0; i < scores.length; i++) {
         total += scores[i];
      }
    System.out.println("The total is: " + total);
    }
    
   static void largest(double[] scores){
      
      double max = scores[0];
      for (int i = 1; i < scores.length; i++) {
         if (scores[i] > max) 
         max = scores[i];  
        }
        
      System.out.println("The largest number is: " + max);
      
   }
   
   static void smallest(double[] scores){
      
      double min = scores[0];
      for (int i = 1; i < scores.length; i++) {
         if (scores[i] < min) 
         min = scores[i]; 
          
        }
        
      System.out.println("The largest number is: " + min);
      
   }   
   static void check(double[] scores) {
   
   double constant = 0;
   
   for (int i = 1; i < scores.length; i++) {
         if (scores[i] == 4) 
         constant++;  
         
        }
        
      if (constant == 0){
      System.out.println("Number 4 not found");
      }
   else
   
      System.out.println("Number 4 found");
   }
   
   static void remove(double[] scores){
      
      for (int i = 1; i < scores.length; i++) {
         if (scores[i] == 6) 
         scores[i] = scores[i+1]; 
          
        }
        
      for (double newArray: scores) {
         System.out.println(newArray);
         }
      
   }
   
   static void newScores(double[] scores){
   
  int newArrayLength = 0; 
  
  for (int i = 1; i < scores.length; i++){
  
       if(scores[i] != 6){
           newArrayLength++;
       }
   }
   
   double[] newScores = new double[newArrayLength];
   
   for (int i = 1; i < newScores.length; i++){
   
       if(scores[i] != 6){
           newScores[i] = scores[i];
    }
 }
    for (double newArray: newScores) {
         System.out.println(newArray);
    }
 }   
   public static void main(String[] args){
   
      double[] scores = array();
      
      sum(scores);
      largest(scores);
      smallest(scores);
      check(scores);
      newScores(scores);
   }
   
   
         
}