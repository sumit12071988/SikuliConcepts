

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailAuthenticationDemo {

	@Test
	public void test() throws Exception {
		
		
		//*********** IMAGE OBJECTS *****************
		Pattern link_Gmail = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\link_Gmail.PNG");
		Pattern link_SignIn = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\link_SignIn.PNG");
		Pattern txt_Username = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\txt_Username.PNG");
		Pattern btn_Next = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\btn_Next.PNG");
		Pattern txt_Password = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\newPassword.PNG");	
		
		
		
		
		
		//*********** DRIVER ACTIONS ************
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.google.com/");
		
		
		
		// *********** SIKULI ACTIONS *************
		// Create an object of Screen class
		//	Note: Don't use wait in ALL type actions if multiple textboxes are present in same window. Use the action directly.
		
		Screen s = new Screen();
		
		s.wait(link_Gmail,8).click();
		s.wait(link_SignIn,8).click();
		s.wait(txt_Username,8).type("deals4sumit@gmail.com");
		s.wait(btn_Next,8).click();
		s.type(txt_Password,"#Adm4n2020");
		s.wait(btn_Next,8).click();
		
		Thread.sleep(8000);
		
		driver.quit();
	}

}
