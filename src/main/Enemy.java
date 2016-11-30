package main;

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