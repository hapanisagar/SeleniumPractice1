package C.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
      /*
    ImplicitWait : Dynamic wait
    Global Wait - Applied for all elements
    Ignore extra seconds- Save time and fast performance
    Anytime we can change the code.
    Implicit wait is available inform of implicitly keyword in selenium
     */
      public static void main(String[] args) {
          WebDriverManager.chromedriver().setup();
          WebDriver driver = new ChromeDriver();
          driver.get("https://demo.nopcommerce.com/");
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
          driver.findElement(By.className("ico-login")).click();
          driver.close(); // for close the current window
      }


}
