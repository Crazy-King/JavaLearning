package test3;
import test3.*;
public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangleA = new Rectangle(5.52, 4.5);
		Triangle triangleA = new Triangle(3.0, 4.0, 5.0);
		Circle circleA = new Circle(2.1);
		
		Rectangle rectangleB = new Rectangle(7.3, 6.5);
		Triangle triangleB = new Triangle(4.0, 4.0, 4.0);
		Circle circleB = new Circle(5.8);
		
		System.out.println("所有面积：" + (rectangleA.getArea() + rectangleB.getArea() + triangleA.getArea() + triangleB.getArea()
											+ circleA.getArea() + circleB.getArea()));
		System.out.println("所有周长：" + (rectangleA.getPerimeter() + rectangleB.getPerimeter() + triangleA.getPerimeter() + triangleB.getPerimeter()
		+ circleA.getPerimeter() + circleB.getPerimeter()));
		
	}

}
