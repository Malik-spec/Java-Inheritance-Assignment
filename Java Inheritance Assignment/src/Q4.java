class Rectangle1{
	int length;
	int breadth;
	
	Rectangle1(int l, int b){
		length = l;
		breadth = b;
		
	}
	
	void printArea() {
		System.out.println("The Area of a square of side " + length + "is" +length*breadth);
		
	}
	
		
	}


class Square1 extends Rectangle1{
	
	Square1(int s){
		super(s,s);
	}
}
public class Q4 {

	public static void main(String[] args) {
		// We create an array of 10 different sides of a square and loop it through the square class
		int[]sideOfSquare= {8,9,10,11,12,3,4,5,6,7,};
		for(int i : sideOfSquare) {
			Square sq=new Square(i);
			sq.printArea();
		}
		
	}

}
