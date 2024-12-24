package LaunchUltima;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class E2E {

@Test
public void test()
{

        
        // Set up WebDriver
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/client");
        driver.manage().window().maximize();
        driver.findElement(By.id("userEmail")).sendKeys("Test9504@gmail.com");
        driver.findElement(By.id("userPassword")).sendKeys("Test@123");
        driver.findElement(By.id("login")).click();
        
        // Find common locator for each element and store in the list
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("mb-3")));
        List<WebElement> products = driver.findElements(By.className("mb-3"));
        System.out.println("Number of products: " + products.size());
        System.out.println(products);

        // Iterate over the product list
        
        

        System.out.println("Hi");
        driver.quit();
    

	}
}


