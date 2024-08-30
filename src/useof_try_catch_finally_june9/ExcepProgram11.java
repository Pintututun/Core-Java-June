package useof_try_catch_finally_june9;

public class ExcepProgram11 {

		public static void main(String[] args) 
		{ 
		   System.out.println("main start"); 
		   System.out.println(m1(5)); 
		   System.out.println("main end");
		}
		private static int m1(int a) 
		{
		   while(a==5) 
		   {
		     try 
		     {
		        return 10;
		     }
		     finally 
		     { 
		     continue;
		    } 
		}
		return 20;
		}
}
