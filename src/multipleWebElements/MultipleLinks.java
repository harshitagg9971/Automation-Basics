package multipleWebElements;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinks {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///G:/selenium%20study%20material/april28(Handling%20multiple%20webelements,Auto%20%20suggestions%20handling)/MultipleElements.html");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("Total no. of links - "+links.size());//it will print total no. of links present in specified webpage
		//links.get(5).click();
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
		}
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Total no. of checkbox - "+checkbox.size());
		
//		  for(int i=0;i<checkbox.size();i++) 
//		  { 
//			  Thread.sleep(1000);//just to seecheckbox clicking 
//			  checkbox.get(i).click();
//		  }
		 
//		for(int i=0;i<checkbox.size();i=i+2)
//		{
//			Thread.sleep(1000);//just to see checkbox clicking
//			checkbox.get(i).click();
//			
//		}
		/*
		 * for(int i=1;i<checkbox.size();i=i+2) { Thread.sleep(1000);//just to see
		 * checkbox clicking checkbox.get(i).click(); }
		 */		
		/*
		 * for(int i=checkbox.size()-1;i>=0;i--) { Thread.sleep(1000);//just to see
		 * checkbox clicking checkbox.get(i).click(); }
		 */		
		for(int i=checkbox.size()-1;i>=0;i=i-2)
		{
			Thread.sleep(1000);//just to see checkbox clicking
			checkbox.get(i).click();			
		}

	}

}
