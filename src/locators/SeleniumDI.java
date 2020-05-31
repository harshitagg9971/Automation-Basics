package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDI {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/project/");
		driver.findElement(By.xpath("//h2[text()='Structure']/../..//a[text()='Docker Selenium Committers']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//li[contains(text(),'Docker')]//a[.='@ddavison']")).click();
		
		
	}

}
