package loginScreen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;

import mainView.MainView;

public class LoginScreen extends JFrame implements ActionListener{
	JTextField nameTextField = new JTextField(12);
	JTextField passwordTextField = new JTextField(12);
	JLabel nameLabel = new JLabel("用户名：");
	JLabel passwordLabel = new JLabel("密码：  ");
	JPanel namePanel = new JPanel();
	JPanel passwordPanel = new JPanel();
	JPanel buttonPanel = new JPanel();	
	JButton loginButton = new JButton("登入");
	
	Map<String, String> users = new HashMap<String, String>();
	
	public LoginScreen() {
		
		users.put("Bob", "123");
		users.put("Dave", "132");
		users.put("Jack", "144");
		
		this.setLayout(new GridLayout(3, 1));
		namePanel.add(nameLabel);
		namePanel.add(nameTextField);
		
		passwordPanel.add(passwordLabel);
		passwordPanel.add(passwordTextField);
		
		buttonPanel.add(loginButton);
		loginButton.addActionListener(this);
		
		this.add(namePanel);
		this.add(passwordPanel);
		this.add(buttonPanel);
		
		
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("登入");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (users.containsKey(nameTextField.getText()) && users.containsValue(passwordTextField.getText())) {
			new MainView();
			this.dispose();
		}else {
			JOptionPane.showMessageDialog(this, "密码输入错误或者用户名不存在", "登入失败",JOptionPane.WARNING_MESSAGE);
		}
		
	}
}
