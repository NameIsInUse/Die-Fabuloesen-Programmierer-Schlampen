package obtowerdefense;

public class Enemy {
    private float x;
    
    public Enemy(int x)
    {
        this.x = (float) x;
    }
    
    public void update(float dt){
        x = x - 50*dt;
    }
    
    public int getX(){
    	return (int) x;
    }
}
