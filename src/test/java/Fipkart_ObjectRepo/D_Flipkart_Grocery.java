package Fipkart_ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class D_Flipkart_Grocery {
	
	
	@FindBy(xpath="//input[@ name=\"pincode\"]")
	public static WebElement pincode;
	
	@FindBy(xpath="//img[@src=\"https://rukminim2.flixcart.com/flap/128/128/image/50474c.jpg?q=100\"]")
	public static WebElement staples;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[2]/div/div/div[1]/a/div[2]/div[2]/div[2]/div/div/div[2]/a[4]")
	public static WebElement moongdal; 
	
	@FindBy(xpath="//div[text()=\"Price -- Low to High\"]")
	public static  WebElement filter1;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[2]/div[2]/div/div[4]/div/div[3]/div/div/div[3]/button[2]")
	public static WebElement addcart;
	
	@FindBy(xpath="//a[@href=\"/viewcart?exploreMode=true&preference=GROCERY\"]")
	public static WebElement gotocart;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[1]/div/a[1]/img")
	public static WebElement returntohome;
	
	
	
}
