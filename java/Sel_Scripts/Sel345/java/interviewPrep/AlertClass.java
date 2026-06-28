package interviewPrep;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.gecko.driver", "C:\\Geckodriver\\geckodriver-v0.37.0-win64\\geckodriver.exe");
     WebDriver driver = new FirefoxDriver();
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
     WebElement element = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
     element.click();
     Alert alert1 = wait.until(ExpectedConditions.alertIsPresent());
     System.out.println("First Alert Text: " + alert1.getText());
     alert1.accept();
     WebElement ele = driver.findElement(By.xpath("//button[@onclick='myMessage()']"));
     ele.click();
     Alert alert2 = wait.until(ExpectedConditions.alertIsPresent());
     System.out.println("Second Alert Text: " + alert2.getText());
     alert2.accept();
     
     WebElement ele1 = driver.findElement(By.xpath("//button[@onclick='myDesk()']"));
     ele1.click();
     Alert alert3 = wait.until(ExpectedConditions.alertIsPresent());
     System.out.println("Third Alert Text: " + alert3.getText());
     alert3.dismiss();
     WebElement ele2 = driver.findElement(By.xpath("//button[@onclick='myPromp()']"));
     ele2.click();
     Alert alert4 = wait.until(ExpectedConditions.alertIsPresent());
     System.out.println("Fourth Alert Text: " + alert4.getText());
     alert4.sendKeys("sindhu");
     Thread.sleep(1000);
     alert4.accept();
     driver.close();
	}

}
