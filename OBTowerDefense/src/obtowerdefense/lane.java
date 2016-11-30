package obtowerdefense;

public class lane {
	private int y;
	private Tower tower;
	private Enemy[] enemies;
	
	public lane(int y){
		this.y = y;
		enemies = new Enemy[11];
	}
	
	public void update(float dt){
		//Turm updaten
		if(tower!=null)
			tower.update();
		
		//Gegner updaten
		for(int i = 0; i < enemies.length; i++){
			if(enemies[i]!=null)
				enemies[i].update(dt);
		}
		
		//Turm löschen, falls dieser tot ist
		if(!tower.getAlive()){
			tower = null;
		}
		
		//Turm schaden zufügen, falls Gegner vor ihm steht
		if(enemyReachesTower()){
			tower.subtractHp(2);
		}
	}
	
	private boolean enemyReachesTower(){
		for(int i = 0; i < enemies.length; i++){
			if(enemies[i]!=null)
				if(enemies[i].getX() <= 100)
					return true;
		}
		return false;
	}
}