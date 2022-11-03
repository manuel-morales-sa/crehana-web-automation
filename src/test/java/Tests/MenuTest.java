package Tests;

import Tests.AbstractBaseTests.TestBase;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import io.cucumber.testng.CucumberOptions;

import java.awt.*;
import java.sql.SQLException;

import static Builder.PageBuilder.getMenuPage;


@CucumberOptions(
        monochrome = true,
        features = "classpath:MenuTest",
        plugin = {"pretty"}
)
public class MenuTest extends TestBase {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setUpPage() throws AWTException, SQLException, InterruptedException {

    }

    @Cuando("^El usuario elige la opcion deseada (.*)$")
    public void elUsuarioEligeLaOpcionDeseada(String opt) throws InterruptedException {
       getMenuPage().optionsBCC(opt);
    }

    @Cuando("^El usuario crea un nuevo menu con los datos flujo (.*) y nombreFlujo (.*)$")
    public void elUsuarioCreaUnNuevoMenu(String flujo, String nombreFlujo) throws InterruptedException {
        getMenuPage().crearMenu(flujo, nombreFlujo);
    }

    @Cuando("^El usuario edita el menu con los siguientes datos (.*) nuevo flujo (.*) y nombre de la tienda (.*)$")
    public void elUsuarioEditaUnMenu(String nombreAEditar,String flujoNuevo ,String nombreTienda) throws InterruptedException {
        getMenuPage().editarMenu(nombreAEditar, flujoNuevo, nombreTienda);
    }

    @Entonces("^El usuario debe ver un mensaje de creación exitosa$")
    public void elUsuarioDebeverUnMensajeDeCreacionExitosa() throws InterruptedException {
        getMenuPage().mensajeCreacionExitosa();
    }

    @Entonces("^El usuario debe ver un mensaje de actualizacion exitosa$")
    public void elUsuarioDebeverUnMensajeDeActualizacionExitosa() throws InterruptedException {
        getMenuPage().mensajeEdicionExitosa();
    }

    @Y("^El usuario cambia el estado de un menu especifico (.*)$")
    public void elUsuarioCambiaElEstadoDeUnMenuEspecificoNombreMenu(String nombreMenu) {
        getMenuPage().changeMenuSpecificState(nombreMenu);
    }

    @Entonces("^El usuario deberia ver un mensaje de actualizacion de estado exitosa$")
    public void elUsuarioDeberiaVerUnMensajeDeActualizacionDeEstadoExitosa() {
        getMenuPage().updateMenuStateSuccess();
    }
}