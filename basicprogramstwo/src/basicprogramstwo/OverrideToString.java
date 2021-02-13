package basicprogramstwo;
import java.util.*;
import java.io.*;
public class OverrideToString extends StudentDetails{
	
	
	public static void main(String args[])
	{
		
		StudentDetails ref_var = new StudentDetails();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter student id:  ");
		String str = input.nextLine();
		ref_var.id = Integer.parseInt(str);
		
		System.out.println("Enter student name:  ");
		ref_var.name = input.nextLine();
		
		System.out.println(ref_var);
		
	}

}
