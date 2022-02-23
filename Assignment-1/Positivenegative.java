import java.util.Scanner;
public class Positivenegative{
 public static void main(String args[]){
     int num;
	 System.out.println("Enter a number:");
	 Scanner sc = new Scanner(System.in);
	 num = sc.nextInt();
	 
	 if(num>0){
	   System.out.println("Positive");
	  
	  }else if(num>0){
	    System.out.println("Negative");
	   }else{
	     System.out.println("Neither negative nor positive ");
		 }
	}
}	
		