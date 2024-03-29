package shape;

public class Square extends Shape{
	
	float side = 0;
	
	public Square(float x) {
		side = x;
	}
	public float area() {
		return side*side;
	}
	public float perimeter() {
		return side*4;
	}
}
