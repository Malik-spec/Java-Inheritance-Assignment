class Parent{
	void printing() {
		System.out.println("This is parent class");
	}
}
class Child extends Parent{
	void out() {
		System.out.println("This is child class");
	}
}
public class Q1 {

	public static void main(String[] args) {
		Parent p = new Parent();
		// a. Method of Child class by object of parent class
		p.printing();
		// b. Method of Child class by object of child class
		Child c=new Child();
		c.out();
		// c. Method of parent class by object of child class
		c.printing();
		
	}

}
