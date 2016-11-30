<<<<<<< HEAD:OBTowerDefense/src/obtowerdefense/Tower.java
package obtowerdefense;

public class Tower {
	private int x, y;
    private int hp;
    private boolean alive;
    
    public Tower(int hp){
    	this.hp = hp;
    	alive = true;
    }
    
    public void update(){
    	if(hp<=0){
    		alive = false;
    	}
    }
    
    public boolean getAlive(){
    	return alive;
    }
    
    public void subtractHp(int dHp){
    	hp-=dHp;
    }
}
=======
package main;

public class Tower {
	private int hp;
    private boolean alive;
    
    public Tower(int hp){
    	this.hp = hp;
    	alive = true;
    }
    
    public void update(){
    	if(hp<=0){
    		alive = false;
    	}
    }
    
    public boolean getAlive(){
    	return alive;
    }
    
    public void subtractHp(int dHp){
    	hp-=dHp;
    }
}
>>>>>>> origin/master:src/main/Tower.java
