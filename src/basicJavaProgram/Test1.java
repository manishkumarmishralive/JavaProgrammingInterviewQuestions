package basicJavaProgram;

public class Test1 {

	public static void main(String[] args) {
		Base1 obj = new Base1();
		obj.start();

		// if Parent class reference variable refer child class object--this is
		// called run time polymorphism
		Base1 obj1 = new Derived1();
		obj1.start();

		Derived1 obj2 = new Derived1();
		obj2.start();

	}

}
