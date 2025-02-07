import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class RobotScroll extends Demo{
    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Robot robot = new Robot();
        //scrolling with numbers the more the deeper
        robot.mouseWheel(15); //scroll down
        robot.delay(1000);// the same as Thread.sleep(1000);
        robot.mouseWheel(-8);//scroll up

    }

}
