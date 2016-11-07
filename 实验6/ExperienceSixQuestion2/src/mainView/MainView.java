package mainView;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MainView extends JFrame{
	JMenuBar menuBar = new JMenuBar();
	JMenu projectMenu = new JMenu("项目");
	
	JMenuItem curveDemonstrationMenu = new JMenuItem("曲线演示");
	JMenuItem openFileMenu = new JMenuItem("打开文件");
	JMenuItem exitMenu = new JMenuItem("退出");
	JPanel p1 = new JPanel();
	public MainView() {
		// TODO Auto-generated constructor stub
		this.setSize(600, 400);
		this.setLayout(new BorderLayout(2, 1));

		
		projectMenu.add(curveDemonstrationMenu);
		projectMenu.add(openFileMenu);
		projectMenu.add(exitMenu);
		menuBar.add(projectMenu);
		p1.add(menuBar);
		curveDemonstrationMenu.addActionListener(new curveDemonstrationMenuActionListener());
		exitMenu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(1);
			}
		});
		this.add(p1);

		
		this.setVisible(true);		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class curveDemonstrationMenuActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			new CurveDemonstration();
			
		}
		
	}
}
