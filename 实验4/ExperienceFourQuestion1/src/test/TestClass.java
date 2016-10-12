package test;
import java.util.ArrayList;

import shape.*;

public class TestClass {
	
	public static void main(String[] args) {
		Rectangle rectangleA = new Rectangle(5.52, 4.5);
		Triangle triangleA = new Triangle(3.0, 4.0, 5.0);
		Circle circleA = new Circle(2.1);
		
		ArrayList<Shape> shapeList = new ArrayList<Shape>();
		shapeList.add(rectangleA);
		shapeList.add(triangleA);
		shapeList.add(circleA);
		
		double allPerimeter = 0.0;
		double allArea = 0.0;
		
		for (int i = 0; i < shapeList.size(); i++) {
			allPerimeter += shapeList.get(i).getPerimeter();
			allArea += shapeList.get(i).getArea();
		}
		System.out.println("所有面积：" + allArea);
		System.out.println("所有周长：" + allPerimeter);
		
	}

}
