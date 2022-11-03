package Pages.Coupons;

import Models.Codigo;
import Models.Cupon;
import Models.Redencion;
import Pages.BasePage;
import Utils.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

import static Builder.CodeBuilder.codeDefault;
import static Builder.CuponBuilder.cuponPorcentajeDefault;
import static Builder.PageBuilder.getStoresAndBrandsPage;
import static Builder.RedencionBuilder.redencionDefautl;
import static Utils.Constants.CREATE_CAMPAIGN_TYPE;
import static Utils.Constants.CREATE_SUBCAMPAIGN_TYPE;

public class CampaignPage extends BasePage {
    @FindBy(xpath = "(//div/span[contains(text(),'Campañas')])[2]")
    private WebElement btnOptionCampaign;

    @FindBy(xpath = "//div/span[contains(text(),'Subcampañas')]")
    private WebElement btnOptionSubcampaign;

    @FindBy(xpath = "//div/span[contains(text(),'Códigos')]")
    private WebElement btnOptionCodes;

    @FindBy(xpath = "//span[contains(text(),'Crear campaña')]")
    public static WebElement btnCreateCampaign;

    @FindBy(xpath = "//span[contains(text(),'Crear subcampaña')]")
    private WebElement btnCreateSubcampaign1;

    @FindBy(xpath = "//span[contains(text(),'Generar códigos')]")
    private WebElement btnGenerateCodes1;

    @FindBy(xpath = "//label[contains(text(),'Subcampaña')]/parent::div/input")
    private WebElement lblSucampaign;

    @FindBy(xpath = "//label[contains(text(),'Campaña')]/parent::div/input")
    private WebElement lblCampaign;

    @FindBy(xpath = "//label[contains(text(),'Nombre')]/parent::div/input")
    private WebElement lblNombreCampaña;

    @FindBy(xpath = "//label[contains(text(),'Área solicitante')]/parent::div/input")
    private WebElement lblAreaSolicitante;

    @FindBy(xpath = "//label[contains(text(),'Estado')]/parent::div")
    private WebElement lblEstado;


    @FindBy(xpath = "//label[contains(text(),'Descripción')]/parent::div/textarea")
    private WebElement lblDescripcion;

    @FindBy(xpath = "//div[contains(text(),'Active')]/parent::div")
    private WebElement lblEstadoActivo;

    @FindBy(xpath = "//div[contains(text(),'Inactive')]/parent::div")
    private WebElement lblEstadoInactivo;

    @FindBy(xpath = "//label[contains(text(),'Fecha inicio')]/parent::div//input")
    private WebElement btnFechaInicio;


    @FindBy(xpath = "//button[@class='v-btn v-date-picker-table__current v-btn--rounded v-btn--outlined theme--light primary--text']")
    private WebElement btnDiaActivo;

    @FindBy(xpath = "//label[contains(text(),'Hora inicio')]/parent::div//input")
    private WebElement btnHoraInicio;

    @FindBy(xpath = "(//span[contains(text(),'OK')])[1]")
    private WebElement btnOKUno;

    @FindBy(xpath = "(//span[contains(text(),'OK')])[2]")
    private WebElement btnOKDos;

    @FindBy(xpath = "(//span[contains(text(),'OK')])[3]")
    private WebElement btnOKTres;

    @FindBy(xpath = "//label[contains(text(),'Fecha final')]/parent::div//input")
    private WebElement btnFechaFinal;

    @FindBy(xpath = "//label[contains(text(),'Hora final')]/parent::div//input")
    private WebElement btnHoraFinal;

    @FindBy(xpath = "//div[contains(text(),'PM')]")
    private WebElement btnHoraPM;


    @FindBy(xpath = "(//span[contains(text(),'Crear campaña')])[2]")
    private WebElement btnCrearCamapania2;

    @FindBy(xpath = "//span[contains(text(),'Cancelar')]")
    private WebElement btnCancelar;


    /**********************************************/
    // Seccion de sub campaña


    @FindBy(xpath = "//label[text()='Nombre corto']/parent::div/input")
    private WebElement btnNombreCorto;

    @FindBy(xpath = "//label[text()='Tipo de cupón']/parent::div")
    private WebElement btnTipoCupon;

    @FindBy(xpath = "//label[text()='Valor de descuento']/parent::div/input")
    private WebElement lblValorDescuento;

    @FindBy(xpath = "//label[text()='Valor mínimo de compra']/parent::div/input")
    private WebElement lblValorMinimoCompra;

    @FindBy(xpath = "//label[text()='Valor máximo de descuento']/parent::div/input")
    private WebElement lblValorMaximoDescuento;

    @FindBy(xpath = "//label[text()='Límite redención']/parent::div/input")
    private WebElement lblLimiteRedencion;

    @FindBy(xpath = "//label[text()='Redención x día']/parent::div/input")
    private WebElement lblRedencionPorDia;

    @FindBy(xpath = "//label[text()='Redención x usuarios']/parent::div/input")
    private WebElement lblRedencionPorUsuario;

    @FindBy(xpath = "//label[text()='Redención x usuario diario']/parent::div/input")
    private WebElement lblRedencionPorUsuarioDiario;

    @FindBy(xpath = "//label[text()='Responsable en cupón']/parent::div/input")
    private WebElement lblResponsableCupon;

    @FindBy(xpath = "//label[text()='Entidad']/parent::div")
    private WebElement btnEntidad;

    @FindBy(xpath = "//label[text()='Nombre de imagen']/parent::div/input")
    private WebElement btnNombreImagen;

    @FindBy(xpath = "(//span[contains(text(),'Crear subcampaña')])[2]")
    private WebElement btnCreateSubcamapign2;

    @FindBy(xpath = "//label[contains(text(),'Identificador de códigos')]/parent::div")
    private WebElement btnIdentificadorCodigo;

    @FindBy(xpath = "//label[text()='Prefijo o Nombre']/parent::div/input")
    private WebElement btnNameCode;

    @FindBy(xpath = "//label[text()='Cantidad a generar']/parent::div/input")
    private WebElement btnAmountToGenerate;

    @FindBy(xpath = "//label[text()='Redenciones por código']/parent::div/input")
    private WebElement btnCodeRedemption;

    @FindBy(xpath = "(//span[contains(text(),'Generar códigos')]/parent::button)[2]")
    private WebElement btnGenerateCode2;

    @FindBy(xpath = "//label[contains(text(),'Buscar')]/parent::div/input")
    private WebElement lblSearch;

    @FindBy(xpath = "((//tr)[2]/td)[1]")
    private WebElement lblFirstColumn;

    @FindBy(xpath = "((//tr)[2]/td)[2]")
    private WebElement lblSecondColumn;

    @FindBy(xpath = "((//tr)[2]/td)[3]")
    private WebElement lblThirdColumn;

    @FindBy(xpath = "((//tr)[2]/td)[4]")
    private WebElement lblQuarterColumn;

    @FindBy(xpath = "((//tr)[2]/td)[5]")
    private WebElement lblFifthColumn;

    @FindBy(xpath = "((//tr)[2]/td)[6]")
    private WebElement lblSixthColumn;

    public CampaignPage(WebDriver driver) {
        super(driver);
    }

    public void fillCampaignForm(List<Map<String,String>> datos) {
        btnOptionCampaign.click();
        btnCreateCampaign.click();
        lblNombreCampaña.sendKeys(datos.get(0).get("nombreCampania"));
        lblAreaSolicitante.sendKeys(datos.get(0).get("areaSolicitante"));
        driver.findElement(By.xpath(String.format("//span[contains(text(),'%s')]", datos.get(0).get("areaSolicitante")))).click();
        lblEstado.click();
        lblEstadoActivo.click();
        lblDescripcion.sendKeys("kfkfhgf");
        selectInitDate();
        selectFinishDate();
        btnCrearCamapania2.click();
    }

    public void findCampaign(String nombreCampania) {
        lblSearch.sendKeys(nombreCampania);
    }

    public void fillSubcampaignForm(List<Map<String,String>> datos) {
        Cupon cupon = cuponPorcentajeDefault();
        Redencion redencion = redencionDefautl();
        lblCampaign.sendKeys(datos.get(0).get("nombreCampania"));
        driver.findElement(By.xpath(String.format("//span[contains(text(),'%s')]", datos.get(0).get("nombreCampania")))).click();
        lblNombreCampaña.sendKeys(datos.get(0).get("nombreSubcampania"));
        btnNombreCorto.sendKeys(datos.get(0).get("nombreCorto"));
        fillCouponInfoSubcampaign(cupon);
        fillRedentionInfo(redencion);
    }

    public void createSubcampaign(List<Map<String,String>> datos) {
        btnOptionSubcampaign.click();
        btnCreateSubcampaign1.click();
        fillSubcampaignForm(datos);
        btnCreateSubcamapign2.click();
    }

    public void findSubcampaign(String nombreSubampania) {
        btnOptionSubcampaign.click();
        Wait.forSeconds(1);
        lblSearch.sendKeys(nombreSubampania);
    }


    public void fillCouponForm(List<Map<String,String>> datos) {
        Codigo codigo = codeDefault();
        lblCampaign.sendKeys(datos.get(0).get("nombreCampania"));
        driver.findElement(By.xpath(String.format("//span[contains(text(),'%s')]", datos.get(0).get("nombreCampania")))).click();
        lblSucampaign.sendKeys(datos.get(0).get("nombreSubcampania"));
        Wait.forSeconds(2);
        driver.findElement(By.xpath(String.format("(//span[contains(text(),'%s')])[1]", datos.get(0).get("nombreSubcampania")))).click();
        selectInitDate();
        selectFinishDate();
        btnIdentificadorCodigo.click();
        driver.findElement(By.xpath(String.format("//div[contains(text(),'%s')]", codigo.getCodeType()))).click();
        if ("Prefijo + Alfanumérico".equals(codigo.getCodeType())) {
            btnNameCode.sendKeys(codigo.getName());
        }
        btnAmountToGenerate.sendKeys(codigo.getAmountToGenerate());
        btnCodeRedemption.sendKeys(codigo.getCodeRedemption());
        Wait.forSeconds(2);
    }

    public void createCoupon(List<Map<String,String>> datos) {
        btnOptionCodes.click();
        btnGenerateCodes1.click();
        fillCouponForm(datos);
        btnGenerateCode2.click();
    }

    public void findCoupon(String nombreCupon) {
        btnOptionCodes.click();
        Wait.forSeconds(1);
        lblSearch.sendKeys(nombreCupon);
    }

    public void selectInitDate() {
        btnFechaInicio.click();
        Wait.forSeconds(1);
        btnDiaActivo.click();
        btnOKUno.click();
        btnHoraInicio.click();
        Wait.forSeconds(1);
        driver.findElement(By.xpath(String.format("//span[text()='%s']", "10"))).click();
        Wait.forSeconds(1);
        driver.findElement(By.xpath(String.format("//span[text()='%s']", "10"))).click();
        btnHoraPM.click();
        btnOKDos.click();
    }

    public void selectFinishDate() {
        btnFechaFinal.click();
        Wait.forSeconds(btnDiaActivo, 2);
        btnDiaActivo.click();
        btnOKDos.click();
        btnHoraFinal.click();
        Wait.forSeconds(btnHoraPM, 2);
        btnHoraPM.click();
        Wait.forSeconds(1);
        driver.findElement(By.xpath(String.format("//span[text()='%s']", "11"))).click();
        Wait.forSeconds(1);
        driver.findElement(By.xpath(String.format("//span[text()='%s']", "10"))).click();
        btnOKTres.click();
    }

    public void fillCouponInfoSubcampaign(Cupon cupon) {
        btnTipoCupon.click();
        driver.findElement(By.xpath(String.format("//div[text()='%s']", cupon.getTipoCupon()))).click();
        lblValorDescuento.sendKeys(cupon.getValorDescuento());
        lblValorMinimoCompra.sendKeys(cupon.getValorMinimo());
        if (cupon.getTipoCupon().equals("Descuento porcentaje")) {
            lblValorMaximoDescuento.sendKeys(cupon.getValorMaximo());
        }
    }

    public void fillRedentionInfo(Redencion redencion) {
        lblLimiteRedencion.sendKeys(redencion.getLimiteRedenciones());
        lblRedencionPorDia.sendKeys(redencion.getRedencionPorDia());
        lblRedencionPorUsuario.sendKeys(redencion.getRedencionPorUsuario());
        lblRedencionPorUsuarioDiario.sendKeys(redencion.getRedencionPorUsuarioDiario());
        lblDescripcion.sendKeys(redencion.getDescripcion());
        lblResponsableCupon.sendKeys(redencion.getResponsableCupon());
        btnEntidad.click();
        driver.findElement(By.xpath(String.format("//div[text()='%s']", redencion.getEntidad()))).click();
        btnNombreImagen.sendKeys(redencion.getNombreImagen());
    }

    public void basicFlowtoCreateCampaignSubcampaignAndCoupon(List<Map<String,String>> datos) {
        fillCampaignForm(datos);
        getStoresAndBrandsPage().viewPopUpInfoTo(CREATE_CAMPAIGN_TYPE);
        fillSubcampaignForm(datos);
        btnCreateSubcampaign1.click();
        getStoresAndBrandsPage().viewPopUpInfoTo(CREATE_SUBCAMPAIGN_TYPE);
        fillCouponForm(datos);
        btnGenerateCodes1.click();
    }

    public void seeTheElementCreate(String nombreElemento) {
        Wait.forSeconds(btnCancelar, 2);
        btnCancelar.click();
        Wait.forSeconds(2);
        Assert.assertTrue(driver.findElement(By.xpath(String.format("//td[@title='%s']", nombreElemento))).isEnabled());
    }

    public void validateElementData(String element, List<Map<String, String>> datos) {
        Wait.forSeconds(3);
        switch (element.toUpperCase()) {
            case "CUPON":
                validateCoupon(datos);
                break;
            case "CAMPA\u00D1A":
                validateCampaign(datos);
                break;
            case "SUBCAMPA\u00D1A":
                validateSubcampaign(datos);
                break;
            default:
                Assert.assertEquals("Elemento tipo CAMPA\u00D1A, SUBCAMPA\u00D1A o CUPON", "No se recibio ninguno de los anteriores");
                break;
        }
    }

    public void validateCampaign(List<Map<String, String>> datos) {
        Wait.forSeconds(2);
        Assert.assertEquals(lblFirstColumn.getText(), datos.get(0).get("nombreCampania"));
        Assert.assertEquals(lblSecondColumn.getText(), datos.get(0).get("fechaInicial"));
        Assert.assertEquals(lblThirdColumn.getText(), datos.get(0).get("fechaFinal"));
        Assert.assertEquals(lblQuarterColumn.getText(), datos.get(0).get("estado"));
    }

    public void validateSubcampaign(List<Map<String, String>> datos) {
        Wait.forSeconds(2);
        Assert.assertEquals(lblFirstColumn.getText().split(" / ")[1], datos.get(0).get("redimidos"));
        Assert.assertEquals(lblSecondColumn.getText(), datos.get(0).get("nombreSubcampania"));
        Assert.assertEquals(lblThirdColumn.getText(), datos.get(0).get("nombreCampania"));
        Assert.assertEquals(lblQuarterColumn.getText(), datos.get(0).get("valorDescuento"));
    }

    public void validateCoupon(List<Map<String, String>> datos) {
        Wait.forSeconds(2);
        Assert.assertEquals(lblFirstColumn.getText(), datos.get(0).get("nombreCupon"));
        Assert.assertEquals(lblSecondColumn.getText(), datos.get(0).get("nombreSubcampania"));
        Assert.assertEquals(lblThirdColumn.getText().split(" / ")[1], datos.get(0).get("redencion"));
        Assert.assertEquals(lblQuarterColumn.getText(), datos.get(0).get("fechaInicial"));
        Assert.assertEquals(lblFifthColumn.getText(), datos.get(0).get("fechaFinal"));
        Assert.assertEquals(lblSixthColumn.getText(), datos.get(0).get("estado"));
    }
}
