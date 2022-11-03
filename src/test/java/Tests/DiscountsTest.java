package Tests;

import Tests.AbstractBaseTests.TestBase;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import io.cucumber.testng.CucumberOptions;


import java.awt.*;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import static Builder.PageBuilder.getDiscountsPage;

@CucumberOptions(
        monochrome = true,
        features = "classpath:DiscountsTest",
        plugin = {"pretty"}
)
public class DiscountsTest extends TestBase {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setUpPage() throws AWTException, SQLException, InterruptedException {

    }

    @Y("^El usuario crea una campaña con los siguientes datos$")
    public void elUsuarioCreaUnaCampañaConLosSiguientesDatos(List<Map<String,String>> discountsData) {
        getDiscountsPage().createCampaignFromDiscounts(discountsData);
    }

    @Entonces("^El usuario deberia ver un mensaje de creacion de campaña exitosa$")
    public void elUsuarioDeberiaVerUnMensajeDeCreacionDeCampañaExitosa() {
    }
}
