package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule.Priority;

import Baselibrary.baselibrary;
import Pages.Pagelaunch;


public class Testlaunch extends baselibrary {
	
	Pagelaunch ob;
	
	@Parameters("browser")
	@BeforeTest
	
	public void launch(String browser ) throws Exception
	{
		
		
		getlaunch(browser);
		ob= new Pagelaunch();
	}

	@Test(priority = 0)
	
   public void valid()
  
   {	
    	ob.gettitle();
    	ob.home();
    }
	

}
