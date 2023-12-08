
import javafx.fxml.FXML;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Samuel Melo
 */
public class Modelo_Cruzamento {
    private String  endereco,nome,nome2,nome3;
    private String numero;
    private String fases;
    
    Modelo_Cruzamento(String endereco,String numero,String fases){
        this.numero   = numero;
        this.endereco = endereco;
        this.fases    = fases;
    }
    
 
  
    public String Adicionar(Modelo_Cruzamento obj){
        System.out.println("Endereço:"+obj.endereco+"\n Número:"+
                obj.numero+"\n Fases:"+ obj.fases);
       return "Adicionado com Sucesso!"; 
    }
    
}
