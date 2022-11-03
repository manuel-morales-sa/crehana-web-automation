package Pages.Login;

import Pages.BasePage;
import Utils.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//img[@alt]")
    private WebElement btnSeleccionarPais;

    @FindBy(xpath = "//img[@alt='MUY']")
    private WebElement btnSeleccionarColombia;

    @FindBy(xpath = "//img[@alt='MUY MEXICO']")
    private WebElement btnSeleccionarMexico;

    @FindBy(xpath = "//img[@alt='MUY BRASIL']")
    private WebElement btnSeleccionarBrasil;

    @FindBy(xpath = "//span[text()='Aceptar']")
    private WebElement btnAceptar;


    @FindBy(xpath = "//label[contains(text(),'Usuario')]/..//input")
    private WebElement txtUsuario;

    @FindBy(xpath = "//label[contains(text(),'Contrase')]/..//input")
    private WebElement txtPass;

    @FindBy(xpath = "//span[contains(text(),'Inicia sesi')]")
    private WebElement btnlogin;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String user, String pass) throws InterruptedException {
        txtUsuario.sendKeys(user);
        txtPass.sendKeys(pass);
        btnlogin.click();
        Thread.sleep(4000);
        selectCountry("COLOMBIA");
    }

    public void login(String user, String pass, String country) throws InterruptedException {
        txtUsuario.sendKeys(user);
        txtPass.sendKeys(pass);
        btnlogin.click();
        Thread.sleep(4000);
        selectCountry(country);
    }

    public void selectCountry(String country) {
        btnSeleccionarPais.click();
        switch (country.toUpperCase())
        {
            case "COLOMBIA":
                btnSeleccionarColombia.click();
                break;
            case "BRASIL":
                btnSeleccionarBrasil.click();
                break;
            default:
                break;
        }
        btnAceptar.click();
        Wait.forSeconds(4);
    }
}
