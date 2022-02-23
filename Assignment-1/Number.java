public class Number{
   public static void main(String[] args){
      int my_num = 0;
      System.out.println("The numbers without using loop have been printed below");
      print_without_loop(my_num);
   }
   public static void print_without_loop(int my_num){
      if(my_num <= 10){
         System.out.print(my_num +",");
         print_without_loop(my_num + 1);
      }
   }
}