package Sel_Scripts.Sel345;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumScript1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        System.out.println("TITLE: " + driver.getTitle());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement searchBox = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox"))
        );

        searchBox.sendKeys("laptop");
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement searchBox1 = wait1.until(
            ExpectedConditions.visibilityOfElementLocated(By.id("nav-search-submit-button")));
        
        searchBox1.click();
        
        WebElement searchBox2 = wait1.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".a-size-medium.a-spacing-none.a-color-base.a-text-normal")));
     
        searchBox2.click();;

    }
}

		
		

	


