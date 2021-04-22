//Wyatt Wilhelmi
//wyattw1@umbc.edu
//The purpose of this class is to calculate the area and perimeter of a rectangle.
public class Rectangle{

   private double width;
   private double height;

Rectangle(){}

    public void setWidth(double width){
   
      this.width = width;
   
   }
    
   public double getWidth(){
   
      return width;
   
   }

   public void setHeight(double height){
   
      this.height = height;
   
   }
    
   public double getHeight(){
   
      return height;
   
   }
   
   public double getArea(){
      
      return width * height;
       
   }
   
   public double getPerimeter(){
   
      return ((2*width)+(2*height));
   
   }
   
}