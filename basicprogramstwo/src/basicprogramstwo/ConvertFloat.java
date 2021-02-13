package basicprogramstwo;
import java.util.*;
import java.io.*;

public class ConvertFloat {
	
	public static void main(String args[])
	{
		System.out.println("Enter a float value:");
		
		Scanner input = new Scanner(System.in);
		while(!input.hasNextFloat())
		{
			System.out.println("Not a valid input..");
			System.out.println("expecting an integer..");
			System.out.println("Enter a number..");
			input.next();
		}
		float val = input.nextFloat();
		
		Double output = Double.valueOf(val);
		
		System.out.println("the double value is: ");
		System.out.println(output);
		
		Float ref_var = new Float(val);
		int output1 = ref_var.intValue(); 
		
		System.out.println("The integer value is:  ");
		System.out.println(output1);
		
	}

}
