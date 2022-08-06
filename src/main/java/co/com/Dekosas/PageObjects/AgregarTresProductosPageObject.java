package co.com.Dekosas.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AgregarTresProductosPageObject extends PageObject {
    By btnPaginaPrincipal = By.xpath("//a[@class='logo']");
    By btnMenu = By.xpath("//div[@id='main-toggle-menu']");
    By btnDecoracion = By.xpath("//a[.='Decoración']");
    By btnPlantaDecorativa = By.xpath("    //*[@id=\"store.menu\"]/nav/ul/li[5]/div[2]/div/div/ul/li[6]/a/span");
    By Producto1 = By.xpath("(//div[@class='product photo product-item-photo']/a)[1]");
    By Producto2 = By.xpath("(//div[@class='product photo product-item-photo']/a)[2]");
    By Producto3 = By.xpath("(//div[@class='product photo product-item-photo']/a)[3]");
    By btnAggCarrito= By.xpath("//button[@id='product-addtocart-button']");
    By btnPasarACaja = By.xpath("//button[@title='Pasar por caja']");

    public By getBtnAggCarrito() {
        return btnAggCarrito;
    }

    public By getProducto1() { return Producto1; }
    public By getProducto2() { return Producto2; }
    public By getProducto3() { return Producto3; }

    public By getBtnPlantaDecorativa() { return btnPlantaDecorativa; }

    public By getBtnDecoracion() { return btnDecoracion; }

    public By getBtnMenu() { return btnMenu; }

    public By getBtnPaginaPrincipal() { return btnPaginaPrincipal; }

    public By getBtnPasarACaja() { return btnPasarACaja; }
}
