import apcslib.*;

public class kochTester {
	public static void main(String[] args){
		SketchPad sp = new SketchPad(500, 500, 0);
		kochcurvetool kc = new kochcurvetool();
		kc.drawKochCurve(3, 20);
	}
}
