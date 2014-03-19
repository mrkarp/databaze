package main;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.Animation;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Menu extends BasicGameState{
   
   Image backGround;
   Animation pressStart;
   SpriteSheet pressStartAnim;
   Rectangle rect = new Rectangle(25, 25, 25, 25);
   
   public Menu(int state){	   
   }
   
   public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
      backGround = new Image("res/dataBaseBG.png");
      pressStartAnim = new SpriteSheet("res/pressEnter.png", 300, 38);
      pressStart = new Animation(pressStartAnim, 500);
      }
   
   
   public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
	  backGround.draw(0, 0);
	  pressStart.draw(280, 530);
   }
   
   public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
	   
   }
   
   public int getID(){
      return 2;
   }
}