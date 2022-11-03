package Pages.StoreBrands;

import Pages.BasePage;
import Utils.ValidateMessage;
import Utils.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static Utils.ValidateMessage.getPopupMessage;

public class StoresAndBrandsPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Tiendas y marcas')]")
    private WebElement btnOptionStoesAndBrands;

    @FindBy(xpath = "//span[contains(text(),'Crear tienda - marca')]")
    private WebElement btnCreateStore;

    @FindBy(xpath = "(//div[contains(@class,'active')]//div[@tabindex]//div[@class= 'v-list-item__title'])[1]")
    private WebElement btnFirtsOption;

    @FindBy(xpath = "(//div[@class='fm-modal-body']//div[@role='button'])[1]")
    private WebElement btnSelectStore;

    @FindBy(xpath = "(//div[@class='fm-modal-body']//div[@role='button'])[2]")
    private WebElement btnSelectBrand;

    @FindBy(xpath = "//div[@class='v-text-field__slot']//input")
    private WebElement lblSKU;

    @FindBy(xpath = "//div[contains(text(),'Automation brand')]")
    private WebElement btnAutomationBrandOption;

    @FindBy(xpath = "//div[@role='combobox']")
    private WebElement cmbSelectStore;

    @FindBy(xpath = "//div[contains(@class,'modal')]//span[contains(text(),'Crear')]")
    private WebElement btnCreateModal;

    @FindBy(xpath = "//div[contains(text(),'Automation brand')]/parent::td/parent::tr//td//button")
    private WebElement btnDeleteBrand;

    @FindBy(xpath = "//span[contains(text(),'Aceptar')]")
    private WebElement btnAceptDelete;

    @FindBy(xpath = "//p[contains(@class,'v-toast__text')]")
    private WebElement lblPopUp;


    public StoresAndBrandsPage(WebDriver driver) {
        super(driver);
    }

    public void createStoreWithFirstInfo() {
        btnOptionStoesAndBrands.click();
        Wait.forSeconds(1);
        btnCreateStore.click();
        btnSelectStore.click();
        btnFirtsOption.click();
        btnSelectBrand.click();
        Wait.forSeconds(1);
        btnAutomationBrandOption.click();
        lblSKU.sendKeys("abcd1234");
        Wait.forSeconds(2);
        btnCreateModal.click();
    }

    public void deleteBrand() {
        btnOptionStoesAndBrands.click();
        Wait.forSeconds(1);
        cmbSelectStore.click();
        btnFirtsOption.click();
        btnDeleteBrand.click();
        btnAceptDelete.click();
    }

    public void viewPopUpInfoTo(String type) {
        Wait.forSeconds(1);
        Assert.assertEquals(getPopupMessage(type), lblPopUp.getText());
    }
}
