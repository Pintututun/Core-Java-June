package exception_handling_program_june6;

import java.io.FileNotFoundException;

public class A60 {
	public static void main(String[] argv) throws Exception 
    {
          try 
          {
                 throw new FileNotFoundException("");
          } 
			 catch (FileNotFoundException ex) 
            {
                 System.out.println("book list not found!");
                 throw ex;
            }
    }
}
