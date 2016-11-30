package obtowerdefense;

public class Projectile {
	private int x, y;
	
	public Projectile(int y){
		x = 100;
		this.y = y;
	}
	
	public void update(){
		x++;
	}
	
	public int getX(){
		return x;
	}
}