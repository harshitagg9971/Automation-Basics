package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.actitime.com");
		//d.findElement(By.xpath("//a[contains(@type,'actiTIME Inc.')]")).click();
		d.findElement(By.xpath("//a[contains(@id,'toPasswordRecoveryPageLink')]")).click();
		System.out.println("harshit");
		Thread.sleep(5000);
		d.get("https://www.myntra.com/");
		d.findElement(By.xpath("//a[contains(@data-group,'home-&-living')]")).click();
		System.out.println("harshit12qqw");
		

	}

}
