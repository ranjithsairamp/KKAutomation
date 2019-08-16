package sele;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class one
{
	public WebDriver driver;
	
	@BeforeTest
	
	public void intia()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void fsttest()
	{
		String titl = driver.getTitle();
		driver.findElement(By.xpath("(//a[@class='gb_e'])[1]")).click();
	}
	


}
