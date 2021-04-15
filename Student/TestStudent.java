public class TestStudent{

   public static void main(String[] args){
   
      Student student1 = new Student();
      
      student1.setName ("John");
      student1.setAge  (25);
      student1.setGpa  (4.0);
      
      print(student1);
        
   }
   
   public static void print(int i){
   
      i = 20;
      System.out.println(i);
   
   }

   public static void print(Student s){
   
      System.out.println(s.getName());
      System.out.println(s.getAge());
      System.out.println(s.getGpa());
      
      }
}