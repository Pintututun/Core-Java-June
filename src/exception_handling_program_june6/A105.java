package exception_handling_program_june6;

public class A105 {
	static String s = "-";
    public static void main(String[] args) 
    {
          try 
          {
               throw new Exception();
          } 
          catch (Exception e) 
          {
               try 
               {
                    try 
                    {
                         throw new Exception();
                    } 
                    catch (Exception ex)
                    {
                         s += "ic ";
                    }
                    throw new Exception();
                } 
                catch (Exception x) 
                {
                     s += "mc ";
                } 
                finally 
                {
                     s += "mf ";
                }
          } 
          finally 
          {
                s += "of ";
          }
          System.out.println(s);
   }
}
