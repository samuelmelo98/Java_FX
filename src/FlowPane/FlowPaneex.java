/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.KeyEvent;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Samuel Melo
 */
public class  FlowPaneex extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FlowPane NoRaiz = new FlowPane();
        Scene minhacena = new Scene(NoRaiz,300,300);
        
       
        
        ObservableList<String> frutas = FXCollections.observableArrayList("maça","uva","pera");
        ComboBox box = new ComboBox(frutas);
        
        box.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>(){

            @Override
            public void changed(ObservableValue<? extends String> ov, String t, String t1) {
                System.out.println(t1);
            }
            
        });
        
   
       
        
        NoRaiz.getChildren().add(box);
        stage.setScene(minhacena);
        stage.show();
        
    }
    
    public static void main(String args[]){
        
        launch(args);
        
    }
    
    
    
}
