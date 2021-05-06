public class ReverseArray{


   public static void main(String[] args){
      int[] list = {1, 2, 3, 4, 5, 6};
      int[] result = new int [list.length];
      
      for (int i=0; i < list.length; i++){
         System.out.println(list[i]);
         }
         
       System.out.println();
       
       for (int i = 0, j = result.length - 1; 
         i < list.length; i++, j--) {
         result[j] = list[i];
       }
       
       for (int i = 0; i < result.length; i++){
         System.out.print(result[i]);
       }
     }
   }