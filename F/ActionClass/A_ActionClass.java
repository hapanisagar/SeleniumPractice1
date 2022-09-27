package F.ActionClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_ActionClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
      //  driver.get("https://jqueryui.com/droppable/"); in this url action is not working
        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
        driver.manage().window().maximize();

        WebElement sourceElements = driver.findElement(By.id("draggable"));
        WebElement targetElements = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        Thread.sleep(2000);
        action.dragAndDrop(sourceElements,targetElements).build().perform();

    }
}
