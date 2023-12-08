

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Samuel Melo
 */
public class TelaLabel extends Application {

    @Override
    public void start(Stage stage) throws Exception {
       //Layout
        FlowPane NoRaiz = new FlowPane();
        
        //Cena
        
        Scene minhacena = new Scene(NoRaiz,300,300);//cria cena 
        
        //nó
        
        Label ltxt = new Label();//cria um nó label 
        ltxt.setText("Olá Mundo");// seta  valor no nó label 
        NoRaiz.getChildren().add(ltxt);//adiciona label no stage
        ///botão
        Button botao = new Button();
           Button botao2 = new Button();
        botao.setText("Ação event handle");
        botao2.setText("Ação event SetON");
        botao.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                //Ação do click do botão
                
                System.out.println("clickei no btn");
                
            }

        
            
           
        });
        //evento botao2 on set
        botao2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                
                System.out.println("SetOnAction");
                
            }
        });
        NoRaiz.getChildren().add(botao2);
        NoRaiz.getChildren().add(botao);
        stage.setScene(minhacena);//coloca a cena no stane 
        
        stage.show();//exibe stage
    }
    
    public static void main(String args[]){
        
        launch(args);
        
    }
    
}
