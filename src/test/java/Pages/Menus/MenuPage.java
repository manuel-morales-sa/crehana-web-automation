package Pages.Menus;

import Pages.BasePage;
import Utils.Element;
import Utils.FluentWaitBCC;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static Pages.Days.DayPage.btnAccept;

public class MenuPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Crear men')]")
    private WebElement btnCrearMenuPpal;

    @FindBy(xpath = "(//div[@class='v-radio theme--light'])[2]")
    private WebElement imgMarca;

    @FindBy(xpath = "//label[text()='Nombre']/..//input")
    private WebElement txtNombreFlujo;

    @FindBy(xpath = "//footer[@class='fm-modal-footer']//span[contains(text(),'Crear men')]")
    private WebElement btnCrearMenuMod;

    @FindBy(xpath = "//p[contains(text(),'creado con \u00E9xito')]")
    private WebElement lblMenuCreadoOK;

    @FindBy(xpath = "//div[@class='v-input__icon v-input__icon--append']")
    public static WebElement btnRegistroXPagina;

    @FindBy(xpath = "//div[text()='100']")
    public static WebElement optNumRegistroXPagina;

    @FindBy(xpath = "//label[text()='Agregar tienda']/..//input[@type='text']")
    private WebElement txtAgregarTienda;

    @FindBy(xpath = "//div[contains(@class,'input__icon--append')]")
    private WebElement btnMas;

    @FindBy(xpath = "//span[contains(text(),'Guardar')]")
    private WebElement btnGuardar;

    @FindBy(xpath = "//p[contains(text(),'Men\u00FA actualizado')]")
    private WebElement lblGuardadoExitoso;

    @FindBy(xpath = "//p[contains(text(),'Menú actualizado con éxito')]")
    private WebElement lblUpdateStateSuccess;

    public String optFlujo = "//label[contains(text(),'%s')]";


    public MenuPage(WebDriver driver) {
        super(driver);
    }

    public  void optionsBCC(String opt) throws InterruptedException {
        String optBCC = "//h3[text()='%s']";
        optBCC = optBCC.replace("%s",opt);
        driver.findElement(By.xpath(optBCC)).click();
        Thread.sleep(3000);
    }

    public void crearMenu(String flujo, String nombreFlujo) throws InterruptedException {
        btnCrearMenuPpal.click();
        imgMarca.click();
        optFlujo = optFlujo.replace("%s",flujo);
        driver.findElement(By.xpath(optFlujo)).click();
        txtNombreFlujo.sendKeys(nombreFlujo);
        FluentWaitBCC.aTimeForElement(btnCrearMenuMod);
        btnCrearMenuMod.click();
    }

    public void editarMenu(String nombreAEditar,String flujoNuevo ,String nombreTienda) throws InterruptedException {
        btnRegistroXPagina.click();
        optNumRegistroXPagina.click();
        String btnEditarMenu = "//td[contains(text(),'%s')]/..//button";
        btnEditarMenu = btnEditarMenu.replace("%s",nombreAEditar);
        driver.findElement(By.xpath(btnEditarMenu)).click();
        optFlujo = optFlujo.replace("%s",flujoNuevo);
        driver.findElement(By.xpath(optFlujo)).click();
        txtAgregarTienda.sendKeys(nombreTienda);
        txtAgregarTienda.sendKeys(Keys.ENTER);
        btnMas.click();
        btnGuardar.click();
    }

    public void changeMenuSpecificState(String nameMenu){
        btnRegistroXPagina.click();
        optNumRegistroXPagina.click();
       // FluentWaitBCC.aTimeForElement(driver.findElement(By.xpath(String.format("//td[contains(text(),'%s')]/parent::tr//input", nameMenu))));
        driver.findElement(By.xpath(String.format("//td[contains(text(),'%s')]/parent::tr//input", nameMenu))).click();
        btnAccept.click();
    }

    public void updateMenuStateSuccess(){
        Assert.assertTrue(Element.isVisible(lblUpdateStateSuccess));
    }

    public void mensajeCreacionExitosa(){
        FluentWaitBCC.aTimeForElement(lblMenuCreadoOK);
        Assert.assertTrue(Element.isVisible(lblMenuCreadoOK));
    }

    public void mensajeEdicionExitosa(){
        FluentWaitBCC.aTimeForElement(lblGuardadoExitoso);
        Assert.assertTrue(Element.isVisible(lblGuardadoExitoso));}

}
