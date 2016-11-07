package testDrawLine;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

import javax.swing.JComponent;

public class DrawLineComponent extends JComponent {

	private ArrayList<Line2D> lines = null;

	public DrawLineComponent(ArrayList<Point2D> point2ds) {
		// TODO Auto-generated constructor stub
		this.lines = makeLine(point2ds);
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		Graphics2D tempG = (Graphics2D) g;
		for (Line2D l : lines)
			tempG.draw(l);

	}

	private ArrayList<Line2D> makeLine(ArrayList<Point2D> point2ds) {
		if (point2ds.size() < 2)
			throw new IllegalArgumentException("点的个数小于2.");
		ArrayList<Line2D> lines = new ArrayList<Line2D>();
		for (int i = 0; i < point2ds.size() - 1; i++)
			lines.add(new Line2D.Double(point2ds.get(i), point2ds.get(i + 1)));
		return lines;
	}
}
