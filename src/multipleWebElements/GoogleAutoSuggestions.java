package multipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> Suggestions  = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		
		System.out.println(Suggestions.size());
		for(int i=0;i<Suggestions.size();i++)
		{
			System.out.println(Suggestions.get(i).getText());
		}
		//Suggestions.get(3).click();		
		for(int i=0;i<Suggestions.size();i++)
		{
			if(Suggestions.get(i).getText().equals("selenium interview questions"))
			{
				System.out.println(Suggestions.get(i).getText());
				Suggestions.get(i).click();
				break;
			}
		}

	}

}
