public class A1 {
	static int a =m1(); //SV
	static int m1() { //SM
		System.out.println("A:a" );
		return 10;
	}
	static {  //SB
		System.out.println("A class is loaded");
	}
	public static void main(String[] args) {
		System.out.println("A main");
		System.out.println(a);
		
	}

}