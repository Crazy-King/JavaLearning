package shape;

public class Circle extends Shape {
	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
		if (this.radius <= 0) {
			System.out.println("Please set right radius!");
		}
	}
	
//	@Override
//	public int compareTo(Object o) {
//		Circle circle = (Circle) o;
//		double aArea = this.getArea();
//		double bArea = circle.getArea();
//		if(aArea == bArea) 
//			return 0;
//		else if(aArea > bArea) 
//			return -1;
//		else 
//			return 1;
//	}
	
	@Override
	public double getPerimeter() {
		if(this.radius <= 0){
			System.out.println("Please reset your radius!");
			return 0;
		}
		else {
			return 2.0 * radius * Shape.PI;
		}
	}

	@Override
	public double getArea() {
		if(this.radius <= 0){
			System.out.println("Please reset your radius!");
			return 0;
		}
		else {
			return this.radius * this.radius * Shape.PI;
		}
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	

}
