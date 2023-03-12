package authorization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgetPassPageTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver manzilik_driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        manzilik_driver = new ChromeDriver(options);
        manzilik_driver.get("https://manzilik.com");
        boolean isDisplayed = manzilik_driver.findElement(By.xpath("//*[@id='root']/div[2]/div/main/div/div/div[2]/div")).isDisplayed();
        System.out.println("Is the reset password card displayed? " + isDisplayed);
        manzilik_driver.findElement(By.xpath("//*[@id='basic']/div[2]/div/div/div/button")).click();
        manzilik_driver.findElement(By.xpath("//*[@id='basic']/div[1]/div/div/div/span/span/div/button/span/div/button[1]")).click();
        manzilik_driver.findElement(By.xpath("//*[@id='basic_username']")).sendKeys("+970599435076");
//        Web wait = new WebDriverWait(manzilik_driver, 20);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='basic']/div[2]/div/div/div/button")));
//        manzilik_driver.findElement(By.xpath("//*[@id='basic']/div[2]/div/div/div/button")).click();

        manzilik_driver.findElement(By.xpath("//*[@id='basic']/div[1]/div/div/div/span/span/div/button/span/div/button[2]")).click();
        manzilik_driver.findElement(By.xpath("//*[@id='basic_username']")).sendKeys("marah.alsafadi@manzilik.com");
//        WebDriverWait wait = new WebDriverWait(manzilik_driver, 20);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='basic']/div[2]/div/div/div/button")));
        manzilik_driver.findElement(By.xpath("//*[@id='basic']/div[2]/div/div/div/button")).click();
        System.out.println("ready to production");
//

    }
}
