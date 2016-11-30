package main;

public class lane {
	private int y;
	private Tower tower;
	private Enemy[] enemies;
	private Projectile[] projectiles;
	
	public lane(int y){
		this.y = y;
		enemies = new Enemy[11];
		projectiles = new Projectile[11];
	}
	
	public void ButtonPressed(){
		addProjectile();
	}
	
	public void update(float dt){
		//Turm updaten
		if(tower!=null)
			tower.update();
		
		//Gegner updaten
		for(int i = 0; i < enemies.length; i++){
			if(enemies[i]!=null)
				enemies[i].update();
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
	
	public void collisionCheck(){
		for(int i = 0; i < enemies.length; i++){
			if(enemies[i] != null){
				for(int j = 0; j < projectiles.length; j++){
					if(projectiles[j] != null){
						if(projectiles[j].getX()-enemies[i].getX()<50){
							projectiles[j] = null;
							enemies[i] = null;
						}
					}
				}
			}
		}
	}
	
	public void addEnemy(int y){
		if(tower!=null){
			for(int i = 0; i < enemies.length; i++){
				if(enemies[i] == null)
					enemies[i] = new Enemy(y);
				return;
			}
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
	
	private void addProjectile(){
		for(int i = 0; i < projectiles.length; i++){
			if(projectiles[i] == null)
				projectiles[i] = new Projectile(y);
			return;
		}
	}
}