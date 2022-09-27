package A.Seleniumwebdriverbybonigracia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxbyBonigracia {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-login")).click();                       //by classname
        Thread.sleep(3000);                                                     //stop page for 3second
        driver.navigate().back();                                                    //one step back
        driver.navigate().forward();                                                //one step forward
        driver.findElement(By.id("Email")).sendKeys("Test12@gmail.com"); //by id
        driver.findElement(By.name("Password")).sendKeys("Abcd1234");    //by name
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click(); // by xpath
        driver.findElement(By.cssSelector("ul.top-menu:nth-child(1) > li:nth-child(1) > a:nth-child(1)")).click(); //by css selector
        driver.findElement(By.linkText("Register")).click(); // by link text
        driver.findElement(By.partialLinkText("Electro")).click(); //by partial link text
       // driver.findElement(By.tagName("")) // by tag name remaining






    }
}
