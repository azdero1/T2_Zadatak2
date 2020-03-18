package sample;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.w3c.dom.ls.LSOutput;

public class Controller {
    public TextField unos;
    public TextArea ispis;

    public int sumaCifara(int broj) {
        int suma = 0;

        while(broj != 0){
            suma = suma + broj % 10;
            broj = broj/10;
        }

        return suma;
    }


    public void racunaj(ActionEvent actionEvent) {
        String unosStr = unos.getText();
        int broj = 0;
        try {
           broj = Integer.parseInt(unos.getText());
        }
        catch(Exception e){
            unos.setText("Niste unijeli broj !");
        }
        int i;
        ispis.clear();

        for(i=1; i<=broj; i++){
            if(i % sumaCifara(i) == 0) {
                ispis.appendText(Integer.toString(i));
                ispis.appendText("   ");
            }

        }

    }
}
