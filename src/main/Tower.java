package main;

import org.newdawn.slick.Image;

public class Tower {
	private int x, y;
    private int hp;
    private boolean alive;
    private Image tower;
    
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