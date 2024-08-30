package array_type_program_june19;

import java.util.Arrays;

public class RemoveDuplicateUsingSingleLoop {
public static void main(String[] args) {
	int[] arr= {1,1,1,2,2,4,5,5,6,6,7,8};
	System.out.println(Arrays.toString(del(arr)));
}
public static int[] del(int[] a)
{
	int[] changedArr=new int[a.length];
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	int k,t;
	for( k=0,t=0;k<a.length-1;k++)
	{
		if(a[k]!=a[k+1])
		{
			changedArr[t]=a[k];
			t++;	
		}
		
	}
	changedArr[t]=a[a.length-1];
	int[] new_array=Arrays.copyOf(changedArr,t+1);
	
	return new_array;
}
}
