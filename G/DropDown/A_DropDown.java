package G.DropDown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A_DropDown extends Utils {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("ico-register")).click();

        //1. Approch
    //    driver.findElement(By.name("DateOfBirthDay")).sendKeys("10");
    //    driver.findElement(By.name("DateOfBirthMonth")).sendKeys("July");
    //    driver.findElement(By.name("DateOfBirthYear")).sendKeys("1990");

        //2. Approch
       WebElement Day = driver.findElement(By.name("DateOfBirthDay"));
       WebElement Month = driver.findElement(By.name("DateOfBirthMonth"));
       WebElement Year = driver.findElement(By.name("DateOfBirthYear"));

     //   Day.sendKeys("10"); //2.1 approch
      //  Month.sendKeys("May");
       // Year.sendKeys("1988");

      //  Select select = new Select(Day); //2.2 approch(Select by index) (This approch is more stable than any other approch)
      //  select.selectByIndex(10);
      //  Select select1 = new Select(Month);
     //   select1.selectByIndex(5);
       // Select select2 =new Select(Year);
     //   select2.selectByIndex(4);

        //3.Approch by ( Generic methods - Reusable methods which can be used with different data)
        //           (Create it always outside the main method)
        selectValueFromDropDown(Day,"3");
        selectValueFromDropDown(Month,"April");
        selectValueFromDropDown(Year,"1993");


    }
}
