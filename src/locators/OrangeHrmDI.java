package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmDI {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//b[text()='Admin']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='steven.edwards']/../..//input[@type='checkbox'][@name='chkSelectRow[]']")).click();
		
	}

}
