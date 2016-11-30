package main;

public class OBTowerDefense {
	private lane[] lanes;
	
    public static void main(String[] args) {
    	new OBTowerDefense(600, 400);
    }
    
    public OBTowerDefense(int width, int height){
    	init();
    }
    
    private void init(){
    	lanes = new lane[4];
    	for(int i = 0; i < 4; i++){
    		lanes[i] = new lane(i*100);
    	}
    }
}
