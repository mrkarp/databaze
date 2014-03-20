package main;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.MouseListener;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class Menu extends BasicGameState{
   
   Image backGround;
   Animation pressStart;
   SpriteSheet pressStartAnim;
   Rectangle rect = new Rectangle(280, 530, 200, 100);
   MouseListener mouse;
   
   
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
	 // g.draw(rect);
   }
   
   public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
	   Input i = gc.getInput();
//	   int mouseX = gc.getInput().getMouseX();
//	   int mouseY = gc.getInput().getMouseY();
//	   int mouseLeft = Input.MOUSE_LEFT_BUTTON;
	  // if(rect.contains(mouseX, mouseY, rect.getMinX(), rect.getMinY(), rect.getWidth(), rect.getHeight())){
		if(i.isKeyPressed(Input.KEY_ENTER)){
			sbg.enterState(3, new FadeOutTransition(Color.black, 2000), new FadeInTransition(Color.black, 5000));
			System.out.println("**Log In**");
		  // }
	   }
   }
   
   public int getID(){
      return 2;
   }
   
}