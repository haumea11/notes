import chn.util.*;
import apcslib.*;
public class darnsquares {
	public static void main(String[] args)
	{
		int w = 0;
		DrawingTool pen;
		SketchPad forehead;
		forehead = new SketchPad(800,800);
		pen = new DrawingTool(forehead);
		pen.up();
		pen.move(-300, 300);
		pen.down();
		for(int a = 0; a<7; a++)
		{
			for (int b = 0; b<=7; b++)
			{
				if(b<=3)
					w=w+10;
				else
					if(b<=5)
						w=w-10;
					else
						w=w+10;
					
				pen.fillRect(40, 40);
				pen.up();
				pen.move((80*a)-300+w, 300-(80*b));
				pen.down();
			}
		}
	}
}
