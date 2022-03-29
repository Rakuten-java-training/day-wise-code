class A extends B {
//	@Override
	public static void m1() {
//		m1();
		for(;;)
		System.out.println("A m1");
	}
}

class B {
	public static void m1() {
		System.out.println("B m1");
		throw new RuntimeException();
	}
}

public class Quiz1 {
	public static void main(String[] args) {
//		B a = new A();
//		a.m1();
		A a1 =new A();
		a1.m1();
	}
}
