package selenium;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class demo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\JAVA\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
Thread.sleep(3000);

String Login=driver.findElement(By.xpath("//span[@class='_36KMOx']/span ")).getText();
System.out.println(Login);
boolean True=driver.findElement(By.xpath("//span[@class='_36KMOx']/span ")).isDisplayed();
if(True)
{
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

String parent=driver.getWindowHandle();
System.out.println(parent);

Set<String> Li=driver.getWindowHandles();
System.out.println(Li);

driver.findElement(By.xpath("//input[@type='text']")).sendKeys("yamaha piano");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
Thread.sleep(3000);
driver.switchTo().window(parent);
Thread.sleep(3000);

}











//String Title=driver.getTitle();
//System.out.println(Title);
//Dimension count=driver.findElement(By.tagName("a")).getSize();
//System.out.println(count);
//String s=driver.findElement(By.xpath("(//a[@class='nav-item'])[1]")).getText();
//System.out.println(s);
//Thread.sleep(3000);
//String url=driver.getCurrentUrl();
//System.out.println(url);
//Thread.sleep(3000);
//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copyFileToDirectory(src, new File("C:\\Users\\dell\\eclipse-workspace\\selenium\\SS.png"));
//Thread.sleep(3000);
//Actions a=new Actions(driver);
//a.moveToElement(driver.findElement(By.xpath("(//a[@class='nav-item'])[2]"))).build().perform();
//Thread.sleep(3000);
//Thread.sleep(3000);
//driver.quit();

//int count1=driver.findElement(By.tagName("a")).size();
//System.out.println(count1);


//List<WebElement>Li=driver.findElement(By.tagName("a"));
//System.out.println(Li);

//driver.findElement(By.xpath("(//a[@class='nav-item'])[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("(//a[@class='nav-item'])[3]")).click();
//Thread.sleep(3000);

	}

	private static By xpath() {
		// TODO Auto-generated method stub
		return null;
	}

}
