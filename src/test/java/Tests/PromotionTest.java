package Tests;

import Tests.AbstractBaseTests.TestBase;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import io.cucumber.testng.CucumberOptions;


import java.awt.*;
import java.sql.SQLException;

import static Builder.PageBuilder.getPromotionPage;

@CucumberOptions(
        monochrome = true,
        features = "classpath:PromotionTest",
        plugin = {"pretty"}
)
public class PromotionTest extends TestBase {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setUpPage() throws AWTException, SQLException, InterruptedException {

    }

    @Y("^El usuario crea una promocion (.*)$")
    public void elUsuarioCreaUnaPromocionNombrePromocion(String nombrePromocion) {
        getPromotionPage().createPromotion(nombrePromocion);
    }

    @Entonces("^El usuario deberia ver un mensaje de creacion de promocion exitosa$")
    public void elUsuarioDeberiaVerUnMensajeDeCreacionDePromocionExitosa() {
    }
}
