class Rectangle{
	int length;
	int breadth;
	
	Rectangle(int l, int b){
		length = l;
		breadth = b;
		
	}
	
	void printArea() {
		System.out.println("The Area is : " + length*breadth);
	}
	void printPreimeter() {
		System.out.println("The Perimeter is :" +(length+breadth));
		
	}
}

class Square extends Rectangle{
	
	Square(int s){
		super(s,s);
	}
}
public class Q3 {

	public static void main(String[] args) {
	//Area and Perimeter of Rectangle of length 5 and breadth 9
		Rectangle r=new Rectangle(5,9);
		r.printArea();
		r.printPreimeter();
		
		//Area and Perimeter of a Square of side 6
		Square sq=new Square (6);
		sq.printArea();
		sq.printPreimeter();
	}

}
