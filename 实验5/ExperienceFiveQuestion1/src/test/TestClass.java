package test;
import java.util.Arrays;

import shape.*;

public class TestClass {
	
	public static void main(String[] args) {
		Rectangle rectangleA = new Rectangle(5.52, 4.5);
		Triangle triangleA = new Triangle(3.0, 4.0, 5.0);
		Circle circleA = new Circle(2.1);
		
		Shape[] shapes = new Shape[3];
		shapes[0] = rectangleA;
		shapes[1] = triangleA;
		shapes[2] = circleA;
		
		System.out.println("排序前的面积顺序：");
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i].getArea());
		}
		Arrays.sort(shapes);
		System.out.println("排序后：");
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i].getArea());
		}
		
		
	}

}
