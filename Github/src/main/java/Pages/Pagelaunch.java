package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Applicationutility.Applicationutility;
import Baselibrary.baselibrary;

public class Pagelaunch extends baselibrary{
	
	
	
	public Pagelaunch() 
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void gettitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
	  
    }
	
	
	@FindBy(xpath = "//*[@class='langCardClose']")
	private WebElement close;
	
	@FindBy(xpath = "//*[@class='chNavText darkGreyText'][text()='Flights']")
	private WebElement flight;
	
	@FindBy(xpath = "//*[text()='From']")
	private WebElement from;
	
	@FindBy(xpath = "//*[text()='Bangalore, India']")
	private WebElement select;
	
	@FindBy(xpath = "//*[text()='To']")
	private WebElement to;
	
	@FindBy(xpath="//*[text()='Delhi, India']")
	private WebElement delhi;
	public void home()
	{ 
		
		close.click();
		flight.click();
		from.click();
		select.click();
		to.click();
		delhi.click();
		to.click();
		delhi.click();
		
		//Applicationutility.scroll(from);
		
	
		
		
	}
	

}
