package co.com.Dekosas.Steps;

import co.com.Dekosas.Model.EsperaImplicita;
import co.com.Dekosas.Model.Scroll;
import co.com.Dekosas.PageObjects.AgregarTresProductosPageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class AgregarTresProductosStep {
    EsperaImplicita esperaImplicita = new EsperaImplicita();
    Scroll scroll = new Scroll();
    AgregarTresProductosPageObject agregarTresProductosPageObject = new AgregarTresProductosPageObject();

    @Step
    public void clickBtnPaginaPrincipal() {
        esperaImplicita.esperaimplicita(10);
        agregarTresProductosPageObject.getDriver().findElement(agregarTresProductosPageObject.getBtnPaginaPrincipal()).click();

    }

    @Step
    public void clickBtnMenu() {
        esperaImplicita.esperaimplicita(10);
        agregarTresProductosPageObject.getDriver().findElement(agregarTresProductosPageObject.getBtnMenu()).click();
    }

    @Step
    public void clickbtnDecoracion() {
        esperaImplicita.esperaimplicita(10);
        Actions action = new Actions(agregarTresProductosPageObject.getDriver());
        WebElement element = agregarTresProductosPageObject.getDriver().findElement(agregarTresProductosPageObject.getBtnDecoracion());
        action.moveToElement(element).build().perform();
    }

    @Step
    public void clickBtnPlantaDecorativa() {
        esperaImplicita.esperaimplicita(10);
        agregarTresProductosPageObject.getDriver().findElement(agregarTresProductosPageObject.getBtnPlantaDecorativa()).click();

    }

    @Step
    public void clickAgregarProducto1() {
        esperaImplicita.esperaimplicita(10);
        scroll.scrollElemento(agregarTresProductosPageObject.getDriver(), agregarTresProductosPageObject.getProducto1());
        agregarTresProductosPageObject.getDriver().findElement(agregarTresProductosPageObject.getProducto1()).click();
    }

    @Step
    public void clickAgregarProducto2() {
        esperaImplicita.esperaimplicita(10);
        scroll.scrollElemento(agregarTresProductosPageObject.getDriver(), agregarTresProductosPageObject.getProducto2());
        agregarTresProductosPageObject.getDriver().findElement(agregarTresProductosPageObject.getProducto2()).click();
    }

    @Step
    public void clickAgregarProducto3() {
        esperaImplicita.esperaimplicita(10);
        scroll.scrollElemento(agregarTresProductosPageObject.getDriver(), agregarTresProductosPageObject.getProducto3());
        agregarTresProductosPageObject.getDriver().findElement(agregarTresProductosPageObject.getProducto3()).click();
    }

    @Step
    public void clickbtnAggCarrito() {
        esperaImplicita.esperaimplicita(10);
        agregarTresProductosPageObject.getDriver().findElement(agregarTresProductosPageObject.getBtnAggCarrito()).click();
    }

    @Step
    public void clickBtnPasarACaja() {
        esperaImplicita.esperaimplicita(60);
        agregarTresProductosPageObject.getDriver().findElement(agregarTresProductosPageObject.getBtnPasarACaja()).click();

    }
}
