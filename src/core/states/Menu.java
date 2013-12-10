package core.states;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;

import core.constants.Colors;
import core.constants.Dimensions;
import core.constants.Pictures;
import core.drawable.Button;

public class Menu implements GameState {
	StateBasedGame base;
	GameContainer container;
	Image backgroundimage;
	
	Button play, settings, exit;
	
	@Override
	public void init(GameContainer arg0, StateBasedGame arg1)
			throws SlickException {
		play = new Button(arg0, new Image(Pictures.playbutton), Dimensions.playbuttonx, Dimensions.playbuttony, Colors.normalmenubuttonscolor, Colors.overmenubuttonscolor);
		settings = new Button(arg0, new Image(Pictures.settingsbutton), Dimensions.settingsbuttonx, Dimensions.settingsbuttony, Colors.normalmenubuttonscolor, Colors.overmenubuttonscolor);
		exit = new Button(arg0, new Image(Pictures.exitbutton), Dimensions.exitbuttonx, Dimensions.exitbuttony, Colors.normalmenubuttonscolor, Colors.overmenubuttonscolor);
		
		container = arg0;
		base = arg1;
	}

	@Override
	public void mouseClicked(int arg0, int arg1, int arg2, int arg3) {
		System.out.println("Click (button: " + arg0 + ", posx: " + arg1 + ", posy: " + arg2 + ", number: " + arg3 + ")");
		
		if(arg0 == 0) {
			if(play.hasbeenclicked(arg1, arg2)) {
				try {
					int z = base.getStateCount();
					base.getState(1).init(container, base);
					base.enterState(1);
				} catch (SlickException e) {
					System.out.println("Exception :");
					System.out.println(this);
					System.out.println(e);
				}
			}
			if(settings.hasbeenclicked(arg1, arg2)) base.enterState(2);
			if(exit.hasbeenclicked(arg1, arg2)) System.exit(0);
		}
	}

	@Override
	public void mouseDragged(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(int arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(int arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseWheelMoved(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputEnded() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputStarted() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAcceptingInput() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void setInput(Input arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(int arg0, char arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(int arg0, char arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void controllerButtonPressed(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void controllerButtonReleased(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void controllerDownPressed(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void controllerDownReleased(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void controllerLeftPressed(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void controllerLeftReleased(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void controllerRightPressed(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void controllerRightReleased(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void controllerUpPressed(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void controllerUpReleased(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enter(GameContainer arg0, StateBasedGame arg1)
			throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public void leave(GameContainer arg0, StateBasedGame arg1)
			throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics arg2)
			throws SlickException {
		play.render(arg2);
		settings.render(arg2);
		exit.render(arg2);
	}

	@Override
	public void update(GameContainer arg0, StateBasedGame arg1, int arg2)
			throws SlickException {
		// TODO Auto-generated method stub
		
	}

}
