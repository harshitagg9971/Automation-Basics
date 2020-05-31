package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeDI {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("new work by harshit");;
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='new work by harshit']/../..//a[contains(text(),'delete')]")).click();
	}

}
