package inheritance;

public class Test {

	public static void main(String[] args) {
		C c1 = new C();
	}
}
	class A {//extends from object
		A() {
			super();
			System.out.println("1");
		}
	}

	class B extends A {
		B() {
			super();
			System.out.println("2");
		}
	}

	class C extends B {
		C() {
			super();//javac implicitly adds invocation of imidiate super class constr
			System.out.println("3");
		}
	}


