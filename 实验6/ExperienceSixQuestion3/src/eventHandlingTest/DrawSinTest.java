package eventHandlingTest;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class DrawSinTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				JFrame drawFrame = new JFrame("Sin");
				drawFrame.setSize(600, 300);
				drawFrame.add(new DrawSinComponent());
				
				drawFrame.setVisible(true);
				drawFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
		});
	}
}
