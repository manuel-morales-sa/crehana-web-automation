package Utils;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Wait {
    /*
     * Wait
     *
     * This class is to manage the waits in the different types of time (milliseconds, seconds or minutes)
     * based on the parameters it receives to wait for the status of an element during a limited time or
     * only a limited time
     *
     * */
    private static Calendar calendar = new GregorianCalendar();
    private static Calendar calendar2 = new GregorianCalendar();

    private static void forTime(int timeType , int  waitTime)  {
        calendar.setTime(Calendar.getInstance().getTime());
        calendar.add(timeType,waitTime);
        calendar2.setTime(Calendar.getInstance().getTime());
        while ((calendar.compareTo(calendar2)>= 0)){
            calendar2.setTime(Calendar.getInstance().getTime());
        }
    }

    private static void forTime(WebElement webElement, int timeType , int  waitTime)  {
        calendar.setTime(Calendar.getInstance().getTime());
        calendar.add(timeType,waitTime);
        calendar2.setTime(Calendar.getInstance().getTime());
        while ((calendar.compareTo(calendar2)>= 0)){
            if (Element.isVisible(webElement)){
                break;
            }
            calendar2.setTime(Calendar.getInstance().getTime());
        }
        if (!Element.isVisible(webElement)){
            throw new ElementNotVisibleException("Elemento no visible");
        }
    }

    /*
     * forSecons(MobileElement mobileElement, int  waitTime)
     * forMinutes(MobileElement mobileElement, int  waitTime)
     * forMillisecons(MobileElement mobileElement, int  waitTime)
     *
     * These methods wait for a element to be visible for a limited time
     * */
    public static void forSeconds(WebElement webElement, int  waitTime)  {
        forTime(webElement,Calendar.SECOND, waitTime);
    }

    public static void forMinutes(WebElement webElement, int  waitTime)  {
        forTime(webElement,Calendar.MINUTE, waitTime);
    }

    public static void forMilliseconds(WebElement webElement, int  waitTime)  {
        forTime(webElement,Calendar.MILLISECOND, waitTime);
    }


    /*
     * forSecons( int  waitTime)
     * forMinutes( int  waitTime)
     * forMillisecons( int  waitTime)
     *
     * These methods wait for a certain time
     * */
    public static void forSeconds(int  waitTime)  {
        forTime(Calendar.SECOND, waitTime);
    }

    public static void forMinutes(int  waitTime)  {
        forTime(Calendar.MINUTE, waitTime);
    }

    public static void forMilliseconds(int  waitTime)  {
        forTime(Calendar.MILLISECOND, waitTime);
    }
}
