
public class StaticDemo3 {

	static String name="Dinga";
	
	static void details() {
		
		System.out.println("Name is : "+name);
	}
	
	static
	{
		name="Samba";
		System.out.println("Name is : "+name);
	}
	
	
}
