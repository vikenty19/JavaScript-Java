import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AutoSuggestDropDown extends Demo{
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        wait =new WebDriverWait(driver, Duration.ofSeconds(10));
       driver.get(autoSuggest);
        WebElement closeAd = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("section .commonModal__close")));
      //  closeAd.click();
        Actions actions=new Actions(driver);
        actions.moveToElement(closeAd).click().build().perform();
        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.id("fromCity")));
        inputField.click();
        Thread.sleep(2000);
        WebElement inputCity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div>[type='text']")));
      //  inputCity.sendKeys("Bangalor");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].value='Chicago'",inputCity);
        Thread.sleep(5000);
       // WebElement city = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-autowhatever-1-section-0-item-3")));
       // city.click();
        for(int i=1;i<=4;i++) {
            System.out.println("We in the loop");
            Thread.sleep(2000);
          inputCity.sendKeys(Keys.ARROW_DOWN);
        }
      inputCity.sendKeys(Keys.ENTER);


    }
}
