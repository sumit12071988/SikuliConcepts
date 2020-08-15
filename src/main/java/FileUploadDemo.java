import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadDemo {
	
	@Test
	public void test() throws Exception {
		
		Pattern filepath = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\UploadFile_FilePath.PNG");
		Pattern open = new Pattern(System.getProperty("user.dir")+"\\SikuliImageLibrary\\UploadFile_Open.PNG");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://smallpdf.com/pdf-to-word");
		Thread.sleep(3000);
		// Opening the upload file window
		driver.findElement(By.xpath("//span[contains(text(),'Choose Files')]//ancestor::button")).click();
		
		String file = "dummy.pdf";
		String fileWithFilepath = System.getProperty("user.dir")+"\\TestData\\"+file;
		
		Screen s = new Screen();
		//s.wait(filepath,2).write(fileWithFilepath);
		s.wait(filepath,2).type(fileWithFilepath);
		
		s.click(open);
		
		
	}

}
