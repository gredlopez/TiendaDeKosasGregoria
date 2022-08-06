package co.com.Dekosas.Model;



public class EsperaImplicita {



    public void esperaimplicita (int segundos){
        try {
            Thread.sleep(segundos*1000);
        }
        catch (InterruptedException e){
            e.printStackTrace(System.out);
        }
    }
}
