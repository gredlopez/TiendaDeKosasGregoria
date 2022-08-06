package co.com.Dekosas.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class PaginaPrinciaplPageObject extends PageObject {

    By btnPaginaPrincipal = By.xpath("//a[@class='logo']");
    By txtBusqueda = By.xpath("//input[@id='search']");
    By btnBusqueda =By.xpath("//button[@class='action search']");
    By clickEnelProducto = By.xpath("(//A[@href='https://dekosas.com/co/mueble-de-ba-o-lavamanos-nepal-roble-humo-20-20-muebles'])[1]");
    By btnAgregarCarritoMueble =By.xpath("//button[@id='product-addtocart-button']");
    By btnCarroCompra =  By.xpath("(//a[@href='https://dekosas.com/co/checkout/cart/'])[1]");
    By btnViewCart = By.xpath("(//a[@href='https://dekosas.com/co/checkout/cart/'])[3]");


    public By getBtnViewCart() { return btnViewCart;   }

    public By getBtnCarroCompra() { return btnCarroCompra;  }

    public By getBtnAgregarCarritoMueble() { return btnAgregarCarritoMueble; }

    public By getClickEnelProducto() { return clickEnelProducto; }

    public By getBtnBusqueda() { return btnBusqueda; }

    public By getTxtBusqueda() { return txtBusqueda; }

    public By getBtnPaginaPrincipal() { return btnPaginaPrincipal; }


}
