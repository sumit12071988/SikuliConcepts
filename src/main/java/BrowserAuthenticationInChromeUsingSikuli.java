

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserAuthenticationInChromeUsingSikuli {
	
	@Test
	public void test() throws Exception {
			
		//*********** IMAGE OBJECTS *****************
		Pattern txt_AuthPopUp_UserName = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\txt_AuthPopUp_UserName.PNG");
		Pattern txt_AuthPopUp_Password = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\txt_AuthPopUp_Password.PNG");
		Pattern btn_AuthPopUp_SignIn = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\btn_AuthPopUp_SignIn.PNG");
		
			
		//*********** DRIVER ACTIONS ************
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		

		
		// *********** SIKULI ACTIONS *************
		// Create an object of Screen class
		//	Note: Don't use wait in ALL type actions if multiple textboxes are present in same window. Use the action directly.
		Screen s = new Screen();
		
		// Step4: Use Sikuli scripts
		s.wait(txt_AuthPopUp_UserName,2).type("admin");
		
		// Sometimes wait will not bring the cursor to the element in which we need to type. In such cases we should use action directly.
		s.type(txt_AuthPopUp_Password,"admin");
		//screen.wait(txt_AuthPopUp_Password,2).type("admin");
	
		s.wait(btn_AuthPopUp_SignIn,2).click();
		
	
		driver.close();
		
	}

}
