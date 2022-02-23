import java.util.Scanner;
public class Factr1{
   public static int factorial(int i){
    if(i<=1){
	   return 1;
	        }
	else{
	   return 1 * factorial(i-1);
	     }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
    int i = sc.nextInt();
    System.out.println("Factorial is :"+factorial(i));
   }
}
   