package testDrawLine;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JComponent;

public class DrawLineByPointComponent extends JComponent {
	private ArrayList<Line2D> lines = null;

	public DrawLineByPointComponent() {
		// TODO Auto-generated constructor stub
		ArrayList<Point2D> point2ds = new ArrayList<Point2D>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Input point:");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		do {
			point2ds.add(new Point2D.Double(x, y));
			System.out.println("Input point:(0,0 to draw)");
			x = scanner.nextDouble();
			y = scanner.nextDouble();
			if (x == 0 && y == 0) {
				break;
			}
		} while (true);
		scanner.close();
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
