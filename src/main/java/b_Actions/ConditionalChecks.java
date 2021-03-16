package b_Actions;

import org.sikuli.script.Screen;

public class ConditionalChecks {

	public static void main(String[] args) {

		boolean flag = new Screen().exists(System.getProperty("user.dir") + "\\SikuliImageLibrary\\Common\\windowsLogo.png", 4) != null;
		boolean flag1 = new Screen().exists(System.getProperty("user.dir") + "\\SikuliImageLibrary\\Common\\1601562383702.png", 4) != null;
		
		if (flag) {
			System.out.println("Image Found");		// Image should be found since current screen has this image for Sikuli to match
		} else {
			System.out.println("Image Not Found");
		}
		
		if (flag1) {
			System.out.println("Image Found");
		} else {
			System.out.println("Image Not Found");	// Image should not be found since current screen doesn't have this image for Sikuli to match
		}
	}

	
	
	
}
