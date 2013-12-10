package core.drawable;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.gui.MouseOverArea;

public class Button extends MouseOverArea implements Drawable {
	public Image image;
	public int x1, y1, x2, y2, w, h;
	
	public Button(GameContainer _container, Image _image, int _x, int _y, Color _normalcolor, Color _overcolor) {
		super(_container, _image, _x, _y);
		
		image = _image;
		
		w = image.getWidth();
		h = image.getHeight();
		x1 = _x;
		y1 = _y;
		x2 = x1 + w;
		y2 = y1 + h;
		
		setMouseOverColor(_overcolor);
		setNormalColor(_normalcolor);
	}
	
	public Boolean hasbeenclicked(int _x, int _y) {
		return (_x > x1 && _y > y1 && _x < x2 && _y < y2);
	}

	@Override
	public void render(Graphics _graphics) {
		_graphics.drawImage(image, x1, y1);
	}
}
