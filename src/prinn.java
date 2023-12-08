
import javafx.application.Application;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Samuel Melo
 */
public  class  prinn extends Application {
private static boolean valor ;
    /**private boolean valor ;
     * @param args the command line arguments
     */

@Override
        public  void start(Stage primaryStage){
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
               
ExempoFXML tela = new ExempoFXML();


        
        Aluno novo = new Aluno();
       novo.setId(1);
        novo.setNome("Samuel");
        novo.setEmail("samuelmelo98@hotmail.com");
         Aluno novo2 = new Aluno();
       
        
        Manipula_DB db = new Manipula_DB();
        valor=db.inserir(novo);
        System.out.println("Valor:"+valor);
         valor=db.inserir(novo2);
         
    }
    
}
