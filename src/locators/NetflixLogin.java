package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.get("https://www.netflix.com/in/Login");
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("harshitagg34@gmail.com");
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("harshite2323");
		System.out.println(d.getTitle());
		d.findElement(By.xpath("//button[@type='submit']")).click();	
		Thread.sleep(5000);
		d.close();
		

	}

}
