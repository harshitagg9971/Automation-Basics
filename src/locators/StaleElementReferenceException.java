package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement link = driver.findElement(By.linkText("Forgotten account?"));//using linkText() locator here
		//System.out.println(link.getText()); //here this line will work fine
		link.click();
		//System.out.println(link.getText()); //here this line will not work because after clicking any link page got refreshed
		WebElement link2 = driver.findElement(By.linkText("Forgotten account?"));
		System.out.println(link2.getText());//only way to print text of link is changing the variable name
		//and again finding element and then after that using getText() method to get text of that link
		//so better is to use getText() before clicking the link
		//driver.findElement(By.partialLinkText("Forgotten")).click();//using partialLinkText() locator here
	}

}	