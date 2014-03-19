package main;

import org.newdawn.slick.*;
import org.newdawn.slick.openal.Audio;
import org.newdawn.slick.state.*;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class Game extends StateBasedGame{
   
   public static final String gamename = "DataBaze";
   public static final int black = 0;
   public static final int splash = 1;
   public static final int menu = 2;
     
   public Game(String gamename){
      super(gamename);
      this.addState(new Black(black));
      this.addState(new Splash(splash));
      this.addState(new Menu(menu));
   }
   
   public void initStatesList(GameContainer gc) throws SlickException{
	  this.getState(splash).init(gc, this);
      this.getState(menu).init(gc, this);
      this.getState(black).init(gc, this);
      this.enterState(black, new FadeOutTransition(Color.black, 0), new FadeInTransition(Color.black, 5000));
      System.out.println("Switching to Black");
   }
   
   public static void main(String[] args) {
      AppGameContainer appgc;
      try{	  
    	 sound.CustomMusic.init();
         appgc = new AppGameContainer(new Game(gamename));
         appgc.setDisplayMode(800, 600, false);
         appgc.start();
      }catch(SlickException e){
         e.printStackTrace();
      }
   }
   

}