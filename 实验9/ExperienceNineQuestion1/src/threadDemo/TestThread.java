package threadDemo;

public class TestThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChatRunnable chatR1 = new ChatRunnable();
		ChatRunnable chatR2 = new ChatRunnable();
		ChatRunnable chatR3 = new ChatRunnable();
		TransferFileRunnable transferFileRunnable1 = new TransferFileRunnable();
		TransferFileRunnable transferFileRunnable2 = new TransferFileRunnable();
		TransferFileRunnable transferFileRunnable3 = new TransferFileRunnable();
		Thread threadT1 = new Thread(transferFileRunnable1);
		Thread threadT2 = new Thread(transferFileRunnable2);
		Thread threadT3 = new Thread(transferFileRunnable3);
		Thread threadC1 = new Thread(chatR1);
		Thread threadC2 = new Thread(chatR2);
		Thread threadC3 = new Thread(chatR3);
		threadC1.start();
		threadC2.start();
		threadC3.start();
		threadT1.start();
		threadT2.start();
		threadT3.start();
		threadC1.join();
		threadC2.join();
		threadC3.join();
		threadT1.join();
		threadT2.join();
		threadT3.join();
		System.out.println("main 线程终止");
		
		
	}

}
