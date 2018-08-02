import javax.swing.JFrame;


public class Can {
	final static int WIDTH = 1000;
	final static int HEIGHT= 600;
	public static void main(String []args){
		JFrame frame = new JFrame("Title");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(WIDTH, HEIGHT);
		frame.add(new Display(WIDTH, HEIGHT));
		frame.setVisible(true);
	}
}
