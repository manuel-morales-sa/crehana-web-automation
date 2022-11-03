package Pages.FoodCoins;

import Pages.BasePage;
import Utils.Element;
import Utils.FluentWaitBCC;
import Utils.UploadFiles;
import Utils.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class FoodCoinsPage extends BasePage {

    @FindBy(xpath = "//input[contains(@placeholder,'Agregar usuario por nombre')]")
    private WebElement txtUserNameAdd;

    @FindBy(xpath = "//input[@placeholder='Entidad']/..")
    private WebElement drownDownEntity;

    @FindBy(xpath = "//div[text()='System']")
    private WebElement optEntity;

    @FindBy(xpath = "//input[@mode='date']")
    private WebElement tooltipExpirationDate;

    @FindBy(xpath = "//div[contains(text(),'2022')]")
    public static WebElement lblChangeMonth;

    @FindBy(xpath = "//input[contains(@placeholder,'Hora expiraci\u00F3n')]")
    private WebElement txtExpirationHour;

    @FindBy(xpath = "(//div[@class='vc-time']/child::div/select)[1]")
    private WebElement dropDownHour;

    @FindBy(xpath = "(//div[@class='vc-time']/child::div/select)[2]")
    private WebElement dropDownMinute;

    @FindBy(xpath = "//div[@class='vc-time']/child::div/button[contains(text(),'AM')]")
    private WebElement optAM;

    @FindBy(xpath = "//div[@class='vc-time']/child::div/button[contains(text(),'PM')]")
    private WebElement optPM;

    @FindBy(xpath = "//label[text()='Cantidad Foodcoins']/..//input")
    private WebElement txtFoodCoinsAmount;

    @FindBy(xpath = "//span[contains(text(),'Asignar')]/parent::button")
    private WebElement btnAssign;

    @FindBy(xpath = "//span[text()='Aceptar']")
    private WebElement btnAccept;

    @FindBy(xpath = "//input[@id='attachFile']")
    private WebElement btnAttachFile;

    @FindBy(xpath = "//input[contains(@placeholder,'Buscar por número de evento')]")
    private WebElement txtSearchByEventNumber;

    @FindBy(xpath = "(//th[text()='ID evento']/ancestor::table//td)[1]")
    private WebElement lblEventNumber;

    @FindBy(xpath = "//span[text()='Eventos']")
    private WebElement optEvents;

    @FindBy(xpath = "(//td[text()='success'])[1]")
    private WebElement lblSuccess;

    @FindBy(xpath = "//p[contains(text(),'Se registró exitosamente el evento')]")
    private WebElement lblEventRegisteredSuccess;

    @FindBy(xpath = "//span[contains(text(),'Usuarios')]")
    private WebElement btnUsuarios;

    @FindBy(xpath = "//td//i[contains(@class,'notranslate')]")
    private WebElement btnAddFoodCoinsToUsser;

    @FindBy(xpath = "(//td[contains(@class,'list-table__btn-option-view')])[2]")
    private WebElement btnUserFoodcoinsInfo;

    @FindBy(xpath = "//button[contains(@class,'plus')]")
    private WebElement btnPlus;

    @FindBy(xpath = "//input[contains(@placeholder,'Buscar usuario por nombre o número de teléfono')]")
    private WebElement lblSearch;


    public FoodCoinsPage(WebDriver driver) {
        super(driver);
    }

    public void assignUser(List<Map<String, String>> data) throws InterruptedException {
        addUsers(data);
        fillFoodcoinsInfo(data);
        btnAccept.click();
    }

    public void assignFoodcooinsToUserForArrow(List<Map<String, String>> data) throws InterruptedException {
        btnUsuarios.click();
        btnUserFoodcoinsInfo.click();
        btnPlus.click();
        fillFoodcoinsInfo(data);
        btnAccept.click();
    }

    public void assignFoodcooinsToUserForPlus(List<Map<String, String>> data) throws InterruptedException {
        btnUsuarios.click();
        btnAddFoodCoinsToUsser.click();
        fillFoodcoinsInfo(data);
    }

    public void searchUser(String searchData) throws InterruptedException {
        btnUsuarios.click();
        lblSearch.sendKeys(searchData);
    }

    public void fillFoodcoinsInfo(List<Map<String, String>> data) throws InterruptedException {
        drownDownEntity.click();
        driver.findElement(By.xpath(String.format("//div[text()='%s']", data.get(0).get("entity")))).click();
        tooltipExpirationDate.click();
        lblChangeMonth.click();
        driver.findElement(By.xpath(String.format("//span[contains(text(),'%s')]", data.get(0).get("mes")))).click();
        driver.findElement(By.xpath(String.format("//div[contains(@class,'%s')]", data.get(0).get("fechaVencimiento")))).click();
        txtExpirationHour.click();
        FluentWaitBCC.aTimeForElement(driver.findElement(By.xpath("(//div[@class='vc-time']/child::div/select)[1]")));
        Select drpHour = new Select(driver.findElement(By.xpath("(//div[@class='vc-time']/child::div/select)[1]")));
        drpHour.selectByVisibleText("5");
        FluentWaitBCC.aTimeForElement(driver.findElement(By.xpath("(//div[@class='vc-time']/child::div/select)[2]")));
        Select drpMinute = new Select(driver.findElement(By.xpath("(//div[@class='vc-time']/child::div/select)[2]")));
        drpMinute.selectByVisibleText("00");
        FluentWaitBCC.aTimeForElement(optPM);
        optPM.click();
        txtFoodCoinsAmount.sendKeys(data.get(0).get("amountFoodCoins"));
        btnAssign.click();
        btnAccept.click();
    }

    public void addUsers(List<Map<String, String>> data) throws InterruptedException {

        String[] users = new String[]{"Gerardo Carvajal Vargas", "Andrea Moncada", "Norma Alonso"};

        if (data.get(0).get("cargaMasiva").equalsIgnoreCase("no")) {

            if (data.get(0).get("cantidadUsuarios").equalsIgnoreCase("unUsuario")) {
                txtUserNameAdd.sendKeys(data.get(0).get("userName"));
                Thread.sleep(1000);
                txtUserNameAdd.sendKeys(Keys.ENTER);
            } else {
                for (int i = 0; i < users.length; i++) {
                    txtUserNameAdd.sendKeys(users[i]);
                    Thread.sleep(1000);
                    txtUserNameAdd.sendKeys(Keys.ENTER);
                }
            }
        } else {
            UploadFiles.inTheProject("src/test/resources/FilesToUpload/filefodd.csv", btnAttachFile);
        }
    }

    public void searchByEventNumber(String numberEvent) throws InterruptedException {
        optEvents.click();
        FluentWaitBCC.aTimeForElement(txtSearchByEventNumber);
        txtSearchByEventNumber.sendKeys(numberEvent);
    }

    public void viewDetailsEvent(String numberEvent){
        optEvents.click();
        driver.findElement(By.xpath(String.format("//td[text()='%s']/parent::tr//button", numberEvent))).click();
    }

    public void validateSearchedEventNumber(String numberEvent) throws InterruptedException {
        FluentWaitBCC.aTimeForElement(lblEventNumber);
        Assert.assertTrue(lblEventNumber.getText().equalsIgnoreCase(numberEvent));
    }

    public void viewDetailsEventSuccess(String numberEvent){
     WebElement elementForValidate =  driver.findElement(By.xpath(String.format("//p[contains(text(),'ID evento')]/..//span[text()='%s']", numberEvent)));
     FluentWaitBCC.aTimeForElement(elementForValidate);
     FluentWaitBCC.aTimeForElement(lblSuccess);
     Assert.assertTrue(elementForValidate.isDisplayed() && lblSuccess.isDisplayed());
    }

    public void mensajeAsignacionExitosa() {
        FluentWaitBCC.aTimeForElement(lblEventRegisteredSuccess);
        Assert.assertTrue(Element.isVisible(lblEventRegisteredSuccess));
    }

    public void validateUserInfo(List<Map<String, String>> dataFoodCoins) {
        Wait.forSeconds(5);
        FluentWaitBCC.aTimeForElement((WebElement) driver.findElements(By.xpath("(//tr)[2]/td")));
        List<WebElement> userData = driver.findElements(By.xpath("(//tr)[2]/td"));
        Assert.assertEquals(userData.get(0).getText(),dataFoodCoins.get(0).get("nombre"));
        Assert.assertEquals(userData.get(1).getText(),dataFoodCoins.get(0).get("telefono"));
        Assert.assertEquals(userData.get(2).getText(),dataFoodCoins.get(0).get("estatus"));
    }
}
