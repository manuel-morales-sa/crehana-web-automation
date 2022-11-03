package Tests;

import Tests.AbstractBaseTests.TestBase;
import io.cucumber.java.es.Dado;
import io.cucumber.testng.CucumberOptions;

import java.awt.*;
import java.sql.SQLException;

import static Builder.PageBuilder.getLoginPage;
import static Builder.PageBuilder.setupPage;


@CucumberOptions(
        monochrome = true,
        features = "classpath:LoginTest",
        plugin = {"pretty"}
)
public class LoginTest extends TestBase {

    @Override
    public String getName() {
        return null;
    }


    @Dado("^Se configura el driver para la automatizacion$")
    public void setUpPage() {
        if (TestBase.firtsLaunch){
            TestBase.firtsLaunch = false;
        }else {
            driver.quit();
            driver = setDriver();
        }
        setupPage(driver);
    }

    @Dado("^El usuario se loguea en la pagina con usuario (.*) y pass (.*)$")
    public void elUsuarioSeLogueaEnLaPaginaConUsuarioYPass(String user, String pass) throws AWTException, SQLException, InterruptedException {
        getLoginPage().login(user, pass);
    }

    @Dado("^El se loguea en la pagina con usuario (.*) y pass (.*) en (.*)$")
    public void elUsuarioSeLogueaEnLaPaginaConUsuarioYPass(String user, String pass, String country) throws AWTException, SQLException, InterruptedException {
        getLoginPage().login(user, pass, country);
    }
}
