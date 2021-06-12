
public class StaticDemo2 {

	static int a;
	static int b;
	
	static {
		System.out.println("running static block");
		a=100;
		b=200;
	}
	
	public static void main(String[] args) {
		System.out.println("MMs");
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		System.out.println("MME");
	}
}
