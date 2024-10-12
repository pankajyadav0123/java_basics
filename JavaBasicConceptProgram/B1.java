class B1 extends A1{
	static int b = m2();
	static int m2() {
		System.out.println("B: b");
		return 30;
	}
	static {
		System.out.println("B class s loaded");
	}
	public static void main(String[] args) {
		System.out.println("B main");
		System.out.println("B main a: " + a);
		System.out.println("B main b: " + b);
		
	}
}