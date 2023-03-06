package homePageComponents;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderHomePageTest {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        driver.get("https://manzilik.com");
        boolean isDisplayed = driver.findElement(By.xpath("//*[@id='root']/div[2]/div/header")).isDisplayed();
        System.out.println("is the home navbar empty?" + isDisplayed);
        driver.findElement(By.xpath("//*[@id='root']/div[2]/div/header/div/div/div/div/div/div[1]")).click();
        driver.findElement(By.xpath("//*[@id='root']/div[2]/div/header/div/div/div/div/div/div[2]/div[1]/div[1]")).click();
        driver.findElement(By.xpath("//*[@id='root']/div[2]/div/header/div/div/div/div/div/div[2]/div[1]/div[2]")).click();
        driver.findElement(By.xpath("//*[@id='root']/div[2]/div/header/div/div/div/div/div/div[2]/div[1]/div[3]")).click();
        //*[@id="root"]/div[2]/div/header/div/div/div/div/div/div[2]/div[1]/div[3]
        //*[@id="root"]/div[2]/div/header/div/div/div/div/div/div[2]/div[1]/div[2]
        //*[@id="root"]/div[2]/div/header/div/div/div/div/div/div[2]/div[1]/div[5]
        driver.findElement(By.xpath("//*[@id='root']/div[2]/div/header/div/div/div/div/div/div[2]/div[1]/div[5]")).click();

    }
}
