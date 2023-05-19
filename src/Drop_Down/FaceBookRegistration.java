package Drop_Down;

import org.openqa.selenium.WebDriver;

import Com.Wipro.Locators.ChromeDriver;


public class FaceBookRegistration {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SDET Training\\Selenium_Drop_Down_Boxes\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/campaign/landing.php");
		driver.manage().window().maximize();
		
		WebElement month=driver.findElement(By.id("month"));
		
		Select sel=new Select(month);
		sel.selectByIndex(3);
		Thread.sleep(2000);
		
		sel.selectByValue("9");
		Thread.sleep(3000);
		
		sel.selectByVisibleText("Aug");
		
		driver.quit();
		

	}

}
