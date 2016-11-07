package mainView;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;
import java.util.ArrayList;

import javax.sound.sampled.Line;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import org.omg.PortableServer.THREAD_POLICY_ID;

import DrawLine.*;

public class CurveDemonstration extends JFrame{
	
	JTabbedPane selectCurve = new JTabbedPane(JTabbedPane.TOP);
	
	public CurveDemonstration() {
		this.setSize(600, 400);
		DrawSinComponent sinComponent = new DrawSinComponent();
		DrawCosComponent cosComponent = new DrawCosComponent();
		selectCurve.add("Sin", sinComponent);
		selectCurve.add("Cos", cosComponent);

		
		this.add(selectCurve, BorderLayout.CENTER);
		this.setVisible(true);
		// TODO Auto-generated constructor stub
	}

}
