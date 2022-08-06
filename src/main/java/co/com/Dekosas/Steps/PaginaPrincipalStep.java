package co.com.Dekosas.Steps;

import co.com.Dekosas.Model.EsperaImplicita;
import co.com.Dekosas.Model.Scroll;
import co.com.Dekosas.PageObjects.CarroDeCompraPageObject;
import co.com.Dekosas.PageObjects.PaginaPrinciaplPageObject;
import co.com.Dekosas.Util.Datos;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class PaginaPrincipalStep {


    Datos datos = new Datos();
    PaginaPrinciaplPageObject paginaPrinciaplPageObject = new PaginaPrinciaplPageObject();

    EsperaImplicita esperaImplicita = new EsperaImplicita();
    Scroll scroll = new Scroll();


    @Step
    public void clickBtnPaginaPrincipal() {
        esperaImplicita.esperaimplicita(5);
        paginaPrinciaplPageObject.getDriver().findElement(paginaPrinciaplPageObject.getBtnPaginaPrincipal()).click();
    }

    @Step
    public void txtBusqueda() throws IOException {
        paginaPrinciaplPageObject.getDriver().findElement(paginaPrinciaplPageObject.getTxtBusqueda()).
                sendKeys(datos.leerDatosExcel("RETOTIENDA.xlsx", "Busqueda", 1, 0));
    }

    @Step
    public void btnBusqueda() {
        paginaPrinciaplPageObject.getDriver().findElement(paginaPrinciaplPageObject.getBtnBusqueda()).click();
    }

    @Step
    public void clickEnElProducto() {
        scroll.scrollElemento(paginaPrinciaplPageObject.getDriver(), paginaPrinciaplPageObject.getClickEnelProducto());
        paginaPrinciaplPageObject.getDriver().findElement(paginaPrinciaplPageObject.getClickEnelProducto()).click();
    }

    @Step
    public void clickAgregarAlcarritoMueble() {
        esperaImplicita.esperaimplicita(5);
        paginaPrinciaplPageObject.getDriver().findElement(paginaPrinciaplPageObject.getBtnAgregarCarritoMueble()).click();
    }
    @Step
    public void clickMenuCarroCompra() {
        esperaImplicita.esperaimplicita(5);
        paginaPrinciaplPageObject.getDriver().findElement(paginaPrinciaplPageObject.getBtnCarroCompra()).click();
    }

    @Step
    public void clickVerCarroCompra() {
        esperaImplicita.esperaimplicita(5);
        paginaPrinciaplPageObject.getDriver().findElement(paginaPrinciaplPageObject.getBtnViewCart()).click();
    }




}

