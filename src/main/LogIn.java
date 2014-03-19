package main;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class LogIn extends BasicGameState {

	Image backGround;
	
	
	public LogIn(int state) {
	}

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		backGround = new Image("res/logIn.png");

	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		backGround.draw(0, 0);
		g.drawString("test", 25, 25);
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {

	}
	
	

	public int getID() {
		return 3;
	}
}
