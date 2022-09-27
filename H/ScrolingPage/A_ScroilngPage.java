package H.ScrolingPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_ScroilngPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.get("https://demo.nopcommerce.com/");
        driver.get("https://www.zoopla.co.uk/");
        driver.manage().window().maximize();

        //JsE Interface
        JavascriptExecutor js = (JavascriptExecutor) driver;
      // 1.Scrolling page up to down by using pixel
        Thread.sleep(4000);
           //Abs Method
      js.executeScript("window.scrollBy(0,1000)");
       Thread.sleep(3000);

      //   1.2 Scrolling page down to up by using pixel
        js.executeScript("window.scrollBy(0,-1000)");


      //  2.Scrolling page up to down(till Specific element) by using elements
      /*  WebElement news = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[5]/div[1]/strong"));
        js.executeScript("arguments[0].scrollIntoView();",news); */

       // 3.Scrolling page Top to Bottom
       /* js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);*/

        //3.2Scrolling page  Bottom to Top
       /* js.executeScript("window.scrollTo(document.body.scrollHeight,0)");*/






    }
}
