import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class JqueryComboTree extends Demo{

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        wait =new WebDriverWait(driver, Duration.ofSeconds(10));
      driver.get(jQuery);
      driver.findElement(By.id("justAnotherInputBox")).click();
        WebElement choice2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@data-id ='1'])[3]")));
        choice2.click();
        Thread.sleep(2000);
        //multiselect
        By multiSelectBox = By.id("justAnInputBox");
        driver.findElement(multiSelectBox).click();
      /*  driver.findElement(By.xpath("(//span[contains(text(),'choice 3')])[1]")).click();
        driver.findElement(By.xpath("(//span[contains(text(),'choice 2 2')])[1]")).click();
        driver.findElement(By.xpath("(//span[contains(text(),'choice 1')])[1]")).click();*/
        List<WebElement> allCheckBoxes = driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
        int count = 0;
           for (WebElement temp:allCheckBoxes){
               try {
                   temp.click();
                   count++;
               }catch (Exception e){}

           } System.out.println("All checked  "+ count);
    }
}
