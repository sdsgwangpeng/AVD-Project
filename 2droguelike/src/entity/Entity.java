package entity;

import game.level.Level;
import graphics.Screen;
import java.util.Random;

public abstract class Entity {
	public int x,y;
	private boolean removed = false;
	protected Level level;
	protected final Random random = new Random();
	
	
	public void update() {
		
	}
	public void render(Screen screen) {
		
	}
	public void remove() {
		//Remove code here
		removed = true;
	}
	
	public boolean isremoved() {
		return removed;
	}
}
