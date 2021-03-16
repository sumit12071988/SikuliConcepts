package a_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpeningNewTab {
	@Test
	public void openingNewTabTest() throws InterruptedException{
	// Open browser
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize(); 
	driver.get("https://www.google.com");	
	Thread.sleep(2000);
	
	Screen s = new Screen();
	s.type("t",Key.CTRL);
	
	
	Thread.sleep(5000);
	
	 
	driver.close();
	}

}
