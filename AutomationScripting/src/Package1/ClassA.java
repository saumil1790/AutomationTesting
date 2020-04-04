package Package1;

import package2.ClassC;

public class ClassA {

	static final int a = 7;

	public void method1() {

		System.out.println("This is testing method ");

	}

	public static void main(String[] args) {
		int s;
		int t;
		ClassA A = new ClassA();
		ClassB B = new ClassB();
		ClassC C = new ClassC();
		A.method1();
		B.method2(-11);
		C.method3();
		s = C.sum(1, 100);
		t = C.sub(10, 5);
		C.mul(s, t);
		B.logic(50);
	}
}
