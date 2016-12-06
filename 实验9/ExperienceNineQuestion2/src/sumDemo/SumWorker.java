package sumDemo;

public class SumWorker implements Runnable{
	
	private long sum;
	private int start;
	private int end;
	
	public SumWorker(int start, int end) {
		// TODO Auto-generated constructor stub
		this.start = start;
		this.end = end;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = this.start; i <= this.end; i++) {
			this.sum += i;
		}
		
	}

	public long getSum() {
		return sum;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public void setEnd(int end) {
		this.end = end;
	}

}
