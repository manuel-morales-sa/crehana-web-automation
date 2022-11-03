package Tests;

import Tests.AbstractBaseTests.TestBase;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.testng.CucumberOptions;


import java.awt.*;
import java.sql.SQLException;

import static Builder.PageBuilder.getStoresAndBrandsPage;

@CucumberOptions(
        monochrome = true,
        features = "classpath:CreateStoreTest",
        plugin = {"pretty"}
)
public class CreateStoreTest extends TestBase {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setUpPage() throws AWTException, SQLException, InterruptedException {

    }

    @Cuando("^El usuario crea una nueva marca$")
    public void elUsuarioCreaUnaNuevaMarca() throws Throwable {
        getStoresAndBrandsPage().createStoreWithFirstInfo();
    }

    @Cuando("^El usuario borra una marca$")
    public void elUsuarioCreaUnaBuevaMarca() throws Throwable {
        getStoresAndBrandsPage().deleteBrand();
    }
    @Entonces("^El usuario debe ver un mensaje en el popup de (.*)$")
    public void elUsuarioDebeVerUnMensajeDeCreaciónDeMarcaExitosa(String type) throws Throwable {
        getStoresAndBrandsPage().viewPopUpInfoTo(type);
    }
}
