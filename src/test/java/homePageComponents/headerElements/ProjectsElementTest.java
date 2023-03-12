package homePageComponents.headerElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProjectsElementTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://manzilik.com");
        driver.findElement(By.xpath("//*[@id='root']/div[2]/div[1]/header/div/div/div/div/div[1]/div[3]/div/div[1]/button")).click();
        driver.navigate().to("https://www.manzilik.com/login");
        driver.findElement(By.xpath("//*[@id='basic_username']")).sendKeys("marah.alsafadi@manzilik.com");
        String emailText = driver.findElement(By.xpath("//*[@id='basic_username']")).getText();
        System.out.println("the email is : " + emailText);

        driver.findElement(By.xpath("//*[@id='basic_password']")).sendKeys("Marah&1511");
        String passwordText = driver.findElement(By.xpath("//*[@id='basic_password']")).getText();
        System.out.println("the password is : " + passwordText);
        driver.findElement(By.xpath("//*[@id='basic']/button")).click();
        String currentUrl = driver.getCurrentUrl();
        System.out.println("current url is : " + currentUrl);
//        driver.navigate().to("https://www.manzilik.com");

        /*
        *
      WebDriverWait waitForUsername = new WebDriverWait(Driver, 5000);
      waitForUsername.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")))
      * */

    }

}
