import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JqueryComboTree extends Demo{

    public static void main(String[] args) {
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        wait =new WebDriverWait(driver, Duration.ofSeconds(10));
      driver.get(jQuery);
      driver.findElement(By.id("justAnotherInputBox")).click();
        WebElement choice2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@data-id ='1'])[3]")));
        choice2.click();
    }
}
