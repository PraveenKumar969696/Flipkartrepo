package Google;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Googlesearch {

	WebDriver driver;

	@Test
	public void search() throws InterruptedException {
		String name="Selenium";
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		Thread.sleep(5000);
		List<WebElement> l1=driver.findElements(By.xpath("//div[@class=\"OBMEnb\"]//li"));
		for(WebElement l2:l1) {
			System.out.println(l2.getText());
			}
		}


	}



