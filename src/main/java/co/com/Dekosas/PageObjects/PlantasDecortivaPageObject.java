package co.com.Dekosas.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class PlantasDecortivaPageObject extends PageObject {
    By btnMenu = By.xpath("//div[@id='main-toggle-menu']");
    By btnDecoracion = By.xpath("//a[.='Decoración']");
    By btnPlantaDecorativa = By.xpath("    //*[@id=\"store.menu\"]/nav/ul/li[5]/div[2]/div/div/ul/li[6]/a/span");
    By btnMaceta = By.xpath("(//div[@class='product photo product-item-photo'])[2]/a");
    By btnAgregar1 = By.xpath("//a[@class='qty-inc']");
    By btnAgregarAlCarrito = By.xpath("//button[@id='product-addtocart-button']");


    public By getBtnAgregarAlCarrito() { return btnAgregarAlCarrito; }

    public By getBtnAgregar1() { return btnAgregar1; }

    public By getBtnMaceta() { return btnMaceta; }

    public By getBtnPlantaDecorativa() {
        return btnPlantaDecorativa;
    }

    public By getBtnDecoracion() {
        return btnDecoracion;
    }

    public By getBtnMenu() { return btnMenu;
    }
}
