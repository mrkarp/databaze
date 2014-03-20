package main;

import org.newdawn.slick.Font;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.font.effects.ColorEffect;
import org.newdawn.slick.gui.TextField;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class LogIn extends BasicGameState {

	Image backGround;
	TextField userName;
	TextField userPass;
	TextField databaseIP;
	TextField databasePort;
	
	String userNamePlease = "Username: ";
	
	private UnicodeFont uFont;
	private String fontPath = "Fonts/font.ttf";

	
	
	public LogIn(int state) {
	}

	@SuppressWarnings("unchecked")
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		uFont = new UnicodeFont(fontPath,13,false,false);
		uFont.addAsciiGlyphs();
		uFont.getEffects().add(new ColorEffect(java.awt.Color.WHITE));
		uFont.loadGlyphs();
		backGround = new Image("res/logIn.png");
		userName = new TextField(gc, uFont, 100, 100, 65, 20);
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		backGround.draw(0, 0);
		//g.drawString("test", 98, 107);
		userName.setText(userNamePlease);
		userName.render(gc, g);
		
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		System.out.println(userName.getText());
	}
	
	

	public int getID() {
		return 3;
	}
}
