package Fipkart_ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class B_Flipkart_LogoCheck {
	
	@FindBy(xpath="//img[@src=\"//static-assets-web.flixcart.com/fk-p-linchpin-web/fk-cp-zion/img/flipkart-plus_8d85f4.png\"]")
	public static WebElement logo;
	
	@FindBy(xpath="//a[@title=\"Flipkart\"]")
	public static WebElement logotext;
	
	

}
