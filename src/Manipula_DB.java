/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Samuel Melo
 */
public class Manipula_DB {
    private int id;
    private String nome;
    private String email;
    
    public void  Manipular_DB(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public boolean inserir(Aluno obj){
        Aluno novo;
        novo = obj;
        if(novo.getNome()!=null){
            
            System.out.println(novo.getId()+":"+novo.getNome()+":"+novo.getEmail());
        return true;
    }
        else{
            return false;
        }
    }
}
