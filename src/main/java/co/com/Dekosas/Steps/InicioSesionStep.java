package co.com.Dekosas.Steps;

import co.com.Dekosas.Model.EsperaExplicitita;
import co.com.Dekosas.Model.EsperaImplicita;
import co.com.Dekosas.PageObjects.InicioSesionPageObject;
import co.com.Dekosas.Util.Datos;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.io.IOException;

public class InicioSesionStep {

    EsperaImplicita esperaImplicita = new EsperaImplicita();
    Datos datos = new Datos();
    InicioSesionPageObject inicioSesionPageObject = new InicioSesionPageObject();
    EsperaExplicitita esperaExplicitita = new EsperaExplicitita();

    @Step
    public void abrirPagina() {
        inicioSesionPageObject.open();
    }

    @Step
    public void BtnMiCuenta() {
        esperaImplicita.esperaimplicita(10);
        inicioSesionPageObject.getDriver().findElement(inicioSesionPageObject.getBtnMiCuenta()).click();
    }

    @Step
    public void txtCorreo() throws IOException {
        esperaExplicitita.esperaesplicititaTexto(inicioSesionPageObject.getDriver(), inicioSesionPageObject.getTxtCorreo());
        inicioSesionPageObject.getDriver().findElement(inicioSesionPageObject.getTxtCorreo()).
                sendKeys(datos.leerDatosExcel("RETOTIENDA.xlsx", "InicioSecion", 1, 0));
    }

    @Step
    public void txtContrasena() throws IOException {
        inicioSesionPageObject.getDriver().findElement(inicioSesionPageObject.getTxtContrasena())
                .sendKeys(datos.leerDatosExcel("RETOTIENDA.xlsx", "InicioSecion", 1, 1));
    }

    @Step
    public void BtnEntrar() {
        esperaImplicita.esperaimplicita(10);
        inicioSesionPageObject.getDriver().findElement(inicioSesionPageObject.getBtnEntrar()).click();
    }

    @Step
    public void ValidarCuentaIniciada() {
        Assert.assertThat(inicioSesionPageObject.getDriver().
                findElement(inicioSesionPageObject.getValidacionLogin()).isDisplayed(), Matchers.is(true));
    }

}
