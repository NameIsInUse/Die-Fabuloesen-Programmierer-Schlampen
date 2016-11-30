package main;

import java.awt.Font;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Animation;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.tiled.TileSet;
import org.newdawn.slick.util.ResourceLoader;

public class GUI extends BasicGame{

	private Image turret = null;
	
	public GUI(String title) {
		super(title);
	}

	
	@Override
	public void init(GameContainer arg0) throws SlickException {
		turret = new Image("Bilder/Turret_2_0.png");
	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		
		
	}
	
	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		turret.draw(1, 1);
	}

}
