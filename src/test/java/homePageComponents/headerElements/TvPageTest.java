package homePageComponents.headerElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class TvPageTest {
    //*[@id="more-entities-popover"]/div/div/div[1]/div/span
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://manzilik.com");

//        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Toolsqa\\lib\\geckodriver.exe");

        // Launch the URL
//        driver.get("https://demoqa.com/menu/");
        System.out.println("manzilik webpage Displayed");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(By.xpath("//*[@id='root']/div[2]/div[1]/header/div/div/div/div/div/div[2]/div[1]/div[6]/div"));
        actions.moveToElement(menuOption).perform();
        System.out.println("Done Mouse hover on 'more' from Menu");
        WebElement subMenuOption = driver.findElement(By.xpath("//*[@id='false']/div/div/div[1]/div/span"));
//        actions.moveToElement(subMenuOption).perform();
        System.out.println("Done Mouse hover on 'tv' from Menu");
//        WebElement selectMenuOption = driver.findElement(By.xpath(".//div[contains(text(),'Alternative')]"));
        subMenuOption.click();
        System.out.println("Selected 'tv' from Menu");
        // Close the main window
        driver.close();

    }
}
