package com.java.Snowing;


import java.awt.Canvas;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class SnowFrame extends JFrame{
	SnowCanvas canvas = new SnowCanvas();
	public SnowFrame() {
		setSize(620,850);
		setLocation(200,200);
		add(canvas);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		new SnowFrame();

	}
	public class SnowCanvas extends Canvas{
		List<Snow> snows = new ArrayList<>();
		public SnowCanvas() {
			for (int i=0; i<100; i++) {
				Snow snow = new Snow(this);
				snow.start();
				snows.add(snow);
			}
		}
		@Override
		public void paint(Graphics g) {
			for (int i=0; i<100; i++) {
				Snow snow = snows.get(i);
				g.drawString("雪", snow.x, snow.y);
			}
		}
		
	}
}
