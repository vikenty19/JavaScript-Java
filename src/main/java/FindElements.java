import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static String url = "https://omayo.blogspot.com";
    static String KoelUrl = "http://qa.koel.app";
    static String URL = "http://tutorialsninja.com/demo/";

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

       List<WebElement> options =driver.findElements(By.cssSelector("#multiselect1 option"));
        for (WebElement e:options) {
            System.out.println(e.getText());
        }

       

        String path = "(//div[@id='LinkList1']//a)";
        List<WebElement> linkS = driver.findElements(By.xpath(path));
        System.out.println(linkS.size());
        for (int i=1;i<=linkS.size();i++){
            String elementPath = path+"["+i+"]";
            if(i==3){
              continue;//because 3 link disabled
            }
            System.out.println(elementPath);
            driver.findElement(By.xpath(elementPath)).click();
            Thread.sleep(1000);
            driver.navigate().back();
        }
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        for (WebElement e : allLinks) {
            if (e.getAttribute("href") != null) {
                System.out.println(e.getAttribute("href"));
            }

        }
            driver.quit();

    }
}


