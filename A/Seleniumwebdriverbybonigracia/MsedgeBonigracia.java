package A.Seleniumwebdriverbybonigracia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MsedgeBonigracia {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("ico-login")).click(); //BY class name
        driver.findElement(By.id("Email")).sendKeys("Test@gmail.com"); //by id
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("abcd1234"); //by X Path
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click(); //by x path
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[class=\"ico-register\"]")).click(); // by css selector
        driver.findElement(By.linkText("Jewelry")).click(); //by link Text
        driver.findElement(By.linkText("View all")).click(); // by link Text
        driver.findElement(By.partialLinkText("Digital")).click(); //by Partial Link text









    }

}
