package string_type_july1;

public class StringHandling19 {
	public static void main(String[] args) {
		String str = "Naresh I Technologies";
		for(int i=0;i<str.length();i++) 
		{
			for(int j=i+1;j<str.length();++j) 
			{
				if(str.charAt(i)==str.charAt(j))
					System.out.print(str.charAt(j));
			}
		}
	}
}
