import java.util.*;
class Swapp
{
 public static void main(String args[])
 {
 System.out.println("Enter values of x and y");
 Scanner sc = new Scanner(System.in);
 
 int x = sc.nextInt();
 int y = sc.nextInt();
 System.out.println("before swapping:"+x+" "+y);
 x = x-y;
 y = x+y;
 x = y-x;
 System.out.println("After swapping:"+x+" " +y);
 }
 }