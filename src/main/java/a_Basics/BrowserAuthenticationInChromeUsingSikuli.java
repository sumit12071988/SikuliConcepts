package a_Basics;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.hotkey.Keys;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserAuthenticationInChromeUsingSikuli {

	WebDriver driver;

	@BeforeMethod
	public void setup(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
	}

	@AfterMethod
	public void teardown(){
		driver.close();
	}
	
	@Test
	public void test() throws Exception {
			
		//*********** IMAGE OBJECTS *****************
		Pattern txt_AuthPopUp_UserName = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\txt_AuthPopUp_UserName.PNG");
		Pattern txt_AuthPopUp_Password = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\txt_AuthPopUp_Password.PNG");
		Pattern btn_AuthPopUp_SignIn = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\btn_AuthPopUp_SignIn.PNG");


		// *********** SIKULI ACTIONS *************
		// Create an object of Screen class
		//	Note: Don't use wait in ALL type b_Actions if multiple textboxes are present in same window. Use the action directly.
		Screen s = new Screen();
		
		// Step4: Use Sikuli scripts
		s.wait(txt_AuthPopUp_UserName,2).type("admin");
		s.type(Keys.TAB);
		s.wait(txt_AuthPopUp_Password,2).type("admin");

		// Sometimes wait will not bring the cursor to the element in which we need to type. In such cases we should use action directly.
//		s.type(txt_AuthPopUp_Password,"admin");
		//screen.wait(txt_AuthPopUp_Password,2).type("admin");
	
		s.wait(btn_AuthPopUp_SignIn,2).click();
	}

}
