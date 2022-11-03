package Pages.Products;

import Pages.BasePage;
import Utils.Element;
import Utils.FluentWaitBCC;
import Utils.UploadFiles;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.File;
import java.util.List;
import java.util.Map;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//span[text()='Productos']")
    private WebElement btnProduct;

    @FindBy(xpath = "(//div[@class='v-input__append-inner'])[2]")
    private WebElement btnDropDownMenu;

    @FindBy(xpath = "//div[text()='tremendamente rico el plato y picante']")
    private WebElement menuToAssociate;

    @FindBy(xpath = "//div[contains(text(),'Agregar producto')]")
    private WebElement btnAddProduct;

    @FindBy(xpath = "//label[contains(text(),'Tipo de producto')]/..//input[contains(@placeholder,'Selecciona')]/..")
    private WebElement lstKindOfProduct;

    @FindBy(xpath = "//div[contains(text(),'Artículo')]")
    private WebElement optSelectedArticle;

    @FindBy(xpath = "//label[contains(text(),'Flujo de producto')]/..//div[contains(@class,'v-input__append-inner')]")
    private WebElement lstProductFlow;

    @FindBy(xpath = "//div[contains(text(),'Personalized')]")
    private WebElement optSelectedPersonalized;

    @FindBy(xpath = "//input[@placeholder='Nombre de producto']")
    private WebElement txtProductName;

    @FindBy(xpath = "//div[text()='1 Pollo y papa salada']")
    private WebElement imgFindPlate;

    @FindBy(xpath = "//input[contains(@placeholder,'Selecciona')]/..")
    private WebElement lstKindVisualization;

    @FindBy(xpath = "//div[@class='v-list-item__title' and text()='personalized']")
    private WebElement optVisualization;

    @FindBy(xpath = "//input[@placeholder='Sku del producto']")
    private WebElement txtSkuProduct;

    @FindBy(xpath = "//input[@placeholder='Precio de producto']")
    private WebElement txtProductPrice;

    @FindBy(xpath = "//input[@placeholder='Precio de referencia de producto']")
    private WebElement txtReferenceProductPrice;

    @FindBy(xpath = "//textarea[contains(@placeholder,'Agregar descripci\u00F3n')]")
    private WebElement txtProductDescription;

    @FindBy(xpath = "//span[text()='Crear']/..")
    private WebElement btnCreate;

    @FindBy(xpath = "//label[text()='Cargar imagen*']/..//input")
    private WebElement btnUploadImage;

    @FindBy(xpath = "//p[text()='Producto creado satisfactoriamente']")
    private WebElement lblSuccessfulAddition;

    @FindBy(xpath = "//span[text()='Aceptar']/..")
    private WebElement btnAcceptEliminate;

    @FindBy(xpath = "//p[text()='Producto eliminado satisfactoriamente']")
    private WebElement lblSuccessfulEliminate;

    @FindBy(xpath = "//span[contains(text(),'Guardar')]/..")
    public static WebElement btnSave;

    @FindBy(xpath = "//p[contains(text(),'Producto actualizado satisfactoriamente')]")
    private WebElement lblSuccessfulEdit;

    JavascriptExecutor js = (JavascriptExecutor) driver;
    String path = "src/test/resources/FilesToUpload/pollo.jpeg";
    Actions act = new Actions(driver);


    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addProduct(List<Map<String,String>> dataProduct) throws InterruptedException {
        goToSpecificMenu();
        btnAddProduct.click();
        lstKindOfProduct.click();
        optSelectedArticle.click();
        lstProductFlow.click();
        optSelectedPersonalized.click();
        txtProductName.sendKeys(dataProduct.get(0).get("nameProduct"));
        imgFindPlate.click();
        js.executeScript("arguments[0].scrollIntoView();", lstKindVisualization);
        FluentWaitBCC.aTimeForElement(lstKindVisualization);
        lstKindVisualization.click();
        optVisualization.click();
        txtSkuProduct.sendKeys(dataProduct.get(0).get("skuProduct"));
        txtProductPrice.sendKeys(dataProduct.get(0).get("productPrice"));
        FluentWaitBCC.aTimeForElement(txtReferenceProductPrice);
        txtReferenceProductPrice.sendKeys(dataProduct.get(0).get("referenceProductPrice"));
        txtProductDescription.sendKeys(dataProduct.get(0).get("description"));
        UploadFiles.inTheProject(path,btnUploadImage);
        FluentWaitBCC.aTimeForElement(btnCreate);
        btnCreate.click();
    }

    public void goToSpecificMenu(){
        btnProduct.click();
        btnDropDownMenu.click();
        goToElement(menuToAssociate);
        menuToAssociate.click();
    }

    public void editProduct(List<Map<String,String>> dataProduct) throws InterruptedException {
        goToSpecificMenu();
        String btnProductEdit = "//div[contains(text(),'%s')]";
        btnProductEdit = btnProductEdit.replace("%s",dataProduct.get(0).get("nameProduct"));
        driver.findElement(By.xpath(btnProductEdit)).click();
        js.executeScript("arguments[0].scrollIntoView();", btnSave);
        FluentWaitBCC.aTimeForElement(txtSkuProduct);
        txtSkuProduct.sendKeys(dataProduct.get(0).get("skuProduct"));
        act.doubleClick(txtReferenceProductPrice).perform();
        txtReferenceProductPrice.sendKeys(dataProduct.get(0).get("referenceProductPrice"));
        act.doubleClick(txtProductPrice).perform();
        txtProductPrice.sendKeys(dataProduct.get(0).get("productPrice"));
        FluentWaitBCC.aTimeForElement(txtProductDescription);
        txtProductDescription.sendKeys(dataProduct.get(0).get("description"));
        btnUploadImage.sendKeys(path);
        FluentWaitBCC.aTimeForElement(btnSave);
        btnSave.click();
    }


    public void eliminateProduct(String nameProductToEliminate){
        goToSpecificMenu();
        String iconProductoEliminate = "//div[contains(text(),'%s')]//preceding::div[@class='circle-icon']";
        iconProductoEliminate = iconProductoEliminate.replace("%s",nameProductToEliminate);
        driver.findElement(By.xpath(iconProductoEliminate)).click();
        btnAcceptEliminate.click();
    }

    public void messageSuccessfulEliminated(){Assert.assertTrue(Element.isVisible(lblSuccessfulEliminate));}

    public void messageSuccessfulAddition(){Assert.assertTrue(Element.isVisible(lblSuccessfulAddition));}

    public void messageSuccessfulEdit(){Assert.assertTrue(Element.isVisible(lblSuccessfulEdit));}

    public void goToElement(WebElement element){
        int cont = 20;
        String keyForDown = "(//div[@class='v-menu__content theme--light menuable__content__active'] //div[@role='listbox']/div)[%s]";
        while (!Element.isVisible(element)){
            keyForDown = keyForDown.replace("%s",String.valueOf(cont));
            driver.findElement(By.xpath(keyForDown)).sendKeys(Keys.PAGE_DOWN);
            cont = cont + 20;
        }
    }
}
