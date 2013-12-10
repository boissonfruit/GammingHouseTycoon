package core.drawable;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Rectangle;

public class MapPart extends Rectangle implements Drawable {
	private static final long serialVersionUID = -4796939117220792095L;
	
	Image image;
	int x, y, w, h;
	
	public MapPart(float x, float y, float w, float h) {
		super (x, y, w, h);
	}
	
	public void draw(Graphics _graphics) {
		_graphics.drawImage(image, x, y);
	}

	@Override
	public void render(Graphics _graphics) {
		// TODO Auto-generated method stub
		
	}
}
