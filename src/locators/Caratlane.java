package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Caratlane {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.caratlane.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		driver.findElement(By.xpath("//button[.='Change Country']")).click();
		driver.findElement(By.xpath("//button[.='Update Country']")).click();
		driver.findElement(By.xpath("//a[.='RINGS']")).click();
		Thread.sleep(5000);
		String title2 = driver.getTitle();
		System.out.println(title2);
		String URL2 = driver.getCurrentUrl();
		System.out.println(URL2);
		
		  if(title==title2 && URL==URL2) 
		  { 
			  System.out.println("FAIL"); 
		  } 
		  else 
		  {
			  System.out.println("PASS");
		  }
		 
			
		
	}

}
