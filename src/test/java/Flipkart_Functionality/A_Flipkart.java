package Flipkart_Functionality;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Fipkart_ObjectRepo.A_Flipkart_Login;
import Fipkart_ObjectRepo.B_Flipkart_LogoCheck;
import Fipkart_ObjectRepo.C_Flipkart_ProductCheck;
import Fipkart_ObjectRepo.D_Flipkart_Grocery;
import Fipkart_ObjectRepo.E_Flipkart_Alllinks;

public class A_Flipkart {

	WebDriver driver;

	@Test
	public void setup() {
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void addcart() throws InterruptedException, IOException {
		PageFactory.initElements(driver,A_Flipkart_Login.class);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions a1=new Actions(driver);
		Thread.sleep(5000);
		A_Flipkart_Login.cancelbutton.click();
		Thread.sleep(5000);
		A_Flipkart_Login.electronics.click();
		Thread.sleep(5000);
		A_Flipkart_Login.electronicbutton.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		A_Flipkart_Login.edrop1.click();
		Thread.sleep(4000);
		js.executeScript("arguments[0].scrollIntoView(true);",A_Flipkart_Login.product );
		Thread.sleep(5000);
		A_Flipkart_Login.product.click();
		String mainwindow=driver.getWindowHandle();
		Set<String>s1=driver.getWindowHandles();
		Iterator<String>i1=s1.iterator();
		while(i1.hasNext()) {
			String childwindow=i1.next();
			if(!mainwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
			}
		}
		Thread.sleep(5000);
		a1.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(5000);
		A_Flipkart_Login.ramselection.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		A_Flipkart_Login.addtocart.click();
		Thread.sleep(5000);
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("/Users/apple/eclipse-workspace/Flipkart/src/test/java/Screenshots/Screenshot1.png"));
		Thread.sleep(5000);
		driver.switchTo().window(mainwindow);
	}


	@Test
	public void logocheck() throws InterruptedException {
		String title1="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		PageFactory.initElements(driver,B_Flipkart_LogoCheck.class);
		Thread.sleep(5000);
		B_Flipkart_LogoCheck.logo.click();
		String title2=driver.getTitle();
		if(title2.equalsIgnoreCase(title1)) {
			System.out.println("title is matched");
		}
		else {
			System.out.println("title is not matched");
		}	
	}

	@Test
	public void allproduct() throws InterruptedException {
		PageFactory.initElements(driver,C_Flipkart_ProductCheck.class);
		C_Flipkart_ProductCheck.topoffer.click();
		String title1=driver.getTitle();
		System.out.println(title1);
		driver.navigate().back();
		C_Flipkart_ProductCheck.mobiletablets.click();
		String title2=driver.getTitle();
		System.out.println(title2);
		driver.navigate().back();
		C_Flipkart_ProductCheck.electronics.click();
		String title3=driver.getTitle();
		System.out.println(title3);
		driver.navigate().back();
		C_Flipkart_ProductCheck.tvandappliences.click();
		String title4=driver.getTitle();
		System.out.println(title4);
		driver.navigate().back();
		C_Flipkart_ProductCheck.fashion.click();
		String title5=driver.getTitle();
		System.out.println(title5);
		driver.navigate().back();
		C_Flipkart_ProductCheck.beauty.click();
		String title6=driver.getTitle();
		System.out.println(title6);
		driver.navigate().back();
		C_Flipkart_ProductCheck.homeandkitvhen.click();
		String title7=driver.getTitle();
		System.out.println(title7);
		driver.navigate().back();
		C_Flipkart_ProductCheck.furniture.click();
		String title8=driver.getTitle();
		System.out.println(title8);
		driver.navigate().back();
		C_Flipkart_ProductCheck.grocerry.click();
	}
	
	
	@Test
	public void groceryall() throws InterruptedException, IOException {
		Actions a1=new Actions(driver);
		PageFactory.initElements(driver,D_Flipkart_Grocery.class);
		PageFactory.initElements(driver,A_Flipkart_Login.class);
		D_Flipkart_Grocery.pincode.sendKeys("600032");
		a1.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(4000);
		a1.moveToElement(D_Flipkart_Grocery.staples).build().perform();
		Thread.sleep(5000);
		D_Flipkart_Grocery.moongdal.click();
		Thread.sleep(4000);
		D_Flipkart_Grocery.filter1.click();
		Thread.sleep(4000);
		a1.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(8000);
		D_Flipkart_Grocery.addcart.click();
		Thread.sleep(5000);
		a1.sendKeys(Keys.PAGE_UP).build().perform();
		D_Flipkart_Grocery.gotocart.click();
		Thread.sleep(5000);
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("/Users/apple/eclipse-workspace/Flipkart/src/test/java/Screenshots/Screenshot2.png"));
		Thread.sleep(5000);
		D_Flipkart_Grocery.returntohome.click();
		Thread.sleep(8000);
		//Thread.sleep(5000);
		//A_Flipkart_Login.cancelbutton.click();
		//Thread.sleep(10000);
		
		
	}
	
	@Test
	public void links() throws IOException, InterruptedException {
	
		PageFactory.initElements(driver, E_Flipkart_Alllinks.class);
		int size=E_Flipkart_Alllinks.alllink.size();
		System.out.println();
		System.out.println(size);
		
		for(int i=0;i<=size;i++) {
			WebElement element= E_Flipkart_Alllinks.alllink.get(i);
			String url=element.getAttribute("href");
			
			URL link=new URL(url);
			HttpURLConnection httpcon=(HttpURLConnection) link.openConnection();
			Thread.sleep(5000);
			httpcon.connect();
			int responsecode=httpcon.getResponseCode();
			
			if(responsecode>=400) {
				System.out.println(url+" - "+"is broken link");
			}else {
				System.out.println(url+" - "+"is not broken link");
			}
			
		}
		
		
	}

	@Test
	public void teardown() {
		driver.quit();
	}



}
