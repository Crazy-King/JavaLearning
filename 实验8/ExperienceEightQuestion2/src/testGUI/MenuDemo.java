package testGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

public class MenuDemo extends JFrame {
	private String selectPath = null;
	public File files;
	public int fileNumber = 0;
	public int directoryNumber = 0;
	
	public MenuDemo() {
		super("Demo");
		JMenuBar menuBar = new JMenuBar();

		JMenu file = new JMenu("文件");
		JMenuItem open = new JMenuItem("选择目录");
		JMenuItem select = new JMenuItem("统计");

		open.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFileChooser chooser = new JFileChooser();
				chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				chooser.showOpenDialog(null);
				selectPath = chooser.getSelectedFile().getPath();
				System.out.println(selectPath);
			}
		});
		select.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				files = new File(selectPath);
				statistics(files);
				System.out.println("文件夹个数： " + directoryNumber);
				System.out.println("文件个数： " + fileNumber);
			}
		});

		file.add(open);
		file.addSeparator();
		file.add(select);

		menuBar.add(file);

		setJMenuBar(menuBar);

		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void statistics(File f) {
		File[] fileList = new File(selectPath).listFiles();
		for (File file : fileList){
			if (file.isFile()) {
				fileNumber++;
			} else {
				directoryNumber++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuDemo();
	}

}
