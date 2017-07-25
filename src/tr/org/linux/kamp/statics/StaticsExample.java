package tr.org.linux.kamp.statics;

public class StaticsExample {
	
	public static String myStaticString = "bu bir static string";
	
	public static String myStaticStringMethod() {
		return "bu bir static metod";
		
	}
	static {
		
		System.out.println("bu bir static blok");
		
	}
	static {
		System.out.println("bu da bir statik blok");
		
	}
	static {
		int x=5;
		System.out.println(x);
		System.out.println("bu da bir statik bloktur");
		
	}
	

}
