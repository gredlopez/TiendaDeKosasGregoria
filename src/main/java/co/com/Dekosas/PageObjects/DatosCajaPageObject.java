package co.com.Dekosas.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class DatosCajaPageObject extends PageObject {

        By txtNombre = By.xpath("//input[@name='firstname']");
        By txtApellido = By.xpath("//input[@name='lastname']");
        By txtCodigoPostal = By.xpath("//input[@name='street[0]']");
        By listPais = By.xpath("//select[@name='country_id']");
        By listRegion = By.xpath("//select[@name='region_id']");
        By listCiudad = By.xpath("//select[@name='city-select']");
        By txtTelefono = By.xpath("//input[@name='telephone']");
        By listTipIdent = By.xpath("//select[@name='bss_custom_field[tipo_identidad]']");
        By txtNroEntidad = By.xpath("//input[@name='bss_custom_field[cedula_o_nit]']");
        By btnSiguiente = By.xpath("//button[@class='button action continue primary']");

    public By getTxtNombre() {
        return txtNombre;
    }

    public By getTxtApellido() {
        return txtApellido;
    }

    public By getTxtCodigoPostal() {
        return txtCodigoPostal;
    }

    public By getListPais() {
        return listPais;
    }

    public By getListRegion() {
        return listRegion;
    }

    public By getListCiudad() {
        return listCiudad;
    }

    public By getTxtTelefono() {
        return txtTelefono;
    }

    public By getListTipIdent() {
        return listTipIdent;
    }

    public By getTxtNroEntidad() {
        return txtNroEntidad;
    }

    public By getBtnSiguiente() {
        return btnSiguiente;
    }
}
