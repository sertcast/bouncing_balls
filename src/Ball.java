import java.awt.Color;
import java.awt.Graphics;


public class Ball {
	int x, y, size, speed = 5, xSpeed = speed, ySpeed = speed;
	Color color;
	public Ball(int x, int y, int size, Color color){
		this.x = x;
		this.y = y;
		this.size = size;
		this.color = color;
	}
	public void display(Graphics g){
		g.setColor(color);
		g.fillOval(x, y, size, size);
	}
	public void update(int frameW, int frameH){
		if(this.x <= 0){
			this.xSpeed = speed;
		}else if( this.x +this.size >frameW){
			this.xSpeed = -speed;
		}else if( this.y +this.size >frameH){
			this.ySpeed = -speed;
		}else if(this.y <= 0){
			this.ySpeed = speed;
		}
		this.x += this.xSpeed;
		this.y += this.ySpeed;
	}
}
