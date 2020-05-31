package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Caratlane2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:/selenium files/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.caratlane.com/");
		driver.findElement(By.xpath("//span[@class='emfasap0 css-1e49kwn efp5dbi0']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String title1 = driver.getCurrentUrl();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//div[style,color: rgb(0, 102, 153); cursor: pointer; font-size: 15px; float: right; padding: 1px 3px;]")).click();
		System.out.println(title1);
		if(title.equals(title1)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		driver.close();
		
	}

}
