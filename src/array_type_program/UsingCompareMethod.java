package array_type_program;

import java.util.Arrays;

public class UsingCompareMethod {
public static void main(String[] args) {
	int arr1[]= {100,210,300,400};
	System.out.println(arr1);
	int arr2[]= {100,220,300,400};
	System.out.println(Arrays.compare(arr1,arr2));
	int arr3[]= {100,320,400,500};
	int arr4[]= {100,300,400,500};
	System.out.println(Arrays.compare(arr3, arr4));
}
}
