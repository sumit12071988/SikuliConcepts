package ocr;

import org.sikuli.script.Key;
import org.sikuli.script.Screen;

public class b_ScriptingUsingDimensionsInsteadOfImages {
	
	public static void main(String[] args) {
		Screen s = new Screen();
		
		s.type("d",Key.WIN);
		
		// Using Dimensions instead of images
		s.newRegion(1457, 221, 1503-1457, 285-221).doubleClick();
	}

	
	

}
