package com.java.Snowing;
import java.awt.Canvas;
import java.util.Random;
public class Snow extends Thread{
	Canvas canvas;
	Random random = new Random();
	int x;
	int y = 800;
	public Snow(Canvas canvas) {
		this.canvas = canvas;
		x = random.nextInt(600);
	}
	@Override
	public void run() {
		for(int i = 0; i < 700; i++) {
			
			
			y = y + 1;
			int movement = random.nextInt(3)-1;
			x = x - movement;
			try {
				sleep(50);
				canvas.repaint();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
