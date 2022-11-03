package Tests;

import Tests.AbstractBaseTests.TestBase;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import io.cucumber.testng.CucumberOptions;


import java.awt.*;
import java.sql.SQLException;

import static Builder.PageBuilder.getDayPage;


@CucumberOptions(
        monochrome = true,
        features = "classpath:DaysTest",
        tags = "@editDay",
        plugin = {"pretty"}
)
public class DayTest extends TestBase {


    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setUpPage() throws AWTException, SQLException, InterruptedException {

    }

    @Cuando("^El usuario crea un nuevo dia con nombre (.*)$")
    public void elUsuarioCreaUnNuevoDiaConNombre(String nameDay) throws InterruptedException {
        getDayPage().createNewDay(nameDay);
    }

    @Y("^El usuario edita un dia con los datos (.*) y (.*)$")
    public void elUsuarioEditaUnDiaConLosDatosDiaAEditarYNombreNuevoDia(String diaAEditar, String nombreNuevoDia) throws InterruptedException {
        getDayPage().editDay(diaAEditar,nombreNuevoDia);
    }

    @Entonces("^El usuario deberia de visualizar un mensaje de creación de dia exitosa$")
    public void elUsuarioDebeVerUnMensajeDeCreacionDeDiaExitosa() throws InterruptedException {
        getDayPage().validateMessageSuccessCreateNewDay();
    }

    @Entonces("^El usuario deberia de visualizar un mensaje de dia exitosa$")
    public void elUsuarioDebeVerUnMensajeDeEdicionDeDiaExitosa() {
        getDayPage().validateMessageSuccessEditDay();
    }

    @Entonces("^El usuario deberia de visualizar un mensaje de dia ya existente$")
    public void elUsuarioDebeVerUnMensajeDeCreaciónDeDiaYaExistente() {
        getDayPage().validateMessageExistsDay();
    }

    @Y("^El usuario intenta borrar un dia entre semana (.*)$")
    public void elUsuarioIntentaBorrarUnDiaEntreSemanaDayToDelete(String dayDelete) throws InterruptedException {
        getDayPage().tryDeleteWeekDays(dayDelete);
    }

    @Entonces("^El usuario deberia de visualizar un mensaje de borrado fallido$")
    public void elUsuarioDebeVerUnMensajeDeBorradoFallido() {
        getDayPage().validateMessageDayNotAllowedToBeDeleted();
    }
}
