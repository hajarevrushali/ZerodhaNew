package testClasses.copy;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;



public class TC400_Sell {
	@BeforeClass
	public void launcBrowser() {
		System.setProperty("webdriver.chrome.driver",Configurations.driverPath);
		driver = new ChromeDriver();	
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		login = new LoginPagePOM(driver);
		
	}
	
}
