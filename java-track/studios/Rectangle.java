
public class Rectangle {
	
	//Properties:
	
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	//length
	//width
	
	//Behaviors:
	
	public int getLength() {
		return this.length;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getArea() {
		return (this.length*this.width);
	}
	
	public int getPerimeter() {
		return((this.length + this.width)*2);		
	}
	
	public boolean compareRectangle(Rectangle other) {
		if (this.getArea() <= other.getArea()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isSquare() {
		if (this.length == this.width) {
			return true;
		} else {
			return false;
		}
	}
	
	//Get Area
	//Get Perimeter
	//Compare area
	//isSquare

	public static void main(String[] args) {
		
		Rectangle myRectangle = new Rectangle(10, 10);
		Rectangle yourRectangle = new Rectangle(15,10);
		System.out.println(myRectangle);
		System.out.println(myRectangle.getArea());
		System.out.println(myRectangle.compareRectangle(yourRectangle));
		System.out.println(myRectangle.isSquare());
		;

	}

}
