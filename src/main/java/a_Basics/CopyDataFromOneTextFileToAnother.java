package a_Basics;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class CopyDataFromOneTextFileToAnother {
	
	
	public static void main(String[] args) throws FindFailed {
		Screen s = new Screen();
		
		s.click(new Pattern(System.getProperty("user.dir")+"./SikuliImageLibrary/NotepadInTaskBar.PNG"));
		s.wait(2.0);
		s.type("a",Key.CTRL);
		s.type("c",Key.CTRL);
		//s.doubleClick(new Pattern(System.getProperty("user.dir")+"./SikuliImageLibrary/1608229165944.png").targetOffset(43,1));
		s.type("n",Key.CTRL);
		s.wait(2.0);
		s.type("v",Key.CTRL);
	}

}
