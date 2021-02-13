package basicprogramstwo;
import java.util.*;
import java.io.*;
public class SystemProperty {
	public static void  main(String args[])
	{
		Properties properties = System.getProperties();
		properties.forEach((k,v) -> System.out.println(k+" : "+v));
	}
}
