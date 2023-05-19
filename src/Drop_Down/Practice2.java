package Drop_Down;

public class Practice2 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SDET Training\\Selenium_Drop_Down_Boxes\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/campaign/landing.php");
		driver.manage().window().maximize();
		
		WebElement year=driver.findElement(By.id("year"));
		
		Select sel=new Select(year);
		List<WebElement>list=sel.getOptions();
		System.out.println("Total list in drop downs is: "+list.size());
		
		for(WebElement drop:list) {
			String st=drop.getText();
			System.out.println(st);
			
		}
		driver.quit();
}
}