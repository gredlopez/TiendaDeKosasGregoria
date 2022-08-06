package co.com.Dekosas.StepDefinitions;

import co.com.Dekosas.Steps.CarroDeCompraStep;
import co.com.Dekosas.Steps.InicioSesionStep;
import co.com.Dekosas.Steps.PaginaPrincipalStep;
import co.com.Dekosas.Steps.PlantasDecorativasStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class CarroDeCompraStepDefinition {

    @Steps
    CarroDeCompraStep carroDeCompraStep;

    @Steps
    PlantasDecorativasStep plantasDecorativasStep;

    @Steps
    PaginaPrincipalStep paginaPrincipalStep;

    @Dado("^que el usuario se encuentre en la sub categoria planta decorativa$")
    public void queElUsuarioSeEncuentreEnLaSubCategoriaPlantaDecorativa() {
        plantasDecorativasStep.clickBtnMenu();
        plantasDecorativasStep.clickbtnDecoracion();
        plantasDecorativasStep.clickBtnPlantaDecorativa();
        plantasDecorativasStep.clickBtnMaceta();
        plantasDecorativasStep.cliCKBtnAgregar1();

    }

    @Cuando("^agrege un producto al carro de compra$")
    public void agregeUnProductoAlCarroDeCompra() throws IOException {
        plantasDecorativasStep.clickBtnAlgregarAlCarrito();
        paginaPrincipalStep.clickBtnPaginaPrincipal();
        paginaPrincipalStep.txtBusqueda();
        paginaPrincipalStep.btnBusqueda();
        paginaPrincipalStep.clickEnElProducto();
        paginaPrincipalStep.clickAgregarAlcarritoMueble();

    }

    @Entonces("^el usuario visualizara los productos en el carro de compra$")
    public void elUsuarioVisualizaraLosProductosEnElCarroDeCompra() {

        carroDeCompraStep.visualizacionCarroCompra();
    }


}
