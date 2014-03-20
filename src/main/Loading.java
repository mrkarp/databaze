package main;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.openal.Audio;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class Loading extends BasicGameState {
	Audio karpCodeLogo = sound.CustomMusic.karpCodeLogo;
	//Image loadingGear;
	SpriteSheet gearAnim;
	Animation gearAnimLoad;

	public Loading(int state) {
	}

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		//loadingGear = new Image("res/loadingGear.png");
		gearAnim = new SpriteSheet("res/loadingGear.png", 64, 64);
		gearAnimLoad = new Animation(gearAnim, 500);
		

	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		gearAnimLoad.draw(733, 533);
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		sbg.enterState(1, new FadeOutTransition(Color.black, 0000),new FadeInTransition(Color.black, 4000));
		System.out.println("**Splash**");
		karpCodeLogo.playAsMusic(1, 1, false);
	}

	public int getID() {
		return 0;
	}
}
