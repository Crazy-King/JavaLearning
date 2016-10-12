package test3;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double length, double width){
		this.length = length;
		this.width = width;
		if(length <= 0 || width <= 0){
			System.out.println("Please set right length and width!");
		}
	}
	
	public double getPerimeter(){
		if(this.length <= 0 || this.width <= 0){
			System.out.println("Please reset your length and width!");
			return 0;
		}
		else {
			return (this.length + this.width) * 2.0;
		}
	}
	public double getArea(){
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
}
