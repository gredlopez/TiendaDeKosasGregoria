package co.com.Dekosas.StepDefinitions;

import co.com.Dekosas.Model.EsperaExplicitita;
import co.com.Dekosas.PageObjects.InicioSesionPageObject;
import co.com.Dekosas.Steps.InicioSesionStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class InicioSesionStepDefinition {
@Steps
    InicioSesionStep inioSesionStep;



    @Dado("^que el usuariose encuentre en la pagina Deskosa$")
    public void queElUsuarioseEncuentreEnLaPaginaDeskosa() throws IOException {
    inioSesionStep.abrirPagina();
    inioSesionStep.BtnMiCuenta();

    }

    @Cuando("^el ingrese el usuario y contrasena$")
    public void elIngreseElUsuarioYContrasena() throws IOException {

        inioSesionStep.txtCorreo();
        inioSesionStep.txtContrasena();
        inioSesionStep.BtnEntrar();
    }

    @Entonces("^el usuario visualizara la entrada exitosa a la pagina$")
    public void elUsuarioVisualizaraLaEntradaExitosaALaPagina() {
        inioSesionStep.ValidarCuentaIniciada();

    }
}
