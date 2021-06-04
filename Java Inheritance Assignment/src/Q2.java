class Member{
	String name;
	int age;
	String phoneNumber;
	String address;
	double salary;
	
	void printSalary() {
		System.out.println("name + has a salary of " +salary );
	}
}

class Employee extends Member{
	String specialization;
	String department;
	
	
}

class Manager extends Member{
	String specialization;
	String department;
	
}
public class Q2 {

	public static void main(String[] args) {
		//Object of Employee
		Employee e=new Employee();
		e.name="Malik Ahmed";
		e.age= 26;
		e.phoneNumber="0271832773";
		e.address="EA-2200-234";
		e.salary=2000;
		e.printSalary();
		
		//Object of Manager
		Manager m =new Manager();
		m.name="Amalitech";
		m.age=55;
		m.phoneNumber="0246089865";
		m.address="AS-2234-776";
		m.salary=200000;
		m.printSalary();
				
		
		
		
	}

}
