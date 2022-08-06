package co.com.Dekosas.Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class EsperaExplicitita {

    public  void esperaesplicititaTexto (WebDriver driver , By elemento) { //sea vicible
        WebDriverWait myWaitVar = new WebDriverWait(driver, 30);
        myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(elemento));

    }
    public static void esperaesplicititaClick (By elemento, WebDriver driver){  //tienen que haber un elemento clicqueable
            WebDriverWait myWaitVar = new WebDriverWait(driver,30);
            myWaitVar.until(ExpectedConditions.elementToBeClickable(elemento));
        }



    public void esperaCargaPagina (WebDriver driver) {
        driver.manage().timeouts().pageLoadTimeout( 20, TimeUnit.SECONDS); //esperae que carge una pagina
    }
    }

