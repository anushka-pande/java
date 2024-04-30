abstract class Myclass {
	abstract void calculate(double x);
}
class Sub1 extends Myclass {
	void calculate(double x) {
		System.out.println("Square = " + (x * x));
	}
}
class Sub2 extends Myclass {
	void calculate(double x) {
		System.out.println("Square Root = " + Math.sqrt(x));
	}
}
class Sub3 extends Myclass {
	void calculate(double x) {
		System.out.println("Cube = " + (x * x * x));
	}
}
class Main {
	public static void main(String[] args) {
		Myclass ref;
		
		Sub1 obj1 = new Sub1();
		Sub2 obj2 = new Sub2();
		Sub3 obj3 = new Sub3();
		
		ref = obj1;
		ref.calculate(3);
		
		ref = obj2;
		ref.calculate(9);
		
		ref = obj3;
		ref.calculate(3);
		
		/*
		Sub1 obj1 = new Sub1();
		Sub2 obj2 = new Sub2();
		Sub3 obj3 = new Sub3();
		
		obj1.calculate(3);
		obj2.calculate(3);
		obj3.calculate(3);
		*/
	}
}
