package webElement;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSetPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println(" X point -"+driver.manage().window().getPosition().getX());
		System.out.println(" Y point -"+driver.manage().window().getPosition().getY());
		driver.manage().window().setPosition(new Point(1400, 0));
	}

}
