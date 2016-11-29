package obtowerdefense;


public class Enemy {
    //Attribute
    private int x, y;
    
    
    //Konstruktor
    public Enemy(int a, int b)
    {
        x = a;
        y = b;
    }
    
    
    //Methoden
    public int getX(){return x;}
    
    public int getY(){return y;}
    
    public int changeX(){
        x = x-1;
        return x;
    }
}
