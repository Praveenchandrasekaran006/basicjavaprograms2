package basicprogramstwo;
import java.util.*;
import java.io.*;

public class CallByValueTwo extends StudentDetails {
	
	public static void changeStringArray(int str_arr_size,String str[])
	{
		for(int iterator = 0; iterator<str_arr_size; iterator++)
		{
			str[iterator] = "a";
		}
	}
	
	public static void changeCustomObject(StudentDetails ref_var)
	{
		ref_var.id = 0;
		ref_var.name = "a";
	}
	
	public static void main(String args[])
	{
		//for custom objects
		
        StudentDetails ref_var = new StudentDetails();
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Enter student id:  ");
		ref_var.id = input1.nextInt();
		int temp1 = ref_var.id;
		
		System.out.println("Enter student name:  ");
		Scanner input = new Scanner(System.in);
		ref_var.name = input.nextLine();
		
		changeCustomObject(ref_var);
		
		if(temp1 == ref_var.id)
		{
			System.out.println("call by value");
		}
		else
		{
			System.out.println("call by Reference");
		}
		System.out.println();
		
		//for string array
		
		System.out.println("Enter the size of the string array:  ");
		String temp = input.nextLine();
		int str_arr_size = Integer.parseInt(temp);
		
		String str[] = new String[str_arr_size];
		String str1 []= new String[str_arr_size]; 
		
		System.out.println("Enter the strings:  ");
		for(int iterator = 0; iterator<str_arr_size; iterator++)
		{
			str[iterator] = input.nextLine();
			str1[iterator] = str[iterator];
		}
		
		changeStringArray(str_arr_size,str);
		
		if(str[0].compareTo(str1[0]) == 0)
		{
			System.out.println("call by value");
		}
		else
		{
			System.out.println("call by reference");
		}
		
				
	}

}
