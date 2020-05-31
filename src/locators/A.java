package locators;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.caratlane.com/");
		
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().frame("__ta_notif_frame_1");
		
		WebDriverWait wait=new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@style='color: rgb(0, 102, 153); cursor: pointer; font-size: 15px; float: right; padding: 1px 3px;']")));
		
		driver.findElement(By.xpath("//div[@style='color: rgb(0, 102, 153); cursor: pointer; font-size: 15px; float: right; padding: 1px 3px;']")).click();
		System.out.println("Harshit");
		driver.close();
	}
}