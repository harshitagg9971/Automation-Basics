package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathTraversing {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://irctc.com/contact.html");
		d.findElement(By.xpath("//a[text()=' North Zone ']")).click();
		WebElement link= d.findElement(By.xpath("//h6[contains(text(),' Regional')]/..//li[2]"));
		System.out.println(link.getText());
	}

}
