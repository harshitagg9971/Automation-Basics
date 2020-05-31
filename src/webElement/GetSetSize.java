package webElement;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSetSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println(driver.manage().window().getSize());
		Dimension d=new Dimension(400, 600);
		//driver.manage().window().setSize(d);
		
	}

}
