package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileHippoDI {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.filehippo.com");
		driver.findElement(By.xpath("//a[text()='Popular software']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[text()='Google Chrome']/../../../../..//span[text()='Download']")).click();

	}

}
