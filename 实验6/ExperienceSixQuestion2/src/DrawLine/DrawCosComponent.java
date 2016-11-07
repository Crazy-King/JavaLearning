package DrawLine;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

import javax.swing.JComponent;

public class DrawCosComponent extends JComponent{
	private ArrayList<Line2D> lines = null;
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		Graphics2D tempG = (Graphics2D) g;
		lines = makeLine();
		for (Line2D l : lines)
			tempG.draw(l);

	}

	private ArrayList<Line2D> makeLine() {
		ArrayList<Point2D> point2ds = new ArrayList<Point2D>();
		ArrayList<Line2D> lines = new ArrayList<Line2D>();
		for (int i = 0; i < 300; i++) {
			point2ds.add(new Point2D.Double(i, Math.cos(i * 0.1) * 100.0 + 100.0));
		}
		for (int i = 0; i < point2ds.size() - 1; i++)
			lines.add(new Line2D.Double(point2ds.get(i), point2ds.get(i + 1)));
		return lines;
	}
}
