package co.com.Dekosas.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://dekosas.com/co/")

public class InicioSesionPageObject extends PageObject {

    By BtnMiCuenta = By.xpath("//div[@class='porto-sicon-header']");
    By txtCorreo = By.xpath("//input[@id='social_login_email']");
    By txtContrasena = By.xpath("//input[@id='social_login_pass']");
    By BtnEntrar = By.xpath("//button[@id='bnt-social-login-authentication']");
    By validacionLogin = By.xpath("//button[@id='bnt-social-login-authentication']");


    public By getValidacionLogin() { return validacionLogin; }

    public By getBtnEntrar() {
        return BtnEntrar;
    }

    public By getTxtContrasena() {
        return txtContrasena;
    }

    public By getTxtCorreo() {
        return txtCorreo;
    }

    public By getBtnMiCuenta() {
        return BtnMiCuenta;
    }
}
