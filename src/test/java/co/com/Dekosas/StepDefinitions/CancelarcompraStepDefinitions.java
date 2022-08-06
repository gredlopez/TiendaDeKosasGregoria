package co.com.Dekosas.StepDefinitions;

import co.com.Dekosas.Steps.AgregarTresProductosStep;
import co.com.Dekosas.Steps.CarroDeCompraStep;
import co.com.Dekosas.Steps.DatosCajaStep;
import co.com.Dekosas.Steps.PaginaPrincipalStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class CancelarcompraStepDefinitions {
    @Steps
    AgregarTresProductosStep agregarTresProductosStep;

    @Steps
    DatosCajaStep datosCajaStep;

    @Steps
    PaginaPrincipalStep paginaPrincipalStep;

    @Steps
    CarroDeCompraStep carroDeCompraStep;


    @Dado("^agrega tres productos al carro de compra$")
    public void agrega_tres_productos_al_carro_de_compra() {
        agregarTresProductosStep.clickBtnPaginaPrincipal();
        agregarTresProductosStep.clickBtnMenu();
        agregarTresProductosStep.clickbtnDecoracion();
        agregarTresProductosStep.clickBtnPlantaDecorativa();
        agregarTresProductosStep.clickAgregarProducto1();
        agregarTresProductosStep.clickbtnAggCarrito();

        agregarTresProductosStep.clickBtnPaginaPrincipal();
        agregarTresProductosStep.clickBtnMenu();
        agregarTresProductosStep.clickbtnDecoracion();
        agregarTresProductosStep.clickBtnPlantaDecorativa();
        agregarTresProductosStep.clickAgregarProducto2();

        agregarTresProductosStep.clickBtnPaginaPrincipal();
        agregarTresProductosStep.clickBtnMenu();
        agregarTresProductosStep.clickbtnDecoracion();
        agregarTresProductosStep.clickBtnPlantaDecorativa();
        agregarTresProductosStep.clickAgregarProducto3();
        agregarTresProductosStep.clickbtnAggCarrito();

        agregarTresProductosStep.clickBtnPasarACaja();

    }


    @Cuando("^pase por caja llenara los datos$")
    public void pasePorCajaLlenaraLosDatos() throws IOException {
        datosCajaStep.txtNombre();
        datosCajaStep.txtApellido();
        datosCajaStep.txtDirPostal();
        datosCajaStep.txtPais();
        datosCajaStep.txtEstado();
        datosCajaStep.txtCiudad();
        datosCajaStep.txtNroTelefono();
        datosCajaStep.txtTipoIdenti();
        datosCajaStep.txtNroIdentidad();
        datosCajaStep.clickBtnSiguiente();

    }

    @Entonces("^cancelara la compra\\.$")
    public void cancelaraLaCompra() {
        paginaPrincipalStep.clickMenuCarroCompra();
        paginaPrincipalStep.clickVerCarroCompra();
        carroDeCompraStep.clickEliminarArticulo1();
        carroDeCompraStep.clickEliminarArticulo2();
        carroDeCompraStep.clickEliminarArticulo3();
        carroDeCompraStep.clickEliminarArticulo4();
    }


}
