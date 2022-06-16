package Applicationutility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Baselibrary.baselibrary;

public class Applicationutility extends baselibrary {
	
	public static void scroll(WebElement element)
	{
		
		
		Select sel=new Select(element);
		sel.selectByVisibleText("Mumbai, India");
	
	}

}
