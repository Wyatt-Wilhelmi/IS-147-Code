//Wyatt Wilhelmi
//wyattw1@umbc.edu
//The purpose of this class is to calculate the area and perimeter of a rectangle.

public class ExamRectangle{

   public static void main(String[] args){
   
   Rectangle rectangle1 = new Rectangle();
   
   rectangle1.setWidth (2);
   rectangle1.setHeight (2);
   
   print(rectangle1);
   
   Rectangle rectangle2 = new Rectangle();
   
   rectangle2.setWidth (3);
   rectangle2.setHeight (4);
   
   print(rectangle2);
   
   Rectangle rectangle3 = new Rectangle();
   
   rectangle3.setWidth (5);
   rectangle3.setHeight (6);
   
   print(rectangle3);
   }
   public static void print(Rectangle r){
   
      System.out.println("Area: " + r.getArea());
      System.out.println("Perimeter: " + r.getPerimeter());
   }


}