package actions;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

public class Type_Shortcuts_BySimulatingKeystrokes {
	
	public static void main(String[] args) throws InterruptedException {
		
		Screen s = new Screen();
		
		// 	WIN D
		s.type("d", Key.WIN);
		
		// 	WIN R
		s.type("r",Key.WIN);
		
		// type notepad
		s.type("notepad");
		
		// Hit Enter
		s.type(Key.ENTER);
		
		// Hit TAB
		//s.type(Key.TAB);
		
		Thread.sleep(2000);
		// Hit CTRL F4
		s.type(Key.F5);
		
		// SHIFT F3
		s.type(Key.F3,Key.SHIFT);
		
		// SHIFT TAB
		s.type(Key.TAB,Key.SHIFT);
		
		// Multiple KEYSTROKES and filling up entire form
		s.type(Key.TAB + "data1" + Key.TAB + "data2" + Key.TAB + "data3" + Key.TAB + "data4");
		
		// CTRL SHIFT F3
		s.type(Key.F3,Key.SHIFT+Key.CTRL);
		
		
	}

}
