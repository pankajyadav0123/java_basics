
class B4 extends A4{
	static int b = 20;
	int y = 40;


	B4(){

		System.out.println("B4 cons..." + super.m1() + this.y);
		y = 6;
	}
	
	public static void main(String[] args) {
		B4 b4 = new B4();
		System.out.println(a);
		System.out.println(b);
		System.out.println(b4.x);
		System.out.println(b4.y);
	}
}
