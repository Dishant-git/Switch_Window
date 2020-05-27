package driverProjects;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindows {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "//home//dishant//Documents//Sample project//Drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("http://qatestingtools.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id='block-system-main']/div/div/div[2]/div/div[2]/a")).click();

	String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
    driver.findElement(By.xpath("//*[contains(text(),'INSURTECH: HOW AI IS ADDRESSING THE INDUSTRY�S KEY CHALLENGES')]")).sendKeys(selectLinkOpeninNewTab);
    driver.findElement(By.xpath("//*[contains(text(),'Challenges of Testing EDI-Based Applications')]")).sendKeys(selectLinkOpeninNewTab);
    driver.findElement(By.xpath("//*[contains(text(),'How Crucial Is Accessibility Testing For The Growth Of Business Application')]")).sendKeys(selectLinkOpeninNewTab);
    driver.findElement(By.xpath("//*[contains(text(),'Agile Regression Testing Best Practices')]")).sendKeys(selectLinkOpeninNewTab);
    
    String parent = driver.getWindowHandle();
    System.out.println("Parent window is"+parent);
    
    Set<String> allWindows = driver.getWindowHandles();
    
    ArrayList<String> tabs = new ArrayList<>(allWindows);
    driver.switchTo().window(tabs.get(3));
    System.out.println("Window title is"+driver.getTitle());
    
    driver.switchTo().window(tabs.get(0));
    driver.findElement(By.xpath("//*[contains(text(),'4 Easy Ways to Maintain Test Automation Suites')]")).sendKeys(selectLinkOpeninNewTab);
    driver.switchTo().window(tabs.get(3));
    System.out.println("Window title is"+driver.getTitle());
	}
}
