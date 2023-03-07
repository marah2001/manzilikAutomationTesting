package authorization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountPage {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver manzilik_driver = new ChromeDriver();
        manzilik_driver.manage().window().fullscreen();
        manzilik_driver.navigate().to("https://manzilik.com/login");
        WebDriverWait wait = new WebDriverWait(manzilik_driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div[2]/div/main/div/div/div/div/div[1]/div/div/div/span[3]")));
        manzilik_driver.findElement(By.xpath("//*[@id='root']/div[2]/div/main/div/div/div/div/div[1]/div/div/div/span[3]")).click();
        manzilik_driver.findElement(By.xpath("//*[@id='basic']/div[1]/div/div/div/span/span/div/button/span/div/button[2]")).submit();
        manzilik_driver.findElement(By.xpath("//*[@id='basic_username']")).sendKeys("malsafadi10@smail.ucas.edu.ps");
        manzilik_driver.findElement(By.xpath("//*[@id='basic_password']")).sendKeys("malsafadi10@smailps");
        manzilik_driver.findElement(By.xpath("//*[@id='basic_enableAddToIdeabookConfirmation']")).click();
        manzilik_driver.findElement(By.xpath("//*[@id='recaptcha-anchor']/div[1]")).click();
        manzilik_driver.findElement(By.xpath("//*[@id='basic']/button")).submit();


    }
}
