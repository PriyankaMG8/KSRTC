

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements {
	public static WebElement username(WebDriver d1) {
	     return d1.findElement(By.name("email"));
		}
	public static WebElement fullname(WebDriver d1) {
	     return d1.findElement(By.id("fullName"));
		}
	public static WebElement mobile(WebDriver d1) {
	     return d1.findElement(By.id("mobileNo"));
		}
	public static WebElement savebutton(WebDriver d1) {
	     return d1.findElement(By.name("SaveBtn"));
		}
	public static WebElement usernm(WebDriver d1) {
	     return d1.findElement(By.id("userName"));
		}
	public static WebElement password(WebDriver d1) {
	     return d1.findElement(By.name("password"));
		}
	public static WebElement submitbutton(WebDriver d1) {
	     return d1.findElement(By.name("submitBtn"));
		}
	public static WebElement fromplace(WebDriver d1) {
	     return d1.findElement(By.id("fromPlaceName")); 
		}
	
	public static WebElement toplace(WebDriver d1) {
	     return d1.findElement(By.id("toPlaceName"));
		}

	public static WebElement js(WebDriver d1) {
    return d1.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button"));
	}
	
	}

