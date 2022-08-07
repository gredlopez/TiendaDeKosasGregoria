package co.com.Dekosas.Steps;


import co.com.Dekosas.Model.EsperaImplicita;
import co.com.Dekosas.PageObjects.DatosCajaPageObject;
import co.com.Dekosas.Util.Datos;
import net.thucydides.core.annotations.Step;

import java.io.IOException;


public class DatosCajaStep {
    EsperaImplicita esperaImplicita = new EsperaImplicita();

    Datos datos = new Datos();


    DatosCajaPageObject datosCajaPageObject = new DatosCajaPageObject();

    @Step
    public void txtNombre() throws IOException {
        esperaImplicita.esperaimplicita(10);
        datosCajaPageObject.getDriver().findElement(datosCajaPageObject.getTxtNombre()).
                sendKeys(datos.leerDatosExcel("RETOTIENDA.xlsx", "DireccionDeEnvio", 1, 0));

    }

    @Step
    public void txtApellido()  throws IOException {
        datosCajaPageObject.getDriver().findElement(datosCajaPageObject.getTxtApellido()).
                sendKeys(datos.leerDatosExcel("RETOTIENDA.xlsx", "DireccionDeEnvio", 1, 1));

    }

    @Step
    public void txtDirPostal()  throws IOException {
        datosCajaPageObject.getDriver().findElement(datosCajaPageObject.getTxtCodigoPostal()).
                sendKeys(datos.leerDatosExcel("RETOTIENDA.xlsx", "DireccionDeEnvio", 1, 2));

    }

    @Step
    public void txtPais()  throws IOException {
        datosCajaPageObject.getDriver().findElement(datosCajaPageObject.getListPais()).
                sendKeys(datos.leerDatosExcel("RETOTIENDA.xlsx", "DireccionDeEnvio", 1, 3));

    }

    @Step
    public void txtEstado()  throws IOException {
        datosCajaPageObject.getDriver().findElement(datosCajaPageObject.getListRegion()).
                sendKeys(datos.leerDatosExcel("RETOTIENDA.xlsx", "DireccionDeEnvio", 1, 4));

    }

    @Step
    public void txtCiudad()  throws IOException {
        datosCajaPageObject.getDriver().findElement(datosCajaPageObject.getListCiudad()).
                sendKeys(datos.leerDatosExcel("RETOTIENDA.xlsx", "DireccionDeEnvio", 1, 5));

    }
    @Step
    public void txtNroTelefono()  throws IOException {
        datosCajaPageObject.getDriver().findElement(datosCajaPageObject.getTxtTelefono()).
                sendKeys(datos.leerDatosExcel("RETOTIENDA.xlsx", "DireccionDeEnvio", 1, 6));

    }
    @Step
    public void txtTipoIdenti()  throws IOException {
        datosCajaPageObject.getDriver().findElement(datosCajaPageObject.getListTipIdent()).
                sendKeys(datos.leerDatosExcel("RETOTIENDA.xlsx", "DireccionDeEnvio", 1, 7));

    }
    @Step
    public void txtNroIdentidad()  throws IOException {
        datosCajaPageObject.getDriver().findElement(datosCajaPageObject.getTxtNroEntidad()).
                sendKeys(datos.leerDatosExcel("RETOTIENDA.xlsx", "DireccionDeEnvio", 1, 8));

    }

    @Step
    public void clickBtnSiguiente(){
        datosCajaPageObject.getDriver().findElement(datosCajaPageObject.getBtnSiguiente()).click();
    }





}
