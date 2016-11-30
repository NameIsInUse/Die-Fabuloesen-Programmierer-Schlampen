<<<<<<< HEAD:OBTowerDefense/src/obtowerdefense/Enemy.java
package obtowerdefense;

public class Enemy {
    private int x, y;
    
    public Enemy(int y){
        x = 500;
        this.y = y;
    }
    
    public void update(){
        x--;
    }
    
    public int getX(){
    	return (int) x;
    }
}
=======
package main;

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
>>>>>>> origin/master:src/main/Enemy.java
