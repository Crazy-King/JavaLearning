package test3;
import java.lang.Math;

public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;
	
	public Triangle(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		if ((sideA + sideB < sideC) || (sideA + sideC < sideB)
				|| (sideC + sideB < sideA) || (sideA <= 0 || sideB <= 0 || sideC <= 0)){
			System.out.println("Please reset your three sides!");
		}
	}
	
	public double getPerimeter(){
		if ((this.sideA + this.sideB < this.sideC) || (this.sideA + this.sideC < this.sideB)
				|| (this.sideC + this.sideB < this.sideA) || (this.sideA <= 0 || this.sideB <= 0 || this.sideC <= 0)){
			System.out.println("Error！");
			return 0;
		} else {
			return this.sideA + this.sideB + this.sideC;
		}
	}
	
	public double getArea(){
		if ((this.sideA + this.sideB < this.sideC) || (this.sideA + this.sideC < this.sideB)
				|| (this.sideC + this.sideB < this.sideA) || (this.sideA <= 0 || this.sideB <= 0 || this.sideC <= 0)){
			System.out.println("Error！");
			return 0;
		} else {
			double p = (this.sideA + this.sideB + this.sideC) / 2.0;
			return Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));
		}
	}
	
	
	public double getSideA() {
		return sideA;
	}
	public void setSideA(double sideA) {
		this.sideA = sideA;
	}
	public double getSideB() {
		return sideB;
	}
	public void setSideB(double sideB) {
		this.sideB = sideB;
	}
	public double getSideC() {
		return sideC;
	}
	public void setSideC(double sideC) {
		this.sideC = sideC;
	}
	
	
	
	

	
}
