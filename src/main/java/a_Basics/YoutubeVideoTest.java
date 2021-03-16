package a_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YoutubeVideoTest {

	@Test
	public void test() throws FindFailed, InterruptedException {

		//*********** IMAGE OBJECTS *****************		
		//Create object for Pattern class to store specific image
		Pattern playBtn = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\YT_Play.PNG");
		Pattern pauseBtn = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\YT_Pause.PNG");
		Pattern settingsBtn = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\YT_Settings.PNG");
		Pattern auto720p = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\YT_Auto720p.PNG");
		Pattern a144p = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\YT_144p.PNG");
		
		
		//*********** DRIVER ACTIONS ************
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=OtQAMoXYqes");

		
		// *********** SIKULI ACTIONS *************
		// Create an object of Screen class
		//	Note: Don't use wait in ALL type b_Actions if multiple textboxes are present in same window. Use the action directly.
		
		Screen s = new Screen();
		
		//Stop the video
		// Wait for the PSI[Pattern, String or Image] and then perform action
		if(s.exists(playBtn) != null) {
			s.wait(playBtn).click();
		}else {
			s.wait(pauseBtn).click();
		}
			//same can be written as
			//s.wait(pauseBtn,2000);
			//s.click();		
		Thread.sleep(5000);
		
		// Resume the video
		s.wait(playBtn,2).click();
		
		// Click on Settings
		s.wait(settingsBtn,2).click();
		
		// Click on Auto720p button
		s.wait(auto720p,2).click();
		
		// Click on 144p button
		s.wait(a144p,2).click();
		
		driver.quit();
	}

}
