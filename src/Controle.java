

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Samuel Melo
 */
public class Controle {
private String teste;
private String teste1;
private String teste2;
private boolean valor;
private String nu,end,fa;

 @FXML
 private TextField nome;
  @FXML
 private TextField sobrenome;
   @FXML
 private TextField senha;
   public void ver() throws IOException{
       System.out.println("MEc hamou");
      teste = nome.getText();
      teste1 = sobrenome.getText();
      teste2 = new String(senha.getText());
      
      if(teste.equals("")||teste1.equals("")||teste2.equals("")){
          JOptionPane.showMessageDialog(null,"Preencha todos os campos!");
          
          
          Exception e = new Exception("An exception!!!!!!!!!!!!!!!!!");
StringWriter sw = new StringWriter();
e.printStackTrace(new PrintWriter(sw));
          Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
          alerta.setHeaderText("Preencha todos os campos!");
          //alerta.getDialogPane().setExpandableContent(new ScrollPane(new TextArea(sw.toString())));
          
          alerta.showAndWait();
            new Alert(Alert.AlertType.INFORMATION, "Preencha todos os campos!").showAndWait().ifPresent(rs->{
                if(rs==ButtonType.OK){
                    System.out.println("Botao OK");
                }
                if(rs==ButtonType.CANCEL){
                    System.out.println("Botao CANCELAR");
                }
                if(rs==ButtonType.CLOSE){
                    System.out.println("Botao CLOSE");
                }
            });
            
            System.out.println("alerta"+alerta);
      }
      else{
      nome.setText("");
      sobrenome.setText("");
      senha.setText("");
      
      
       
 
       System.out.println("nome:"+teste+"\n"+"Sobrenome:"+teste1+"\n"+"Senha:"+teste2);
              }
   }
   @FXML
 private TextField Numero;
   @FXML
   private TextField endereco;
   
    @FXML
   private TextField fases;
    
  
 
     public void add(){
         nu = Numero.getText();
         end = endereco.getText();
         fa = fases.getText();
         
       Modelo_Cruzamento obj = new Modelo_Cruzamento("teste","teste","ttt");
    //String Adicionar = obj.Adicionar(obj);
       
       
         System.out.println(nu+
         end 
                 +
         fa);
       }
   public static void main(String[]args) throws IOException{
       
       System.out.println("".concat("HHHHHH"));
     
}
}
