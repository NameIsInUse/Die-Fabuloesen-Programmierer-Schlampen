package obtowerdefense;


public class Tower {
    //Attribute
    private int leben = 10;
    private int x, y;
    
    
    //Konstruktor
    public Tower(int a, int b){
        x = a;
        y = b;
    }
    
    
    //Methoden
    public int getY(){return y;}
    
    public int getState(){return leben;}
    
    public int changeState()
    {
        leben = leben-1;
        return leben;
    }
}
