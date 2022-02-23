import java.util.Scanner;
public class Sum{
   public static void main(String args[]){
      int my_input, my_result;
      System.out.println("Required packages have been imported");
      Scanner my_scanner = new Scanner(System.in);
      System.out.println("A reader object has been defined ");
      System.out.print("Enter the number : ");
      my_input = my_scanner.nextInt();
      my_result = digitSum(my_input);
      System.out.println("The Sum of digits of " + my_input + " is " + my_result);
   }
   static int digitSum(int n){
      if (n == 0)
         return 0;
      return (n % 10 + digitSum(n / 10));
   }
}