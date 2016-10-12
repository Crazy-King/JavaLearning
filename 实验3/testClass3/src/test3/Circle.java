
package test3;
import java.lang.Math;

public class Circle {
	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
		if (this.radius <= 0) {
			System.out.println("Please set right radius!");
		}
	}
	
	public double getPerimeter(){
		if(this.radius <= 0){
			System.out.println("Please reset your radius!");
			return 0;
		}
		else {
			return 2.0 * radius * Math.PI;
		}
	}
	
	public double getArea(){
		if(this.radius <= 0){
			System.out.println("Please reset your radius!");
			return 0;
		}
		else {
			return this.radius * this.radius * Math.PI;
		}
	}
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
