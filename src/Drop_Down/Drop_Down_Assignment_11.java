package Drop_Down;

public class Drop_Down_Assignment_11 {

	public static void main(String[] args) {
		public static void main(String[] args) {
			
			//Launching the WebBrowser and application
			System.setProperty("webdriver.chrome.driver", "C:\\SDET Training\\Selenium_Drop_Down_Boxes\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.ebay.com/");
			driver.manage().window().maximize();
			
			//select on Catagories
			WebElement cat=driver.findElement(By.id("gh-cat"));
			
			
			Select sel=new Select(cat);
			
			List<WebElement>list=sel.getOptions();
			System.out.println("Total list in drop downs is: "+list.size());
			
			for(WebElement drop:list) {
				String st=drop.getText();
				System.out.println(st);
				
			}
			driver.quit();
			

		

	}

}
