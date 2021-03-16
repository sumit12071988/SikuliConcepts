package b_Actions;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Hover {
	public static void main(String[] args) throws FindFailed {
		Screen s = new Screen();
		
		s.wait(System.getProperty("user.dir") + "\\SikuliImageLibrary\\DragNDrop\\uTorrent.png",20).hover();
		// OR
		s.wait(new Pattern(System.getProperty("user.dir") + "\\SikuliImageLibrary\\DragNDrop\\uTorrent.png"),20).hover();
	}
	
}
