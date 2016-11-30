package main;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Spielfeld {
	private Image[][] Spielfeld = new Image[16][16];
	
	public Image[][] spielenInitialisieren() throws SlickException{
		
		for(int i = 0;i<16;i++){
			for(int y = 0;y<16;y++){
				
				Spielfeld[i][y] = new Image("Bilder/leer.png");
					}
			}
		
		return Spielfeld;
	}
}
