package firstproject.amalitech.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FirstSeleniumProject {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.amalitech.com");

		String title = driver.getTitle();
		if (title.equalsIgnoreCase("Amalitech")) {
			System.out.println("Title Matches");
		} else {
			System.out.println("Title does not match. Please check: " + title);
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.name("s")).click();
	    driver.findElement(By.name("s")).sendKeys("training");
	    driver.findElement(By.name("s")).sendKeys("training");
	    driver.findElement(By.name("s")).sendKeys(Keys.ENTER);
	    driver.findElement(By.linkText("CONTACT")).click();
	    js.executeScript("window.scrollTo(0,300)");
	    driver.findElement(By.id("wpforms-440-field_5_1")).click();
	    driver.switchTo().frame(2);
	    driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();
	    driver.quit();
	}

}
