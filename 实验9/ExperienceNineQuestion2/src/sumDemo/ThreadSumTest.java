package sumDemo;

public class ThreadSumTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//10个线程
		SumWorker sumWorker1 = new SumWorker(0, 10000000);
		SumWorker sumWorker2 = new SumWorker(10000001, 20000000);
		SumWorker sumWorker3 = new SumWorker(20000001, 30000000);
		SumWorker sumWorker4 = new SumWorker(30000001, 40000000);
		SumWorker sumWorker5 = new SumWorker(40000001, 50000000);
		SumWorker sumWorker6 = new SumWorker(50000001, 60000000);
		SumWorker sumWorker7 = new SumWorker(60000001, 70000000);
		SumWorker sumWorker8 = new SumWorker(70000001, 80000000);
		SumWorker sumWorker9 = new SumWorker(80000001, 90000000);
		SumWorker sumWorker0 = new SumWorker(90000001, 100000000);
		
		Thread sum1 = new Thread(sumWorker1);
		Thread sum2 = new Thread(sumWorker2);
		Thread sum3 = new Thread(sumWorker3);
		Thread sum4 = new Thread(sumWorker4);
		Thread sum5 = new Thread(sumWorker5);
		Thread sum6 = new Thread(sumWorker6);
		Thread sum7 = new Thread(sumWorker7);
		Thread sum8 = new Thread(sumWorker8);
		Thread sum9 = new Thread(sumWorker9);
		Thread sum0 = new Thread(sumWorker0);
		
		sum1.start();
		sum2.start();
		sum3.start();
		sum4.start();
		sum5.start();
		sum6.start();
		sum7.start();
		sum8.start();
		sum9.start();
		sum0.start();
		
		sum1.join();
		sum2.join();
		sum3.join();
		sum4.join();
		sum5.join();
		sum6.join();
		sum7.join();
		sum8.join();
		sum9.join();
		sum0.join();
		
		long allSum = sumWorker0.getSum() + sumWorker1.getSum() + sumWorker2.getSum() +
					sumWorker3.getSum() + sumWorker4.getSum() + sumWorker5.getSum() + 
					sumWorker6.getSum() + sumWorker7.getSum() + sumWorker8.getSum() + sumWorker9.getSum() ;
	
		System.out.println("一到亿的和是：" + allSum);
		
		
	}

}
