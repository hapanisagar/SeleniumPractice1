package E.FileUpload;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_FileUpload {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
        driver.manage().window().maximize();

        Thread.sleep(5000);
        driver.findElement(By.name("upfile")).sendKeys("C:\\Software\\Testing.docx");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/form/input[3]")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
