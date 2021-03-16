package c_Waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * 	ALWAYS WRITE SIKULI SCRIPTS WITH WAITS !!!!
 *  VERY VERY IMPORTATNT FROM SYNCHRONIZATION POV
 *  THESE WAITS WILL WORK AS EXPLICIT WAITS
 *  
 * 	Using Wait directly on image or on a Pattern
 * 	@author Sumit Saha
 *
 */
public class a_WithoutOffset {
	
	
	public void testing() throws Exception {
		//*********** DRIVER ACTIONS ************
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		
		Screen s = new Screen();
		
		// Using Wait with image
		s.wait(System.getProperty("user.dir")+"\\SikuliImageLibrary\\txt_AuthPopUp_UserName.PNG",20).type("admin");
		// OR Using Wait with pattern
//		s.wait(new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\txt_AuthPopUp_UserName.PNG")).type("admin");
		
		
		// Using Wait with image
		s.wait(System.getProperty("user.dir")+"\\SikuliImageLibrary\\btn_AuthPopUp_SignIn.PNG",20).click();
		// OR Using Wait with pattern
//		s.wait(new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\btn_AuthPopUp_SignIn.PNG")).click();
		
		
		driver.close();
	}

}
