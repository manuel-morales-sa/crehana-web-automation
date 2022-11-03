package Tests;

import Tests.AbstractBaseTests.TestBase;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.testng.CucumberOptions;

import java.awt.*;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import static Builder.PageBuilder.getProductPage;

@CucumberOptions(
        monochrome = true,
        features = "classpath:ProductTest",
        plugin = {"pretty"}
)
public class ProductTest extends TestBase {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setUpPage() throws AWTException, SQLException, InterruptedException {

    }

    @Cuando("^El usuario agrega un producto con los siguientes datos$")
    public void elUsuarioAgregaUnProductoConLosSiguientesDatos(List<Map<String,String>> dataProduct) throws InterruptedException {
       getProductPage().addProduct(dataProduct);
    }

    @Cuando("^El usuario elimina el producto (.*) de la pagina$")
    public void elUsuarioEliminaUnProducto(String nameProductToEliminate) throws InterruptedException {
        getProductPage().eliminateProduct(nameProductToEliminate);
    }

    @Cuando("^El usuario edita un producto con los siguientes datos$")
    public void elUsuarioEditaElProducto(List<Map<String,String>> dataProduct) throws InterruptedException {
        getProductPage().editProduct(dataProduct);
    }

    @Entonces("^El usuario debe ver un mensaje de producto agregado correctamente$")
    public void elUsuarioDebeVerUnMensajeDeProductoAgregadoCorrectamente() throws InterruptedException {
        getProductPage().messageSuccessfulAddition();
    }

    @Entonces("^El usuario debe ver un mensaje de eliminacion exitosa$")
    public void elUsuarioDebeVerUnMensajeDeProductoEliminadoCorrectamente() throws InterruptedException {
        getProductPage().messageSuccessfulEliminated();
    }

    @Entonces("^El usuario debe ver un mensaje de producto editado correctamente$")
    public void elUsuarioDebeVerUnMensajeDeProductoEditadoCorrectamente() throws InterruptedException {
        getProductPage().messageSuccessfulEdit();
    }
}
