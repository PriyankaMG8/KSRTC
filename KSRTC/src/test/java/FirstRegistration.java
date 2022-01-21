import java.io.File;
import java.io.IOException;


import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FirstRegistration {
	

	@Test
	
	public void Reg() throws IOException, InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	    WebDriver d1;
		d1=new ChromeDriver();
	    d1.get("https://ksrtc.in/oprs-web/user/add.do");
	    Elements.username(d1).sendKeys("priyanka.gite@yahoo.com");
	    Elements.fullname(d1).sendKeys("Priyanka M Gite");
	    Elements.mobile(d1).sendKeys("8087474268");
	    Elements.savebutton(d1).click();
	  
		Thread.sleep(3000);
	  
	    TakesScreenshot tk5=(TakesScreenshot) d1;
		File Source2=tk5.getScreenshotAs(OutputType.FILE);
		File destination2=new File("C:\\Users\\gitepriyanka.mahesh\\OneDrive - HCL Technologies Ltd\\Screenshot\\Registration.jpg");
		FileHandler.copy(Source2, destination2);
}
}
