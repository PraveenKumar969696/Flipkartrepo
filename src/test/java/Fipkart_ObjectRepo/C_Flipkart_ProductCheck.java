package Fipkart_ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class C_Flipkart_ProductCheck {
	
	@FindBy(xpath="//div[@class=\"YBLJE4\"]//span[text()=\"Top Offers\"]")
	public static WebElement topoffer;
	
	
	@FindBy(xpath="//a[@ aria-label=\"Mobiles & Tablets\"]")
	public static WebElement mobiletablets;
	
	@FindBy(xpath="//a[@ aria-label=\"Mobiles & Tablets\"]")
	public static WebElement electronics;
	
	@FindBy(xpath="//a[@ aria-label=\"TVs & Appliances\"]")
	public static WebElement tvandappliences;
	
	@FindBy(xpath="//a[@ aria-label=\"Fashion\"]")
	public static WebElement fashion;
	
	@FindBy(xpath="//a[@ aria-label=\"Beauty\"]")
	public static WebElement beauty;
	
	@FindBy(xpath="//a[@ aria-label=\"Home & Kitchen\"]")
	public static WebElement homeandkitvhen;
	
	@FindBy(xpath="//a[@ aria-label=\"Furniture\"]")
	public static WebElement furniture;
	
	@FindBy(xpath="//a[@ aria-label=\"Flights\"]")
	public static WebElement flights;
	
	@FindBy(xpath="//a[@ aria-label=\"Grocery\"]")
	public static WebElement grocerry;
	

}
