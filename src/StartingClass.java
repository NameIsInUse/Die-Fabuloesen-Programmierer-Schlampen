
import java.applet.Applet;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import java.awt.Graphics;
import java.awt.Image;

public class StartingClass extends Applet implements Runnable, KeyListener {
	private Maze maze;
	private URL base;
	private Graphics second;
	private boolean running = true;
	
	@Override
	public void init(){
		setSize(800, 480);
		setBackground(Color.BLACK);
		setFocusable(true);
		
		addKeyListener(this);
		
		Frame frame = (Frame) this.getParent().getParent();
		frame.setTitle("Q-Bot Alpha");
		
		try{
			base = getDocumentBase();
		} catch(Exception e) {}
		
		//character = getImage(base, "data/character.png");
	}
	
	@Override
	public void start(){
		maze = new Maze(20, 10);
		
		Thread thread = new Thread(this);
		thread.start();
	}
	
	@Override
	public void stop(){
		
	}
	
	@Override
	public void destroy(){
		
	}

	@Override
	public void run() {
		while(running){
			
			repaint();
		
			try{
				Thread.sleep(17);
			} catch (InterruptedException e){}
		}
	}

	@Override
	public void update(Graphics g) {
		/*
		if(image == null){
			image = createImage(this.getWidth(), this.getHeight());
			second = image.getGraphics();
		}
		
		second.setColor(getBackground());
		second.fillRect(0, 0, getWidth(), getHeight());
		second.setColor(getForeground());
		paint(second);
		
		g.drawImage(image, 0, 0, this);
		*/
	}
	
	@Override
	public void paint(Graphics g) {

	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()){
			case KeyEvent.VK_UP:

				break;
			
			case KeyEvent.VK_DOWN:
				break;
			
			case KeyEvent.VK_LEFT:

				break;
			
			case KeyEvent.VK_RIGHT:

				break;
			
			case KeyEvent.VK_SPACE:
				break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch(e.getKeyCode()){
			case KeyEvent.VK_UP:
				break;
			
			case KeyEvent.VK_DOWN:
				break;
			
			case KeyEvent.VK_LEFT:

				break;
			
			case KeyEvent.VK_RIGHT:

				break;
			
			case KeyEvent.VK_SPACE:
				break;
	}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}
}