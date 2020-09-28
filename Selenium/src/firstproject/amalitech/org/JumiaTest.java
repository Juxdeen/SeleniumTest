package firstproject.amalitech.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JumiaTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);
	driver.manage().window().maximize();

	
	driver.get("https://www.shopintins.com/");
    driver.findElement(By.xpath("//ul[@id='main_cat']/li/a/small/span")).click();
    driver.findElement(By.xpath("//div[@id='art-work-&-cultural-products']/div[3]/div/div/div[2]/div[2]/a/small")).click();
    driver.findElement(By.id("buy_now_btn")).click();
    driver.findElement(By.xpath("//div[2]/a/button")).click();

}


}
