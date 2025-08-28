import com.google.common.annotations.VisibleForTesting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BootStrapModalWindow extends Demo {
    public static void main(String[] args)  {


        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://practice-automation.com/modals/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#simpleModal")));
        driver.findElement(By.cssSelector("#simpleModal")).click();
        WebElement modalText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#popmake-1318 p")));
        System.out.println(modalText.getText());
        driver.findElement(By.cssSelector("#popmake-1318 button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#formModal")));
        // form modal
        driver.findElement(By.cssSelector("#formModal")).click();
        WebElement nameField = selectWebElement(By.id("g1051-name"));
        nameField.sendKeys("Interstop");
        WebElement emailField = selectWebElement(By.id("g1051-email"));
        emailField.sendKeys("a@r.ru");//contact-form-success-header
        driver.findElement(By.cssSelector(".pushbutton-wide")).click();
        System.out.println(Demo.selectWebElement(By.id("contact-form-success-header")).getText());
        driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();
        driver.close();
    }
}