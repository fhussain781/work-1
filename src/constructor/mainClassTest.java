package constructor;

public class mainClassTest {
	
	public mainClassTest() {
		System.out.println("Default");
	}
	public mainClassTest(int x) {
		System.out.print(x);
	}
	public mainClassTest(String C, int e){
		System.out.println(C+e);
}
	
	public static void count(String q, int e) {
		System.out.print(q+e);
	}
	public static void count2() {
		System.out.print("hello");
	}
	public static void count3(int e) {
		System.out.print(e);
	}
}

