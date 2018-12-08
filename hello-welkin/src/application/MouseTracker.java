package application;

import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseTracker {
	private JFrame window;
	private JLabel label;
	public static MouseTracker instance;
	private Dimension screenSize;
	public static void main(String[] args) {
		new MouseTracker();
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					Point pos = MouseInfo.getPointerInfo().getLocation();
					MouseTracker.instance.label.setText(MouseTracker.instance.getMouseString(pos));
					MouseTracker.instance.window.pack();
					int adjustWidth = 0;
					int adjustHeight = 0;
					if (pos.x > MouseTracker.instance.screenSize.width / 2) {
						adjustWidth = - (MouseTracker.instance.window.getWidth() + 20);
					}
					if (pos.y > MouseTracker.instance.screenSize.height / 2) {
						adjustHeight = - (MouseTracker.instance.window.getHeight() + 10);
					}
					MouseTracker.instance.window.setLocation(new Point(pos.x + 10 + adjustWidth, pos.y + 5 + adjustHeight));
					try {
						Thread.sleep(33);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

	public MouseTracker() {
		MouseTracker.instance = this;
		this.screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.window = new JFrame();
		this.window.setAlwaysOnTop(true);
		this.window.setUndecorated(true);
		this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.window.setVisible(true);
		this.label = new JLabel(this.getMouseString(MouseInfo.getPointerInfo().getLocation()));
		this.window.getContentPane().add(this.label);
		this.window.pack();
	}
	
	private String getMouseString(Point p) {
		return "x: "+ p.x + ", y: " + p.y;
	}
}