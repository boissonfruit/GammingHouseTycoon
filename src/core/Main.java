package core;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;
 
public class Main {
	private static AppGameContainer container;

	public static void main(String[] args) {
		try {
			container = new AppGameContainer(new GamingHouseTycoon());
			container.setDisplayMode(640, 480, false);
			container.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}
