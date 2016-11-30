package main;

	import org.newdawn.slick.AppGameContainer;
	import org.newdawn.slick.SlickException;
	import org.newdawn.slick.*;
	
public class RunTime {
	
	    public static void main(String[] args) throws SlickException {
	        
	        
	        GUI gui = new GUI("TowerButtons");
	        
	        AppGameContainer app = new AppGameContainer(gui);  
	        
	        
	       
	        
	        app.setDisplayMode(800,600,false);
	        
	    
	     
	        app.start();
	        
	    }
	}
