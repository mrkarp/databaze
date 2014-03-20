package main;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.openal.Audio;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class Splash extends BasicGameState{
	   Image karpLogo;
	   int timeOut = 5;
	   Audio menuMusic = sound.CustomMusic.menuMusic;
	   Audio karpCodeLogo = sound.CustomMusic.karpCodeLogo;

	   
   
   public Splash(int state){
   }
   
   public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
	   karpLogo = new Image("res/logoKarpCode.png");

   }
   
   public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
	   karpLogo.draw(250, 150);
   }
   
   public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
	   menuMusic.stop();
	   sbg.enterState(2, new FadeOutTransition(Color.black, 0000), new FadeInTransition(Color.black, 4000));
	   System.out.println("Switching to Menu");
	   //menuMusic.playAsMusic(1, 1, true);
   }
   
   public int getID(){
      return 1;
   }
}