package co.com.Dekosas.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class CarroDeCompraPageObject extends PageObject {

    By btnEliminar1 = By.xpath("(//a[@class='action action-delete'])[1]");
    By btnEliminar2 = By.xpath("(//a[@class='action action-delete'])[2]");
    By btnEliminar3 = By.xpath("(//a[@class='action action-delete'])[3]");
    By btnEliminar4 = By.xpath("(//a[@class='action action-delete'])[4]");
    By visualizarCarroCompra = By.xpath("//span[.='Carrito de Compras']");


    public By getVisualizarCarroCompra() {
        return visualizarCarroCompra;
    }

    public By getBtnEliminar1() {
        return btnEliminar1;
    }

    public By getBtnEliminar2() {
        return btnEliminar2;
    }

    public By getBtnEliminar3() {
        return btnEliminar3;
    }

    public By getBtnEliminar4() {
        return btnEliminar4;
    }
}
