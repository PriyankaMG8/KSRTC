
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class SecondLogin {
@Test

	
	public void bookingB() throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver d1;
	d1=new ChromeDriver();
	
    d1.get("https://ksrtc.in/oprs-web/login/show.do");
    Elements.usernm(d1).sendKeys("priyankagite2506@gmail.com");
    Elements.password(d1).sendKeys("Smart@2022");
 
    
    TakesScreenshot tk2=(TakesScreenshot) d1;
	File Source=tk2.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\gitepriyanka.mahesh\\OneDrive - HCL Technologies Ltd\\Screenshot\\Login2.jpg");
	FileHandler.copy(Source, destination);
	
	Elements.submitbutton(d1).click();
    
    
    
	
	Elements.fromplace(d1).sendKeys("Mysu");
		Thread.sleep(3000);
		List<WebElement> element1=d1.findElements(By.xpath("/html/body/ul[1]/li/a"));
	    for(WebElement el:element1) {
			if(el.getText().equalsIgnoreCase("Mysuru"))
			{
				el.click();
				break;
			
			}
	    }
	
	  
	    Elements.toplace(d1).sendKeys("aati");
		Thread.sleep(3000);
		List<WebElement> element2=d1.findElements(By.xpath("/html/body/ul[2]/li/a"));
	    for(WebElement el:element2) {
			if(el.getText().equalsIgnoreCase("AATINGAL"))
			{
				el.click();
				break;
			
			}
	    }
	    
	   
		JavascriptExecutor jse=(JavascriptExecutor) d1;
		
		jse.executeScript("document.getElementById('txtJourneyDate').value='17/1/2022'");
		
		jse.executeScript("document.getElementById('txtJourneyDate').value='19/1/2022'");
		Elements.js(d1).click();
	
	TakesScreenshot tk3=(TakesScreenshot) d1;
	File Source1=tk3.getScreenshotAs(OutputType.FILE);
	File destination1=new File("C:\\Users\\gitepriyanka.mahesh\\OneDrive - HCL Technologies Ltd\\Screenshot\\Booking5.jpg");
	FileHandler.copy(Source1, destination1);
	}

}

