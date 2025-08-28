import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Date;
import java.util.List;

public class SelectDropDown extends Demo{

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get(url);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        WebElement selectOption = wait.until(ExpectedConditions.elementToBeClickable(By.id("drop1")));
        selectOption.click();
        //create object Select class
        Select select = new Select(selectOption);
        select.selectByVisibleText("doc 4");

        select.selectByIndex(0);

        select.selectByValue("ghi");

        //check if it multiple option element or dropDown
    //    System.out.println(select.isMultiple());

        //get options text of drop menu
        List<WebElement> options = select.getOptions();
        for(WebElement i:options) {
            if (i.getText().equalsIgnoreCase("doc 2")) {
                System.out.println(i.getText());
            }
        }
        //multi-selection boxes

        WebElement menuSelect = wait.until(ExpectedConditions
                .elementToBeClickable(By.id("multiselect1")));

        Select select1 = new Select(menuSelect);
        System.out.println(select1.isMultiple());
        select1.selectByVisibleText("Volvo");
        select1.selectByIndex(1);
        select1.selectByValue("Hyundaix");
        Thread.sleep(2000);
        List<WebElement>selectedOptions = select1.getAllSelectedOptions();
        for (WebElement i:selectedOptions){
            System.out.println(i.getText());
        }
        select1.deselectByValue("Hyundaix");
        select1.deselectByIndex(1);
        Thread.sleep(2000);
        select1.deselectAll();
    /*    List<WebElement> allOptions = select1.getOptions();
        for(WebElement opt:allOptions){
            System.out.println(opt.getText());
        }*/


driver.quit();

    }
    public static void generateTimeStamp(){
        Date date = new Date();
        String exactTime = date.toString().replace(":","_");
        System.out.println(exactTime);
    }
}
