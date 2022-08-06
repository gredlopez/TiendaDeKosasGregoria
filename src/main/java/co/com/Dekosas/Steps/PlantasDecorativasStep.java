package co.com.Dekosas.Steps;

import co.com.Dekosas.Model.EsperaImplicita;
import co.com.Dekosas.Model.Scroll;
import co.com.Dekosas.PageObjects.CarroDeCompraPageObject;
import co.com.Dekosas.PageObjects.PlantasDecortivaPageObject;
import co.com.Dekosas.Util.Datos;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PlantasDecorativasStep {



    PlantasDecortivaPageObject plantasDecortivaPageObject = new PlantasDecortivaPageObject();

    EsperaImplicita esperaImplicita = new EsperaImplicita();
    Scroll scroll = new Scroll();

        @Step
        public void clickBtnMenu(){
        esperaImplicita.esperaimplicita(5);
        plantasDecortivaPageObject.getDriver().findElement(plantasDecortivaPageObject.getBtnMenu()).click();
    }
         @Step
        public void clickbtnDecoracion(){
        esperaImplicita.esperaimplicita(5);
        Actions action = new Actions(plantasDecortivaPageObject.getDriver());
        WebElement element = plantasDecortivaPageObject.getDriver().findElement(plantasDecortivaPageObject.getBtnDecoracion());
        action.moveToElement(element).build().perform();
    }
        @Step
        public  void clickBtnPlantaDecorativa(){
        esperaImplicita.esperaimplicita(5);
        plantasDecortivaPageObject.getDriver().findElement(plantasDecortivaPageObject.getBtnPlantaDecorativa()).click();

    }
        @Step
         public void clickBtnMaceta(){
        esperaImplicita.esperaimplicita(10);
        scroll.scrollElemento(plantasDecortivaPageObject.getDriver(), plantasDecortivaPageObject.getBtnMaceta());
        plantasDecortivaPageObject.getDriver().findElement(plantasDecortivaPageObject.getBtnMaceta()).click();

    }
         @Step
          public void cliCKBtnAgregar1(){
        esperaImplicita.esperaimplicita(5);
        plantasDecortivaPageObject.getDriver().findElement(plantasDecortivaPageObject.getBtnAgregar1()).click();
        plantasDecortivaPageObject.getDriver().findElement(plantasDecortivaPageObject.getBtnAgregar1()).click();
    }
        @Step
        public void clickBtnAlgregarAlCarrito(){
        plantasDecortivaPageObject.getDriver().findElement(plantasDecortivaPageObject.getBtnAgregarAlCarrito()).click();
        }


}

