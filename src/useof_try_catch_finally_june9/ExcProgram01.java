package useof_try_catch_finally_june9;

public class ExcProgram01
{
public int m1(int a) 
{
System.out.println("m1 started");
while(a==5) 
{ 
try 
{
++a;
//return 10;
// break;
//continue;
}
finally 
{
// break; //continue;
}
}
return 20;

}

public static void main(String[] args) 
{ 
   ExcProgram01 e3=new ExcProgram01(); 
   System.out.println(e3.m1(5));
}

}
