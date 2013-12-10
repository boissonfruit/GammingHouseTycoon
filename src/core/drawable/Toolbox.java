package core.drawable;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;

import core.constants.*;

public class Toolbox extends Rectangle implements Drawable {
	private static final long serialVersionUID = 1824490921888477148L;
	
	Color color = null;
	float x, y, w, h;
	
	public Toolbox() {
		super(Dimensions.toolboxx, Dimensions.toolboxy, Dimensions.toolboxw, Dimensions.toolboxh);
		
		color = Colors.toolboxbackground;
	}
	
	public void add(Tool _tool) {
		
	}
	
	@Override
	public void render(Graphics _graphics) {
		_graphics.setColor(color);
		_graphics.draw(this);
		_graphics.fill(this);
	}
}