package core.constants;

public class Dimensions {
	//main dimensions
	public static final int mainw = 640, mainh = 480; // in px
	
	//menu state
	//buttons
	private static final int menubuttonsw = 115;
	private static final int menubuttonsh = 38;
	private static final int spacebetweenbuttons = 20;

	//play button
	public static final int playbuttonx = mainw / 2 - menubuttonsw / 2;
	public static final int playbuttony = mainh / 2 - 3 * menubuttonsh / 2 - spacebetweenbuttons;
	public static final int playbuttonw = menubuttonsw;
	public static final int playbuttonh = menubuttonsh;
	
	//settings button
	public static final int settingsbuttonx = mainw / 2 - menubuttonsw / 2;
	public static final int settingsbuttony = mainh / 2 - menubuttonsh / 2;
	public static final int settingsbuttonw = menubuttonsw;
	public static final int settingsbuttonh = menubuttonsh;
	
	//exit button
	public static final int exitbuttonx = mainw / 2 - menubuttonsw / 2;
	public static final int exitbuttony = mainh / 2 + menubuttonsh / 2 + spacebetweenbuttons;
	public static final int exitbuttonw = menubuttonsw;
	public static final int exitbuttonh = menubuttonsh;
	
	//tools box dimensions
	private static final int _toolboxw = 20, _toolboxh = 50; // in %
	public static final int toolboxw = mainw * _toolboxw / 100, toolboxh = mainh * _toolboxh / 100; // in px
	public static final int toolboxx = mainw * toolboxw, toolboxy = mainh - toolboxh; //in px
}
