/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.scene.input.MouseEvent;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class EventoTecladoExemplo1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Layout
        FlowPane noRaiz = new FlowPane();
        JOptionPane pe = new JOptionPane();
        Button botao = new Button();
        botao.setText("Entrar");

        //Cena
        Scene minhaCena = new Scene(noRaiz, 300, 200);
        
        //Manipula evento de teclado
 
          
           minhaCena.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                
                switch(event.getButton()){
                    
                       case PRIMARY:
                           System.out.println(botao);
                           System.out.println("Botao primario");
                           noRaiz.getChildren().remove(botao);
                           
                        break;
                       case SECONDARY:
                           System.out.println("botao secondario");
                           noRaiz.getChildren().add(botao);
                           System.out.println(botao);
                         
                           break;
                }
                
                event.getButton();
                System.out.println(event.getClickCount());
                
            }
        });
 
        //Adicionar a cena ao palco
        primaryStage.setScene(minhaCena);

        //Exibir o palco e sua(s) cena(s)
        primaryStage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }

}
