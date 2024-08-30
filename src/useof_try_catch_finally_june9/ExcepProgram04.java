package useof_try_catch_finally_june9;

public class ExcepProgram04
{
public static void main(String[] args) 
{ 
  System.out.println(1);
  try 
  {
     System.out.println(2); 
     System.out.println(3); 
     System.out.println(4/0);
 
//catch(NullPointerException ne) 
   }
  catch(ArithmeticException e) 
  { 
    System.out.println(5); 
    System.out.println(6/0); 
    System.out.println(7);
   }
   System.out.println(8);
}
}
