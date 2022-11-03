package Pages.Discounts;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

import static Pages.Products.ProductPage.btnSave;
import static Pages.Coupons.CampaignPage.btnCreateCampaign;

public class DiscountsPage extends BasePage {

    @FindBy(xpath = "//label[text()='Nombre campa\u00F1a']/..//input")
    private WebElement txtCreateCampaign;

    @FindBy(xpath = "//span[text()='Estado']//following::div//input[@role='switch']")
    private WebElement switchState;

    @FindBy(xpath = "//label[contains(text(),'Inicio')]/parent::div//input")
    private WebElement btnStartDate;

    @FindBy(xpath = "//label[contains(text(),'Fin')]/parent::div//input")
    private WebElement btnFinishDate;

    @FindBy(xpath = "//label[contains(text(),'Inicio')]/parent::div//input")
    private WebElement txtStartDate;

    @FindBy(xpath = "//label[contains(text(),'Fin')]/parent::div//input")
    private WebElement txtFinishDate;

    public DiscountsPage(WebDriver driver) {
        super(driver);
    }

    public void createCampaignFromDiscounts(List<Map<String, String>> data){
        driver.findElement(By.xpath("//span[text()='Descuentos']")).click();
        btnCreateCampaign.click();
        txtCreateCampaign.sendKeys(data.get(0).get("nameCampaign"));
        switchState.click();
        txtStartDate.sendKeys(data.get(0).get("startDate"));
        txtFinishDate.sendKeys(data.get(0).get("finishDate"));
        txtCreateCampaign.click();
        btnSave.click();
    }
}
