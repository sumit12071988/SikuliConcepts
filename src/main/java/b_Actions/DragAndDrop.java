package b_Actions;

import org.apache.log4j.or.ObjectRenderer;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		// *********** IMAGE OBJECTS *****************

//		Pattern source = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\DragNDrop\\uTorrent.png");
//		Pattern target = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\DragNDrop\\sonarqube.png");

		Screen s = new Screen();

		s.type("d", Key.WIN);

		// Solution #1:
//		s.drag(source);
//		s.dropAt(target);

		// Solution #2:
		s.dragDrop(new Pattern(System.getProperty("user.dir") + "\\SikuliImageLibrary\\DragNDrop\\uTorrent.png"),new Pattern(System.getProperty("user.dir") + "\\SikuliImageLibrary\\DragNDrop\\sonarqube.png"));
		// OR
		s.dragDrop(System.getProperty("user.dir") + "\\SikuliImageLibrary\\DragNDrop\\uTorrent.png",System.getProperty("user.dir") + "\\SikuliImageLibrary\\DragNDrop\\sonarqube.png");
		
		Thread.sleep(8000);

	}

}
