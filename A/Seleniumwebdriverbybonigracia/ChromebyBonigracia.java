package A.Seleniumwebdriverbybonigracia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChromebyBonigracia {
    public static void main(String[] args) {
        //1. set property of webdriver
        WebDriverManager.chromedriver().setup();
        //2.Create Instance of driver
        WebDriver driver =new ChromeDriver();
        //3.and use method
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
       WebDriverWait wait =new WebDriverWait(driver,20);
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click(); //By xpath
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click(); //By xpath
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[6]/a")).click(); //By full xpath
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img")).click();
        //driver.findElement(By.xpath("//span[@class='wishlist-label']")).click();// by custom x path (Property)
        driver.findElement(By.id("small-searchterms")).sendKeys("laptop");
        driver.findElement(By.xpath("//button[@type='submit' and @class='button-1 search-box-button']")).click();//by custom xpath (Properties)


    }
}
