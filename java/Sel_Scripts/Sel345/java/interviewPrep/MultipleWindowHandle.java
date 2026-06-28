package interviewPrep;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowHandle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Geckodriver\\geckodriver-v0.37.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		 String mainwindow = driver.getWindowHandle();
		 System.out.println("Main window:" +mainwindow);
	     driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		  Set<String> allwindows = driver.getWindowHandles();
		  for(String handle : allwindows) {
			  System.out.println(handle);
			  if(!handle.equals(mainwindow)){
				  driver.switchTo().window(handle);
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				  js.executeScript("window.scrollBy(0, 10000)");
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				  driver.findElement(By.name("fName")).sendKeys("sindhu");
				  Thread.sleep(5000);
				  driver.close();
			  }
		  }
		  driver.switchTo().window(mainwindow);
		  driver.findElement(By.id("name")).sendKeys("Mysore");
		  Thread.sleep(2000);
		  driver.quit();
		
		}

}
