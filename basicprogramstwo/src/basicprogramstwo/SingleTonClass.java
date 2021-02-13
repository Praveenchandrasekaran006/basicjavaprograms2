package basicprogramstwo;
import java.util.*;
import java.io.*;
public class SingleTonClass {
   public static void main(String args[])
   {
	   SingleTonClassOne ref_var = SingleTonClassOne.getInstance();
	   System.out.println("The singleton class instance values are: ");
	   System.out.println(ref_var);
	  
   }
}