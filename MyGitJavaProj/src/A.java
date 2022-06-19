
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is defualt A.java");
		System.out.println("This line is created by dev_C branch(file A)");
		B b = new B();
		C c = new C();
		b.callB();
		c.callC();
	}

}
