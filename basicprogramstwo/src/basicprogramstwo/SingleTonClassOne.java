package basicprogramstwo;

class SingleTonClassOne {
	static SingleTonClassOne ref_var = new SingleTonClassOne();
	static int id = 10;
	static String name = "praveen";
	private SingleTonClassOne()
	{
		
	}
	public static SingleTonClassOne getInstance()
	{
		return ref_var;
	}
	public String toString()
	{
		return "Student[id = "+id+", name = "+name+"]";
	}
}
