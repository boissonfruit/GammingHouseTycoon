package core;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import core.states.Game;
import core.states.Menu;
import core.states.Settings;

public class GamingHouseTycoon extends StateBasedGame {
	public static final int MENUID = 0;
	public static final int GAMEID = 1;
	
	public GamingHouseTycoon() {
		super("GamingHouse Tycoon");
	}
	
	@Override
	public void initStatesList(GameContainer arg0) throws SlickException {
		Menu menu = new Menu();
		Game game = new Game();
		Settings settings = new Settings();
		
		menu.init(arg0, this);
		
		this.addState(menu);
		this.addState(game);
		this.addState(settings);
	}
}
