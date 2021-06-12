
public class staticDemo {
	static int age;
	
	public static void main(String[] args) {
		System.out.println("MMS ");
		System.out.println("MME ");
	}
	//static block
	static 
	{
		System.out.println("running static block");
		age=50;
	}
	
	static 
	{
		System.out.println("running 3rd SB");
	}
	
	static
	{
		System.out.println("running 2nd SB");
	}
}
