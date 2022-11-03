package Pages.Halls;

import Pages.BasePage;
import Utils.Element;
import Utils.FluentWaitBCC;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HallPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Pasillos')]")
    private WebElement btnOptionHall;

    @FindBy(xpath = "//span[contains(text(),'Crear pasillo')]")
    private WebElement btnCreateHall;

    @FindBy(xpath = "//label[text()='Nombre']/..//input")
    private WebElement txtNameHall;

    @FindBy(xpath = "//span[contains(text(),'Cancelar')]/../..//span[contains(text(),'Crear pasillo')]/..")
    private WebElement btnCreateHallMod;

    @FindBy(xpath = "//span[contains(text(),'Asociar pasillo')]")
    private WebElement btnAsociateHall;

    @FindBy(xpath = "//input[contains(@placeholder,'Men\u00FA')]/..")
    private WebElement drownlistmenu;

    @FindBy(xpath = "//div[text()='Tremendo burrito']")
    private WebElement menuToAssociate;

    @FindBy(xpath = "//input[@placeholder='Agregar pasillo']")
    private WebElement hallToMenu;

    @FindBy(xpath = "//button[contains(@class,'btn-large')]//span")
    private WebElement btnGuardar;

    @FindBy(xpath = "//p[contains(text(),'Asociaci\u00F3n actualizada')]")
    private WebElement lblMessageSuccessAssociated;

    @FindBy(xpath = "//p[contains(text(),'Pasillo creado con \u00E9xito')]")
    private WebElement lblMessageSuccess;

    public HallPage(WebDriver driver) {
        super(driver);
    }

    public void createHall(String nameHall) throws InterruptedException {
        btnOptionHall.click();
        btnCreateHall.click();
        txtNameHall.sendKeys(nameHall);
        Thread.sleep(2000);
        btnCreateHallMod.click();
    }

    public void associateHall(String menuToAsociar,String nombrePasillo) throws InterruptedException {
        btnOptionHall.click();
        btnAsociateHall.click();
        drownlistmenu.click();
        menuToAssociate.click();
        hallToMenu.sendKeys(nombrePasillo);
        Thread.sleep(1000);
        hallToMenu.sendKeys(Keys.ENTER);
        FluentWaitBCC.aTimeForElement(btnGuardar);
        btnGuardar.click();
    }

    public void validateMessageCreateHallSuccess(){
        Assert.assertTrue(Element.isVisible(lblMessageSuccess));
    }

    public void validateMessageAsssociatedSuccess(){Assert.assertTrue(Element.isVisible(lblMessageSuccessAssociated));}


}
