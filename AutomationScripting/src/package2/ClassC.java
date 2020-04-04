package package2;

public class ClassC {

	public ClassC() {

		System.out.println("welcome");
	}

	public void method3() {

		System.out.println("call of method3");

	}

	public int sum(int a, int b) {

		int sum = a + b;

		// System.out.println(sum);
		return sum;
	}

	public int sub(int a, int b) {
		int sub = a - b;
		// System.out.println(sub);
		return sub;
	}

	public void mul(int a, int b) {

		int mul = a * b;
		System.out.println(mul);

	}
}
