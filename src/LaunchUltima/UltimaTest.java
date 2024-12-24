package LaunchUltima;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class UltimaTest extends BaseTest {

    @Test
    public void testUltimaSearch() throws InterruptedException {
        driver.get("https://www.easemytrip.com");
        String title = driver.getTitle();
        System.out.println(title);

    }
        
        @Test(priority = 1)
        public void runFirt()
        {
        	System.out.println("first");
        }
        
        @Test(priority = 0)
        public void color()
        {
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("._btnclick")));
        	WebElement ele= driver.findElement(By.cssSelector("._btnclick"));
        	String col = ele.getCssValue("Color");
        	System.out.println(col);
        	
        	}
}
