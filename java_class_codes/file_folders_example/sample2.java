class A {
	static {
		System.out.println("A's static block");
	}
}

class SGGS {
	
	SGGS (float x) {
		System.out.println("SGGS Constructor");
	}
	static {
		System.out.println("SGGS's static block");
	}
	public static void main(String[] args) {
		
		SGGS sggs1 = new SGGS(0.3f);
		A sggs = new A();
	}
}
