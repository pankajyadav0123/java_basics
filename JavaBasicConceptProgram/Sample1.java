class Sample1 extends Example1{
	static int b = m3();
	
	static int m3() {
		System.out.println("Sample static variable is created");
		return 30;
	}
	static {
		System.out.println("Sample SB");
	}
	int y = m4();
	
	int m4() {
		System.out.println("Sample Non static variable is created");
		return 50;
	}
	Sample1(){
		System.out.println("Sample cons...");
	}
	
	void abc() {
		System.out.println("Sample abc");
	}
	
	public static void main(String[] args) {
		System.out.println("Sample main");
		Sample1 s1 = new Sample1();
                Example1 s2 = new Example1();
	    s1.abc();
	    s1.bbc();
            s2.abc();
            

	}
	
}
