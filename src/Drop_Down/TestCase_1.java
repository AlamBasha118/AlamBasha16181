package Drop_Down;

public class TestCase_1 {

	public static void main(String[] args) {
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\SDET Training\\Selenium_Drop_Down_Boxes\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.facebook.com/campaign/landing.php");
			driver.manage().window().maximize();
			
			WebElement month=driver.findElement(By.id("month"));
			
			Select sel=new Select(month);
			List<WebElement>list=sel.getOptions();
			System.out.println("Total list in drop downs is: "+list.size());
			
			for(WebElement drop:list) {
				String st=drop.getText();
				System.out.println(st);
				if(st.equals("May")) {
					drop.click();
				}
			}
			driver.quit();
			
	}

}
