package multipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.search.yahoo.com/");
		Thread.sleep(3000);
		WebElement a = driver.findElement(By.xpath("//input[@type='text']"));
		a.sendKeys("qspiders");
		Thread.sleep(3000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//b[contains(text(),'qspiders')]/.."));
		System.out.println(suggestions.size());
		for(int i=0;i<suggestions.size();i++) {
			System.out.println(suggestions.get(i).getText());
		}
		System.out.println("**********************************");
		for(int i=0;i<suggestions.size();i++) 
		{
			if(suggestions.get(i).getText().equals("qspiders logo")) 
			{
				System.out.println(suggestions.get(i).getText());
				suggestions.get(i).click();
				break;
			}
		}

	}

}
