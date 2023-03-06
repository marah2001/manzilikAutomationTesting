package authorization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;


public class LoginPageTest {
    //    open the website
    //    check if this is  the correct page
    //    insert user email
    //    insert user JPassword
    //    click on register button
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver manzilik_driver = new ChromeDriver();
        manzilik_driver.manage().window().fullscreen();
        manzilik_driver.navigate().to("https://www.manzilik.com/login");
        String forgetPassText = manzilik_driver.findElement(By.xpath("//*[@id='basic']/span/span")).getText();
        System.out.println("Link text is : " + forgetPassText);
        manzilik_driver.findElement(By.xpath("//*[@id='basic_username']")).sendKeys("marah.alsafadi@manzilik.com");
        String emailText = manzilik_driver.findElement(By.xpath("//*[@id='basic_username']")).getText();
        System.out.println("the email is : " + emailText);

        manzilik_driver.findElement(By.xpath("//*[@id='basic_password']")).sendKeys("Marah&2001");
        String passwordText = manzilik_driver.findElement(By.xpath("//*[@id='basic_password']")).getText();
        System.out.println("the password is : " + passwordText);
        WebDriverWait wait = new WebDriverWait(manzilik_driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='basic']/button")));
        manzilik_driver.findElement(By.xpath("//*[@id='basic']/button")).click();
        String buttonText = manzilik_driver.findElement(By.xpath("//*[@id='basic']/button")).getText();
        System.out.println("button text is " + buttonText);
        manzilik_driver.navigate().to("https://www.manzilik.com/login");
        manzilik_driver.findElement(By.xpath("//*[@id='basic']/span/span")).click();
        manzilik_driver.navigate().to("https://www.manzilik.com/login");
//      manzilik_driver.findElement(By.xpath("//*[@id='root']/div[2]/div/main/div/div/div/div/div[1]/div/div/div/span[3]")).click();
        manzilik_driver.findElement(By.xpath("//*[@id='root']/div[2]/div/main/div/div/div/div/div[3]/button")).click();
        manzilik_driver.navigate().to("https://www.manzilik.com/login");
        manzilik_driver.findElement(By.xpath("//*[@id='root']/div[2]/div/main/div/div/div/div/div[1]/div/div/div/span[3]")).click();
        manzilik_driver.findElement(By.xpath("//*[@id='basic_username']")).sendKeys("+970599435076");
        manzilik_driver.findElement(By.xpath("//*[@id='basic_password']")).sendKeys("Marah&2001");
        manzilik_driver.findElement(By.xpath("//*[@id='basic']/div[5]/div/div/div/label/span[1]")).click();
//        manzilik_driver.findElement(By.xpath("//*[@id='rc-anchor-container']/div[3]")).click();

    }
}
