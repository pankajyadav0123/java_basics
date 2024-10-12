public class Example1 {
	static int a = m1();
	static {
		System.out.println("Example SB");
	}
	int x = m2();
	Example1(){
		System.out.println("Example Cons...");
	}
	static int m1() {
		System.out.println("Example static variable is created");
		return 10;
	}
	int m2() {
		System.out.println("Example Non static variable is created");
		return 20;
	}
	
	void abc() {
		System.out.println("Example abc");
	}
	void bbc() {
		System.out.println("Example bbc");
	}

}