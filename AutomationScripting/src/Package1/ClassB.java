package Package1;

public class ClassB {

	public void method2(int numberinput) {
		if (numberinput < 0) {
			System.out.println("the number is Nagative");
		} else if (numberinput == 0) {
			System.out.println("the number is Zero");
		} else {
			System.out.println("the number is Positive");
		}

	}
public void logic(int numberinput) {
	
	if (numberinput <0 || numberinput > 100) {
		System.out.println("Number is Valid number");
	}
	
	else {
		System.out.println("this is invalid number");
	}
}
	
}
