package Pages.Promotions;

import Pages.BasePage;
import Utils.FluentWaitBCC;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PromotionPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Promociones')]/..")
    private WebElement btnPromotions;

    @FindBy(xpath = "//span[contains(text(),'Crear promoci')]")
    private WebElement btnCreatePromotion;

    @FindBy(xpath = "//label[text()='Nombre']/parent::div//input")
    private WebElement txtPromotionName;

    @FindBy(xpath = "//span[contains(text(),'Cancelar')]/../following-sibling::button")
    private WebElement btnPopPupCreatePromotion;


    public PromotionPage(WebDriver driver) {
        super(driver);
    }

    public void createPromotion(String namePromotion){
        FluentWaitBCC.aTimeForElement(btnPromotions);
        btnPromotions.click();
        btnCreatePromotion.click();
        txtPromotionName.sendKeys(namePromotion);
        btnPopPupCreatePromotion.click();
    }

}