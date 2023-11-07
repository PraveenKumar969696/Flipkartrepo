package Fipkart_ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class A_Flipkart_Login {
	
	@FindBy(xpath="//span[@ class=\"_30XB9F\"]")
	public static WebElement cancelbutton;
	
	@FindBy(xpath="//div[@class=\"YBLJE4\"]//span[text()=\"Electronics\"]")
	public static WebElement electronics;
	
	@FindBy(xpath="//div[@ class=\"_1kidPb\"]//span[text()=\"Electronics\"]")
	public static WebElement electronicbutton;
	
	@FindBy(xpath="//a[text()=\"Mi\"]")
	public static WebElement edrop1;
	
	@FindBy(xpath="//img[@ src=\"https://rukminim2.flixcart.com/image/312/312/kq6yefk0/mobile/b/2/f/11-lite-m2101k9ai-mi-original-imag496egxryygvz.jpeg?q=70\"]")
	public static WebElement product;
	
	@FindBy(xpath="//li[@ id=\"swatch-0-ram\"]")
	public static WebElement ramselection;
	
	@FindBy(xpath="//ul[@class=\"row\"]//li[@ class=\"col col-6-12\"]//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")
	public static WebElement addtocart;
	
	
	
	
	
	
	
	
	
	
	

}
