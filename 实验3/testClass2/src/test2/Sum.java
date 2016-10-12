package test2;

public class Sum {
	private int begin;
	private int end;
	private int sum;
	
	
	
	public int getBegin() {
		return begin;
	}
	public void setBegin(int begin) {
		this.begin = begin;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getSum(int begin, int end) {
		this.begin = begin;
		this.end = end;
		int sum = 0;
		if (begin > end) {
			System.out.println("Wanning! Wrong begin and end.");
			this.sum = sum;
			return 0;
		} else {
			for (int i = begin; i < end + 1; i++) 
				sum += i;
		}
		this.sum = sum;
		return sum;
	}
	
}
