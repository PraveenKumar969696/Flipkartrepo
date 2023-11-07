package Fipkart_ObjectRepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class E_Flipkart_Alllinks {
	
	@FindBy(tagName="a")
	public static List<WebElement> alllink;

}
