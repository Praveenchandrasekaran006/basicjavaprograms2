package basicprogramstwo;
import java.util.*;
import java.io.*;
public class PublicPrivateProtectedDefault{
	public static void main(String args[])
	{
		TestClass ref_var = new TestClass();
		System.out.println("For public access modifier:");
		System.out.println(ref_var.id);
		System.out.println("For protected access modifier:");
		System.out.println(ref_var.marks);
		System.out.println("For default access modifier:");
		System.out.println(ref_var.stream);
		System.out.println("For private access modifier:");
		//System.out.println(ref_var.name);
	}
}
