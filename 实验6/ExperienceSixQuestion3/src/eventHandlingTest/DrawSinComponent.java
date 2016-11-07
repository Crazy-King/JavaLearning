package eventHandlingTest;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JComponent;
import javax.swing.ProgressMonitorInputStream;

public class DrawSinComponent extends JComponent {
	private ArrayList<Point2D> points = null;
	private Point2D xp;
	
	public DrawSinComponent() {
		// TODO Auto-generated constructor stub
		xp = null;
		
		addMouseListener(new MouseHandler());
		addMouseMotionListener(new MouseMotionHandler());
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D tempG = (Graphics2D) g;
		points = makePoint();
		double x = 0, y = 0;
		if (!points.isEmpty()) {
			Iterator<Point2D> iterator = points.iterator();
			if (iterator.hasNext()) {
				Point2D p1 = iterator.next();
				x = p1.getX();
				y = p1.getY();
			}
			while(iterator.hasNext()){
				Point2D p1 = iterator.next();
				tempG.draw(new Line2D.Double(x, y, p1.getX(), p1.getY()));
				x = p1.getX();
				y = p1.getY();
			}
		}
	}

	private ArrayList<Point2D> makePoint(){
		ArrayList<Point2D> point2ds = new ArrayList<Point2D>();
		for (int i = 0; i < 300; i++) {
			point2ds.add(new Point2D.Double(i, Math.sin(i * 0.1) * 100.0 + 100.0));
		}
		return point2ds;
	}
	
	public Point2D find(Point2D p){
		double x = p.getX();
		double y = p.getY();
		
		Iterator<Point2D> iterator = points.iterator();
		while(iterator.hasNext()){
			xp = iterator.next();
			if ((x < (xp.getX() + 2)) && (x > (xp.getX() - 2))) {
				if ((y < (xp.getY() + 2)) && (y > (xp.getY() - 2))){
					return xp;
				}
			}
		}
		return null;
	}
	
	public void remove(Point2D rp) {
		if (rp == null) 
			return ;
		if (rp == xp)
			xp = null;
		points.remove(rp);
		repaint();
	}
	
	private class MouseHandler extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			xp = find(e.getPoint());
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			xp = find(e.getPoint());
			if (xp != null && e.getClickCount() >= 2)
				remove(xp);
		}	
	}
	
	private class MouseMotionHandler implements MouseMotionListener {
		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			if (find(e.getPoint()) == null) {
				setCursor(Cursor.getDefaultCursor());
			}else {
				setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
			}
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			Point2D point2d = e.getPoint();
			if (xp != null) {
				xp.setLocation(point2d.getX(), point2d.getY());
				repaint();
			}
		}
	}
}
