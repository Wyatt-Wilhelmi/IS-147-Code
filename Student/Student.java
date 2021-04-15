public class Student{

   private String name;
   private int age;
   private double gpa;
   private static int count=0;
   
   Student(){
   
      count++;
   
   }

   public void setName(String name){
      this.name = name;
   }
   
   public String getName(){
   
   return name;
   
   }
   
   public void setAge(int age){
      this.age = age;
   }
   
   public int getAge(){
   
   return age;
   
   }
   
   public void setGpa(double gpa){
      this.gpa = gpa;
   }
   
   public double getGpa(){
   
   return gpa;
   
   }
}