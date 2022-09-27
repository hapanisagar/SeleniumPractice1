package H.ScrolingPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_ScrolingPage {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
      //  driver.get("https://www.zoopla.co.uk/");
        driver.get("https://www.rightmove.co.uk/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div[2]/div/button")).click();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(3000);
      /*  js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(3000);

        WebElement DiscoverYourPerfectLocation = driver.findElement(By.xpath("//*[@id=\"_16qc4nH7bOoJ6ecPZDNc2n\"]/a"));
        js.executeScript("arguments[0].scrollIntoView();",DiscoverYourPerfectLocation);
        Thread.sleep(3000);*/
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        driver.close();



    }


}
