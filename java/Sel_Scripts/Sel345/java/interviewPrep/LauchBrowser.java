package interviewPrep;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LauchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Geckodriver\\geckodriver-v0.37.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement user = driver.findElement(By.xpath("//input[@id='user-name']"));
		user.sendKeys("standard_user");
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
		//Alert alert = driver.switchTo().alert();
		//alert.dismiss();
		WebElement dropdown = driver.findElement(By.className("product_sort_container"));
		dropdown.click();
		Select select = new Select(dropdown);
		select.selectByVisibleText("Name (Z to A)");
		Thread.sleep(1000);
		driver.close();
		
	}

}
