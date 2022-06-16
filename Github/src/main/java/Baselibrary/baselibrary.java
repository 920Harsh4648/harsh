package Baselibrary;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baselibrary {
	public static WebDriver driver;

	 
	public void getlaunch(String browser)
	{
		

	
		  
		if(browser.equalsIgnoreCase("chrome"))
		{
			
			         
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		//HashMap<String,Integer> contentSetting=new HashMap<String,Integer>();
		//HashMap<String,Object> profile=new HashMap<String,Object>();
		//Map prefs=new HashMap();
		//contentSetting.put("notification",0 );
		//profile.put("managed_default_content_setting",contentSetting);
		//prefs.put("profile.default_content_setting_values.notifications",0);
		//prefs.put("profile.default_content_setting_values.geolocation",2);
		//prefs.put("profile.default_content_setting_values.media_stream_mic",1);
		//prefs.put("profile.default_content_setting_values.media_stream_camera",1);
		//options.setExperimentalOption("prefs", prefs);
		//options.setHeadless(true);
		
		
		
        //options.addArguments("--enabled-notifications"); 
		driver =new ChromeDriver();
		String URL="https://www.makemytrip.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(URL);
	
	       
		}
		
		else {
		
		
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options=new FirefoxOptions();
//			options.setHeadless(true);
			driver =new FirefoxDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);     
			String URL="https://www.makemytrip.com/";
			driver.navigate().to(URL);
		        
		        
		}
	
				
		
	}
	
	
}
