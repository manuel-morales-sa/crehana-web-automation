package Pages.Days;

import Pages.BasePage;
import Utils.Element;
import Utils.FluentWaitBCC;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static Pages.Menus.MenuPage.btnRegistroXPagina;
import static Pages.Menus.MenuPage.optNumRegistroXPagina;

public class DayPage extends BasePage {

    @FindBy(xpath = "//span[text()='D\u00EDas']/..")
    private WebElement btnModDays;

    @FindBy(xpath = "//span[contains(text(),'Crear nuevo d\u00EDa')]/..")
    private WebElement btnCreateDay;

    @FindBy(xpath = "//input[@placeholder='D\u00EDa']")
    private WebElement txtDay;

    @FindBy(xpath = "//small[contains(text(),'¿Es festivo o d\u00EDa especial?')]//following::span[contains(text(),'Crear')]/..")
    private WebElement btnPopPupCreateDay;

    @FindBy(xpath = "//td[contains(text(),'%s')]/..//child::i[contains(@class,'fm-icon-edit')]")
    private WebElement btnEditDay;

    @FindBy(xpath = "//small[contains(text(),'¿Es festivo o día especial?')]//following::span[contains(text(),'Guardar')]/..")
    private WebElement btnPopPupSaveDay;

    @FindBy(xpath = "//p[text()='Día creado con éxito']")
    private WebElement lblSucessCreatedDay;

    @FindBy(xpath = "//span[text()='Aceptar']")
    public static WebElement btnAccept;

    @FindBy(xpath = "//p[text()='D\u00EDa guardado con \u00E9xito']")
    private WebElement lblSucessEditDay;

    @FindBy(xpath = "//p[contains(text(),'already exists')]")
    private WebElement lblExistDay;

    @FindBy(xpath = "//p[contains(text(),'is not allowed to be deleted')]")
    private WebElement lblDayNotAllowed;

    public DayPage(WebDriver driver) {
        super(driver);
    }

    public void createNewDay(String nameDay) throws InterruptedException {
        btnModDays.click();
        btnCreateDay.click();
        txtDay.sendKeys(nameDay);
        FluentWaitBCC.aTimeForElement(btnPopPupCreateDay);
        btnPopPupCreateDay.click();
    }
    public void editDay(String dayForEdit, String newNameForEdit) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String selectAll = Keys.chord(Keys.COMMAND, "a");
        btnModDays.click();
        js.executeScript("arguments[0].scrollIntoView();", btnRegistroXPagina);
        FluentWaitBCC.aTimeForElement(btnRegistroXPagina);
        btnRegistroXPagina.click();
        optNumRegistroXPagina.click();
        String newXpath = "//td[contains(text(),'%s')]/..//child::i[contains(@class,'fm-icon-edit')]";
        newXpath = newXpath.replace("%s",dayForEdit);
        FluentWaitBCC.aTimeForElement(driver.findElement(By.xpath(newXpath)));
        driver.findElement(By.xpath(newXpath)).click();
        FluentWaitBCC.aTimeForElement(driver.findElement(By.xpath("//input[@placeholder='Fecha']/..")));
        driver.findElement(By.xpath("//input[@placeholder='Fecha']/..")).click();
        driver.findElement(By.xpath("//input[@placeholder='Fecha']")).sendKeys(selectAll);
        driver.findElement(By.xpath("//input[@placeholder='Fecha']")).sendKeys("20/02/2022");
        driver.findElement(By.xpath("//h3[contains(text(),'Editar')]")).click();
        txtDay.click();
        txtDay.sendKeys(selectAll);
        txtDay.sendKeys(newNameForEdit);
        btnPopPupSaveDay.click();
        btnAccept.click();
    }

    public void tryDeleteWeekDays(String dayToDelete) throws InterruptedException {
        btnModDays.click();
        FluentWaitBCC.aTimeForElement(btnRegistroXPagina);
        btnRegistroXPagina.click();
        optNumRegistroXPagina.click();
        String newXpath = "//td[contains(text(),'%s')]/..//child::i[contains(@class,'fm-icon-delete')]";
        newXpath = newXpath.replace("%s",dayToDelete);
        FluentWaitBCC.aTimeForElement(driver.findElement(By.xpath(newXpath)));
        driver.findElement(By.xpath(newXpath)).click();
        FluentWaitBCC.aTimeForElement(btnAccept);
        btnAccept.click();
    }

    public void validateMessageSuccessEditDay(){
        Assert.assertTrue(Element.isVisible(lblSucessEditDay));
    }

    public void validateMessageSuccessCreateNewDay(){
        FluentWaitBCC.aTimeForElement(lblSucessCreatedDay);
        Assert.assertTrue(Element.isVisible(lblSucessCreatedDay));}

    public void validateMessageExistsDay(){
        FluentWaitBCC.aTimeForElement(lblExistDay);
        Assert.assertTrue(Element.isVisible(lblExistDay));}

    public void validateMessageDayNotAllowedToBeDeleted(){
        FluentWaitBCC.aTimeForElement(lblDayNotAllowed);
        Assert.assertTrue(Element.isVisible(lblDayNotAllowed));}
}