package C.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
     /*
    Explicit Wait is more powerful than implicit wait  - Dynamic wait
    Explicit wait will available inform of WebDriver Wait. (Predefined class - wait class)
    If we don't know the time : The best approach is explicit wait
    It can handle web elements and non web elements
    No explicitly keywords or methods.
    Specific Elements
     */
     public static void main(String[] args) {
         WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         driver.get("https://demo.nopcommerce.com/");
         driver.manage().window().maximize();
         WebDriverWait Wait= new WebDriverWait(driver,20);
      //   Wait.until(ExpectedConditions.titleContains("nopCommerce"));
         driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
         Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")));
         driver.findElement(By.className("ico-login")).click();
         Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Email")));

     }

}
