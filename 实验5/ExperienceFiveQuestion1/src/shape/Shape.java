package shape;


public abstract class Shape implements Comparable<Object>{
	public final static double PI = 3.1415926;
	abstract public double getPerimeter();
	abstract public double getArea();
	
	@Override
	public int compareTo(Object o) {
		Shape a = (Shape)o;
		if (this.getArea() > a.getArea()) {
			return 1;
		}else if (this.getArea() == a.getArea()) {
			return 0;
		}else {
			return -1;
		}
		
	}
}
