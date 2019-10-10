package stepDefinitions;

import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import pojo.Login;

public class BaseClass {
public static WebDriver driver;
public static void launchBrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RayappanRaja\\eclipseOxegen\\SlideEgg\\driver\\chromedriver_77.exe");
	 driver= new ChromeDriver();
	 
}
public static void loadUrl(String url) {
	driver.get(url);
}
public static void type(WebElement loc,String in) {
	loc.sendKeys(in);
}
public static void click(WebElement loc) {
	loc.click();
}
public static void implicit() {
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}
public static void explicit(WebElement e) {
	//WebDriverWait w=new WebDriverWait(driver,100);
	Wait<WebDriver> w=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMinutes(100)).pollingEvery(Duration.ofMillis(20)).ignoring(Throwable.class);
	
	//w.until(ExpectedConditions.elementToBeClickable(e));
}
public static void Javascript(WebElement e) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",e);
}
public static void close() {
	driver.close();
}
}



