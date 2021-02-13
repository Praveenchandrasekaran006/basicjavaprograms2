package basicprogramstwo;
import java.util.*;
import java.io.*;

public class ConcatTwoStrings {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string 1:  ");
		String str_1 = input.nextLine();
		System.out.println("Enter the string 2:  ");
		String str_2 = input.nextLine();
		
		String str_3 = str_1+" "+str_2;
		System.out.println("the concatenated string is:  "+str_3);
	}
}
