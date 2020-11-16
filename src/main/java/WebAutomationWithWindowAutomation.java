

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebAutomationWithWindowAutomation {

	@Test
	public void test() throws Exception {
		
		
		//*********** IMAGE OBJECTS(WebAutomation + Window Automation) *****************
		Pattern link_Gmail = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\link_Gmail.PNG");
		Pattern link_SignIn = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\link_SignIn.PNG");
		Pattern txt_Username = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\txt_Username.PNG");
		Pattern btn_Next = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\btn_Next.PNG");
		Pattern txt_Password = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\newPassword.PNG");
		Pattern successfulLogin_verifier = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\gmailSuccessfulLogin.png");
		
		Pattern calc = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\Calculator.PNG");
		Pattern result = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\resultVerifier.PNG");
		Pattern close = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\1601562383702.PNG");
		Pattern runWindowIdentifier = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\1601601573699.png");
		Pattern notepadIdentifier = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\1601601496495.png");
		Pattern formatBtn = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\Format.png");
		Pattern wordWrapBtn = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\WordWrap.png");
		Pattern closeBtn = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\1601602029214.png");
		Pattern dontSaveBtn = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\1601602366665.png");
		
		
		
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
		s.wait(txt_Password);
		s.type(txt_Password,"#Adm4n2020");
		s.wait(btn_Next,8).click();
		Thread.sleep(8000);
		s.wait(successfulLogin_verifier);
		driver.quit();
		
		s.type("r", Key.WIN);
		s.wait(2.0);
		s.type("calc"+Key.ENTER);
		s.wait(4.0);
		s.wait(calc);
		s.click(calc.targetOffset(-66,97));
		s.click(calc.targetOffset(190,93));
		s.click(calc.targetOffset(-65,-13));
		s.click(calc.targetOffset(194,150));
		s.wait(result);
		s.click(close.targetOffset(56,0));
		s.type("r", Key.WIN);
		s.wait(0.5);
		s.type(runWindowIdentifier,"notepad"+Key.ENTER);
		s.wait(notepadIdentifier);
		s.type("Greetings Viewer !!");
		s.type(Key.ENTER);
		s.type("Thanks for your time so sikuli can showcase its capability to automate Thick Client Applications. Hope you like it ^_^ ");
		s.click(formatBtn);
		s.click(wordWrapBtn.similar(0.50).targetOffset(-13,-12));
		s.click(closeBtn.targetOffset(37,0));
		s.click(dontSaveBtn.targetOffset(0,1));
	}

}
