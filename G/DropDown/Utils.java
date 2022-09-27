package G.DropDown;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utils {
    //( Generic methods - Reusable methods which can be used with different data)
    //           (Create it always outside the main method)

    public static void selectValueFromDropDown(WebElement element,String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);




    }
}
