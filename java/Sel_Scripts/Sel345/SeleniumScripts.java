package Sel_Scripts.Sel345;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumScripts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Slenium4.4\\Chrome1\\chromedriver-win64\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
	      driver.getCurrentUrl();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      System.out.println("Getting the Current URL: " + driver.getCurrentUrl());
	      WebElement e = driver.findElement(By.id("fullname"));
	      e.sendKeys("First Test Script");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      String text = e.getAttribute("value");
	      System.out.println("Entered text is: " + text);
	     // e.clear();
	      String text1 = e.getAttribute("value");
	      System.out.println("Get text after clearing: " + text1);
	      //driver.quit();
	      
	}

}
