package shape;

public class Triangle extends Shape {
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
	
	
	@Override
	public double getPerimeter() {
		if ((this.sideA + this.sideB < this.sideC) || (this.sideA + this.sideC < this.sideB)
				|| (this.sideC + this.sideB < this.sideA) || (this.sideA <= 0 || this.sideB <= 0 || this.sideC <= 0)){
			System.out.println("Error！");
			return 0;
		} else {
			return this.sideA + this.sideB + this.sideC;
		}
	}

	@Override
	public double getArea() {
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(sideA);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sideB);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sideC);
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
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(sideA) != Double.doubleToLongBits(other.sideA))
			return false;
		if (Double.doubleToLongBits(sideB) != Double.doubleToLongBits(other.sideB))
			return false;
		if (Double.doubleToLongBits(sideC) != Double.doubleToLongBits(other.sideC))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Triangle [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]";
	}

}
