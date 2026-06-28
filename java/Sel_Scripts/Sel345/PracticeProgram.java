package Sel_Scripts.Sel345;


import java.time.Duration;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import java.io.IOException;
import org.openqa.selenium.Point;


public class PracticeProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Geckodriver\\geckodriver-v0.37.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		Point targetPosition = new Point(200, 100);
		driver.manage().window().setPosition(targetPosition);
		//driver.close();
		driver.manage().window().maximize();
		
		WebElement user= driver.findElement(By.id("user-name"));
		user.sendKeys("standard_user");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement Login = wait.until(
			    ExpectedConditions.visibilityOfElementLocated(
			        By.name("login-button")));
		
		Login.click();
		Thread.sleep(5000);
		WebElement cart =driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
		cart.click();
		Thread.sleep(5000);
		WebElement content = driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]"));
		content.click();
		Thread.sleep(5000);
		//WebElement logout = driver.findElement(By.className("bm-item menu-item"));
		//logout.click();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(5000);
		driver.close();
		
	}

}
