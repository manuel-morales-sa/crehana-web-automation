package Tests;


import Tests.AbstractBaseTests.TestBase;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import io.cucumber.testng.CucumberOptions;


import java.awt.*;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import static Builder.PageBuilder.getFoodCoinsPage;

@CucumberOptions(
        monochrome = true,
        features = "classpath:FoodCoinsTest",
        plugin = {"pretty"}
)
public class FoodCoinsTest extends TestBase {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setUpPage() throws AWTException, SQLException, InterruptedException {

    }

    @Y("^El usuario asigna foodcoins$")
    public void elUsuarioAsignaFoodcoinsAUnCliente(List<Map<String, String>> dataFoodCoins) throws InterruptedException {
        getFoodCoinsPage().assignUser(dataFoodCoins);
    }

    @Y("^El usuario asigna foodcoins de forma masiva$")
    public void elUsuarioAsignaFoodcoinsDeFormaMasiva(List<Map<String, String>> dataFoodCoins) throws InterruptedException {
        getFoodCoinsPage().assignUser(dataFoodCoins);
    }

    @Y("^El usuario asigna foodcoins al usuario por el mas$")
    public void elUsuarioAsignaFoodcoinsAlUsuarioPorElMas(List<Map<String, String>> dataFoodCoins) throws InterruptedException {
        getFoodCoinsPage().assignFoodcooinsToUserForPlus(dataFoodCoins);
    }

    @Y("^El usuario asigna foodcoins al usuario por la flecha$")
    public void elUsuarioAsignaFoodcoinsAlUsuarioPorLaFlecha(List<Map<String, String>> dataFoodCoins) throws InterruptedException {
        getFoodCoinsPage().assignFoodcooinsToUserForArrow(dataFoodCoins);
    }


    @Y("^El usuario busca por el criterio de (.*)$")
    public void elUsuarioAsignaFoodcoinsAlUsuarioPorLaFlecha(String criterioBusqueda) throws InterruptedException {
        getFoodCoinsPage().searchUser(criterioBusqueda);
    }

    @Entonces("^El usuario debe ver la informacion del usuario$")
    public void elUsuarioDebeVerLaInformacionDelUsuario(List<Map<String, String>> dataFoodCoins) throws Throwable {
        getFoodCoinsPage().validateUserInfo(dataFoodCoins);
    }

    @Entonces("^El usuario debe ver un mensaje asignacion exitosa$")
    public void elUsuarioDebeVerUnMensajeAsignacionExitosa() {
        getFoodCoinsPage().mensajeAsignacionExitosa();
    }


    @Y("^El usuario busca un número de evento (.*)$")
    public void elUsuarioBuscaUnNúmeroDeEventoNumeroEvento(String numeroEvento) throws InterruptedException {
        getFoodCoinsPage().searchByEventNumber(numeroEvento);
    }

    @Entonces("^Se debe ver en la pantalla el numero de evento filtrado (.*)$")
    public void seDebeVerEnLaPantallaElNumeroDeEventoFiltradoNumeroEvento(String numeroEvento) throws InterruptedException {
        getFoodCoinsPage().validateSearchedEventNumber(numeroEvento);
    }

    @Y("^El usuario consulta el detalle de un evento (.*)$")
    public void elUsuarioConsultaElDetalleDeUnEventoNumeroEvento(String numeroEvento) {
        getFoodCoinsPage().viewDetailsEvent(numeroEvento);
    }

    @Entonces("^Se debe ver en la pantalla el detalle evento (.*)$")
    public void seDebeVerEnLaPantallaElDetalleEventoNumeroEvento(String numeroEvento) {
        getFoodCoinsPage().viewDetailsEventSuccess(numeroEvento);
    }

}
