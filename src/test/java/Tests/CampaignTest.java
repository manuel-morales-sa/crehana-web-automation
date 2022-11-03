package Tests;

import Tests.AbstractBaseTests.TestBase;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.testng.CucumberOptions;



import java.awt.*;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import static Builder.PageBuilder.getCampaignPage;

@CucumberOptions(
        monochrome = true,
        features = "classpath:CampaignTest",
        plugin = {"pretty"}
)
public class CampaignTest extends TestBase {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setUpPage() throws AWTException, SQLException, InterruptedException {

    }

    @Cuando("^El usuario crea una campaña con subcampaña y cupones$")
    public void elUsuarioCreaUnaCampañaConSubcampañayCupones(List<Map<String,String>> datos) throws Throwable {
        getCampaignPage().basicFlowtoCreateCampaignSubcampaignAndCoupon(datos);
    }

    @Cuando("^El usuario crea una campaña$")
    public void elUsuarioCreaUnaCampaña(List<Map<String,String>> datos) throws Throwable {
        getCampaignPage().fillCampaignForm(datos);
    }

    @Cuando("^El usuario crea una subcampaña$")
    public void elUsuarioCreaUnaSubcampaña(List<Map<String,String>> datos) throws Throwable {
        getCampaignPage().createSubcampaign(datos);
    }

    @Cuando("^El usuario crea un cupon$")
    public void elUsuarioCreaUnCupon(List<Map<String,String>> datos) throws Throwable {
        getCampaignPage().createCoupon(datos);
    }

    @Cuando("^El usuario busca una campaña de nombre (.*)$")
    public void elUsuarioBuscaUnaCampañaDeNombre(String nombreCampania) throws Throwable {
        getCampaignPage().findCampaign(nombreCampania);
    }

    @Cuando("^El usuario busca un cupon de nombre (.*)$")
    public void elUsuarioBuscaUnCuponDeNombre(String nombreCupon) throws Throwable {
        getCampaignPage().findCoupon(nombreCupon);
    }

    @Cuando("^El usuario busca una subcampaña de nombre (.*)$")
    public void elUsuarioBuscaUnaSubampañaDeNombre(String nombreSubampania) throws Throwable {
getCampaignPage().findSubcampaign(nombreSubampania);
    }


    @Entonces("^debe visualizar la informacion del registro creado (.*)$")
    public void debeVisualizarLaInformacionDelRegistroCreado(String nombreElemento) throws Throwable {
        getCampaignPage().seeTheElementCreate(nombreElemento);
    }

    @Entonces("^El usuario debe ver la informacion de (.*)$")
    public void elUsuarioDebVerLaInformacionDeElemento(String elemento,List<Map<String,String>> datos) throws Throwable {
        getCampaignPage().validateElementData(elemento,datos);
    }
}
