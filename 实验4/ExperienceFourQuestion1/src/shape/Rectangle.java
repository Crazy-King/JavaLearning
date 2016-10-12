package shape;

public class Rectangle extends Shape {
	private double length;
	private double width;
	
	public Rectangle(double length, double width){
		this.length = length;
		this.width = width;
		if(length <= 0 || width <= 0){
			System.out.println("Please set right length and width!");
		}
	}
	
	@Override
	public double getPerimeter() {
		if(this.length <= 0 || this.width <= 0){
			System.out.println("Please reset your length and width!");
			return 0;
		}
		else {
			return (this.length + this.width) * 2.0;
		}
	}

	@Override
	public double getArea() {
		if(this.length <= 0 || this.width <= 0){
			System.out.println("Please reset your length and width!");
			return 0;
		}
		else {
			return this.length * this.width;
		}
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(length);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
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
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

	
	
}
