package homePageComponents.headerElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrandsElementTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://manzilik.com");
        driver.findElement(By.xpath("//*[@id='root']/div[2]/div[1]/header/div/div/div/div/div[2]/div/div/div[3]/a/div/span"))
                .click();
    }
}
