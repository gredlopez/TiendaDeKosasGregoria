package co.com.Dekosas.Steps;

import co.com.Dekosas.PageObjects.CarroDeCompraPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;


public class  CarroDeCompraStep {

    CarroDeCompraPageObject carroDeCompraPageObject = new CarroDeCompraPageObject();

    @Step
    public void  clickEliminarArticulo1(){
        carroDeCompraPageObject.getDriver().findElement(carroDeCompraPageObject.getBtnEliminar1()).click();
    }
    @Step
    public void  clickEliminarArticulo2(){
        carroDeCompraPageObject.getDriver().findElement(carroDeCompraPageObject.getBtnEliminar2()).click();
    }
    @Step
    public void  clickEliminarArticulo3(){
        carroDeCompraPageObject.getDriver().findElement(carroDeCompraPageObject.getBtnEliminar3()).click();
    }
    @Step
    public void  clickEliminarArticulo4(){
        carroDeCompraPageObject.getDriver().findElement(carroDeCompraPageObject.getBtnEliminar4()).click();
    }

    @Step
    public void visualizacionCarroCompra() {
        Assert.assertThat(carroDeCompraPageObject.getDriver().
                findElement(carroDeCompraPageObject.getVisualizarCarroCompra()).isDisplayed(), Matchers.is(true));
    }

}

