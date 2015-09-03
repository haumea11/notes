import apcslib.*;

import java.awt.*;

public class kochcurvetool extends DrawingTool {
	public void drawKochCurve(int Depth, double length)
	{
		SketchPad sp = new SketchPad(500, 500, 0);
		if(Depth == 1){
			down();
			move(length);
		}
		else{
			down();
			drawKochCurve(Depth-1, length/3);
			turnLeft(120);
			drawKochCurve(Depth-1, length/3);
			turnRight(60);
			drawKochCurve(Depth-1, length/3);
			turnLeft(120);
			drawKochCurve(Depth-1, length/3);			
		}
			
			
	}
	
	public kochcurvetool()
	{
		super(new SketchPad(500, 500, 0));
		up();
		move(-150, -50);
		down();
		//pen.setColor(R, G, B);
		setDirection(0);
		setWidth(1);
	}
}
