package basicprogramstwo;
import java.util.*;
import java.io.*;
public class CallByValueOne {
	
	public static void change(int num)
	{
		num = num-1;
	}
	
	public static void changeArray(int arr_size,int arr[])
	{
		for(int iterator=0; iterator<arr_size; iterator++)
		{
			arr[iterator] = -1;
		}
	}
	
	public static void changeString(String str)
	{
		char char_array[] = str.toCharArray();
		for(int iterator = 0; iterator < char_array.length; iterator++)
		{
			char_array[iterator] = 'a';
		}
		str = new String(char_array);
	}
	
	public static void main(String args[])
	{
		//for basic datatypes
		
		System.out.println("Enter an integer :  ");
		Scanner input = new Scanner(System.in);
		while(!input.hasNextInt()) //input validation
		{
			System.out.println("not a valid input...");
			System.out.println("expecting an integer...");
			System.out.println("Enter an integer:  ");
			input.next();
		}
		int num = input.nextInt();
		int temp = num;
		
		change(num);
		if(temp == num)
		{
			System.out.println("call by value");
		}
		else
		{
			System.out.println("call by reference");
		}
		System.out.println();
		
		//for arrays
		
		System.out.println("Enter the size of an array :  ");
		
		while(!input.hasNextInt())
		{
			System.out.println("not a valid input...");
			System.out.println("expecting an integer...");
			System.out.println("Enter an integer:  ");
			input.next();
		}
		int arr_size = input.nextInt();
		int arr[] = new int[arr_size];
		int temp_array[] = new int[arr_size];
		
		System.out.println("Enter the array elements:  ");
		for(int iterator=0; iterator<arr_size; iterator++)
		{
			while(!input.hasNextInt())
			{
				System.out.println("not a valid input...");
				System.out.println("expecting an integer...");
				System.out.println("Enter the elements of the array:  ");
				iterator = 0;
				input.next();
			}
			arr[iterator] = input.nextInt();
			temp_array[iterator] = arr[iterator];
		}
		
		changeArray(arr_size,arr);

		if(arr[0] != temp_array[0])
		{
			System.out.println("Call by reference");
		}
		else
		{
			System.out.println("call by value");
		}
	
		System.out.println();
		
		// for strings
		
		System.out.println("Enter the string:  ");
		Scanner input1 = new Scanner(System.in);
		String str_1 = input1.nextLine();
		int str_len = str_1.length();
		
		char charArray_1[] = str_1.toCharArray();
		char charArray_2[] = new char[str_len];
		
		//copying the str_1 to str_2
		for(int iterator = 0; iterator < str_len; iterator++)
		{
			charArray_2[iterator] = charArray_1[iterator];
		}
		String str_2 = new String(charArray_2);
		
		changeString(str_1);

		if(str_1 == str_2)
		{
			System.out.println("Call by value");
		}
		else
		{
			System.out.println("call by reference");
		}
		System.out.println();
		
				
	}
}
