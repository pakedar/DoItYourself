import java.util.Scanner;
public class Factrecursion{
   public static int factorial(int i){
     if(i<=1)
	   return 1;
	   }
	   return 1* factorial(i-1);
	}
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int i = sc.nextInt();
   System.out.println("Factorial is :"+factorial(i));
   }
   