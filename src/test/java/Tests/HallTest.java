package Tests;

import Tests.AbstractBaseTests.TestBase;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.testng.CucumberOptions;


import java.awt.*;
import java.sql.SQLException;

import static Builder.PageBuilder.getHallPage;
import static Builder.PageBuilder.getMenuPage;

@CucumberOptions(
        monochrome = true,
        features = "classpath:HallTest",
        plugin = {"pretty"}
)
public class HallTest extends TestBase {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setUpPage() throws AWTException, SQLException, InterruptedException {

    }

    @Cuando("^El usuario crea un nuevo pasillo con nombre (.*)$")
    public void elUsuarioCreaUnNuevoPasillo(String nameHall) throws InterruptedException {
        getHallPage().createHall(nameHall);
    }

    @Cuando("^El usuario asocia el nuevo pasillo con un menu con los datos (.*) y (.*)$")
    public void elUsuarioAsociaElNuevoPasilloConUnMenu(String menuToAsociar,String nombrePasillo) throws InterruptedException {
        getHallPage().associateHall(menuToAsociar, nombrePasillo);
    }

    @Entonces("^El usuario debe ver un mensaje de creación de pasillo exitosa$")
    public void elUsuarioDebeVerUnMensajeDeCreacionDePasilloExitosa() throws InterruptedException {
        getHallPage().validateMessageCreateHallSuccess();
    }

    @Entonces("^El usuario debe ver un mensaje de Asociacion exitosa$")
    public void elUsuarioDebeVerUnMensajeDeAsociacionExitosa() throws InterruptedException {
        getHallPage().validateMessageAsssociatedSuccess();
    }
}
