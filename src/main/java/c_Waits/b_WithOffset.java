package c_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * 	ALWAYS WRITE SIKULI SCRIPTS WITH WAITS !!!!
 *  VERY VERY IMPORTATNT FROM SYNCHRONIZATION POV
 *  THESE WAITS WILL WORK AS EXPLICIT WAITS
 *  
 * 	Using Wait directly on image or on a Pattern + setting Offset coordinates
 * 	@author Sumit Saha
 *
 */
public class b_WithOffset {
	
	@Test
	public void testing() throws Exception {
		//*********** DRIVER ACTIONS ************
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		
		Screen s = new Screen();
		
		// Using Wait directly on image or on a Pattern + setting Offset coordinates
		s.wait(new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\txt_AuthPopUp_UserName.PNG").targetOffset(1,1),20).type("admin" + Key.TAB);
		s.wait(new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\txt_AuthPopUp_Password.PNG").targetOffset(1,1),20).type("admin");
		s.wait(new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\btn_AuthPopUp_SignIn.PNG").targetOffset(1, 1),20).click();
		
		driver.close();
	}

}
