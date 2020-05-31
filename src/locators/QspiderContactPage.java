package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspiderContactPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.qspiders.com/contact");
		WebElement phoneno = d.findElement(By.xpath("(//a[.='Noida'])[2]/../../..//div[contains(text(),'+91')]"));
		System.out.println(phoneno.getText());
	}   

}
