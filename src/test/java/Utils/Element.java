package Utils;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class Element {

    /*
     * Element.isVisible(MobileElement mobileElement)
     *
     * This method is used to validate if an element is visible on the screen.
     *
     * */


    public static boolean isVisible(WebElement webElement) {
        try {
            if (webElement.isDisplayed()) {
                return true;
            }
        }catch (NoSuchElementException|StaleElementReferenceException e){
            return false;
        }
        return false;
    }
}