package Utils;

import org.openqa.selenium.WebElement;

import java.io.File;

public class UploadFiles {

    public static void inTheProject(String pathFile, WebElement element) {
        File file = new File(pathFile);
        String path = file.getAbsolutePath();
        element.sendKeys(path);
    }
}
