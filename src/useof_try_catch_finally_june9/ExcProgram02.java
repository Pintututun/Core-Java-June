package useof_try_catch_finally_june9;

public class ExcProgram02 
{
public int m1(int a)
{
while(a==5)
{
try
{
  try 
  {
    a=10;
  }

finally 
{ 
a=20;
} 
a=30;
return a;
}
finally 
{ 
if(a==30) 
{
continue;
}
}
}
return 40;
}
 
public static void main(String[] args) 
{ 
   ExcProgram02 e4=new ExcProgram02(); 
   System.out.println(e4.m1(5));
}
}
