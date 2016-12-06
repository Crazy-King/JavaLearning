package threadDemo;

import java.sql.Time;

public class TransferFileRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int n = (int) (10 + Math.random() * (20 - 10 + 1));
		for (int i = 0; i < n; i++) {
			System.out.println("I am transferring file.");
			try {
				Thread.sleep(200);
			} catch (Exception e) { 
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println("当前线程 " + Thread.currentThread().getName() + " 正要退出.");
	}
	

}
