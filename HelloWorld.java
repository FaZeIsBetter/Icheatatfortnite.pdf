import java.util.Scanner;

class SimpleArithmetic
  
{
   public static void main(String[] args)
   {
     
     int a = 1000;
     int b = 8006;
   System.out.println (a+b); 
   System.out.println ("It's over 9000!!!");
     System.out.println("   J    A   V     V   A   ");
     System.out.println("   J   A A   V    V  A A   ");
     System.out.println("J  J  AAAAA   V  V  AAAAA   ");
     System.out.println(" JJ  A     A   V   A     A   ");
     
     Scanner input = new Scanner (System.in);
     System.out.println("Enter the first number:") ;
     int n1 = input.nextInt () ;
     System.out.println("Enter the second number:");
     int n2 = input.nextInt () ;
     System.out.println("The difference of the numbers is ");
     System.out.println(n1-n2);
     //addition?
     //subtraction?
     //multiplication?
     //division?
     //modulus?
   } 
}