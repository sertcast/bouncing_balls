import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;


public class Display extends JPanel implements ActionListener {
	private Timer tm = new Timer(10, this);
	private Ball balls[];
	private int frameW, frameH;
	private Random rand = new Random();
	public Display(int frameW, int frameH){
		this.balls = new Ball[10];
		this.frameH =frameH;
		this.frameW =frameW;
		
		int size = rand.nextInt(100) + 50;
		Color randColor = new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
		for(int i = 0; i < this.balls.length; i++){
			balls[i] = new Ball(rand.nextInt(frameW-size), rand.nextInt(frameH - (size*2)), size, randColor);
			size = rand.nextInt(100) + 50;
			randColor = new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
		}
		tm.start();
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.white);
		g.fillRect(0, 0, frameW, frameH);
		for (int i = 0; i < balls.length; i++){
			this.balls[i].display(g);
		}
	}
	
	public void actionPerformed(ActionEvent arg0) {
		for (int i = 0; i < balls.length; i++){
			this.balls[i].update(frameW, frameH);
		}
		repaint();
	}
}
