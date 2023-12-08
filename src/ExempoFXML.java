
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel Melo
 */
public class ExempoFXML extends Application {
 
    public static Scene sena1, sena2, sena3;
    public static Stage JANELA;
    public static String sena;
    public float numero,numero1,result;
    public String nome1, nome2;

 @FXML
 private TextField sobrenome;
 @FXML
 private TextField nome;
   
   
    
    public Parent tela1() throws IOException{
      VBox root = new VBox();
        root.setPrefSize(500, 500);
        
        URL fxmlUrl = this.getClass().getClassLoader().getResource("helloworld.fxml");
        root=FXMLLoader.<VBox>load(fxmlUrl);
          
        Button btn_1 = new Button("Cenário_1");
        btn_1.setOnAction(e -> JANELA.setScene(sena2));
        root.getChildren().addAll( btn_1);
        JANELA.setScene(sena2);
      
        return root;
    }
    
      public Parent tela2() throws IOException{
      AnchorPane root = new AnchorPane();
        root.setPrefSize(500, 500);
      
        URL fxmlUrl = this.getClass().getClassLoader().getResource("db.fxml");
        root=FXMLLoader.<AnchorPane>load(fxmlUrl);
      
        Button btn_1 = new Button("Cenário_2");
        btn_1.setOnAction(e -> JANELA.setScene(sena1));
        root.getChildren().addAll( btn_1);
        JANELA.setScene(sena1);
     
        return root;
    }
    public Parent tela3() throws IOException{
      AnchorPane root = new AnchorPane();
        root.setPrefSize(500, 500);
      
        URL fxmlUrl = this.getClass().getClassLoader().getResource("Adicionar1.fxml");
        root=FXMLLoader.<AnchorPane>load(fxmlUrl);
      
        Button btn_1 = new Button("tela3");
        btn_1.setOnAction(e -> JANELA.setScene(sena1));
     //  btn_1.setOnAction(e -> JOptionPane.showMessageDialog(null, "Tela 01 aaberta"));
        root.getChildren().addAll( btn_1);
        JANELA.setScene(sena3);
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
          alerta.setHeaderText("Preencha todos os campos!");
          alerta.showAndWait();
        return root;
    }
   
 
    
   
  
    @Override
    public void start(Stage primaryStage) throws IOException {
        //layout
        JANELA = primaryStage;
        sena1= new Scene(tela1());
        sena2= new Scene(tela2());
        sena3 = new Scene(tela3());
      
        JANELA.setScene(sena3);
        JANELA.setTitle("OLa");
        JANELA.initStyle(StageStyle.UTILITY);//ou UNDECORATED
         JANELA.setResizable(false);
         JANELA.setMaximized(false);
          JANELA.setTitle("JAVAFX");
        JANELA.show();
        /* AnchorPane noRaiz = new AnchorPane();// tipo de layot nó raiz
        //cria obj url para o documento FXML
        URL fxmlUrl = this.getClass().getClassLoader().getResource("db.fxml");
        //carrega fxml
        noRaiz = FXMLLoader.<AnchorPane>load(fxmlUrl);
        //Cena
        Scene minhacena = new Scene(noRaiz);
        //adicina a cena ao palco
        primaryStage.initStyle(StageStyle.UTILITY);//ou UNDECORATED
        primaryStage.setResizable(false);
        primaryStage.setMaximized(false);
        primaryStage.setTitle("JAVAFX");
        primaryStage.setScene(minhacena);
        //exirbi o palco e sua cena
        primaryStage.show();
        }
         */
        
       
        //float um = um(numero,numero1);
       // System.out.println(um);
        
       
       
    }
    
  
    public static void main(String[] args){
        launch(args);
        
      
        
    
    }
    public void Teste(){
     numero =10;
     numero1=20;
     System.out.println(numero+numero1);
     nome1 = nome.getText();
     nome2 = sobrenome.getText();
        System.out.println(nome1+" "+nome2);
        
        Modelo_Cruzamento obj = new Modelo_Cruzamento("Qms30","01","12");
        obj.Adicionar(obj);
     
 }
    public void Somar(){
        System.out.println("Função teste!!!");
    }
}
