package testDrawLine;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class DrawLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("DrawLine");
				frame.setSize(600, 400);
				JTabbedPane selectCurve = new JTabbedPane(JTabbedPane.TOP);
				
				ArrayList<Point2D> point2ds = new ArrayList<Point2D>();
				point2ds.add(new Point2D.Double(0, 0));
				point2ds.add(new Point2D.Double(50, 50));
				point2ds.add(new Point2D.Double(100, 0));
				point2ds.add(new Point2D.Double(150, 50));

				DrawLineComponent drawLineComponent = new DrawLineComponent(point2ds);
				DrawSinComponent drawSinComponent = new DrawSinComponent();
				DrawCosComponent drawCosComponent = new DrawCosComponent();
//				DrawLineByPointComponent drawLineByPointComponent = new DrawLineByPointComponent();
				
				selectCurve.add("Sin", drawSinComponent);
				selectCurve.add("Cos", drawCosComponent);
				selectCurve.add("Line", drawLineComponent);
				
//				通过输入点来划线
//				selectCurve.add("LineByPoints", drawLineByPointComponent);
				
//				frame.add(new DrawLineByPointComponent());   
//				frame.add(new DrawLineComponent(point2ds));
//				frame.add(new DrawSinComponent());
//				frame.add(new DrawCosComponent());
				frame.add(selectCurve, BorderLayout.CENTER);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
	}

}
