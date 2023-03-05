
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author genario
 */
public class Ingresso{
   private String nome;
   private String cpf;
   private double valor;
   private String tipo;
   
  
    public void calcularValorIngresso(Evento evento){
        setValor(evento.getValorUnico());
    }
    public void imprimirValor(){
        JOptionPane.showMessageDialog(null,
                "categoria do ingresso: "+getTipo()
                +"\nValor do ingresso: "+getValor());
    }
    
    public void mostrarResumo(Evento evento){
       evento.getNome();
       evento.getValorUnico();
       getValor();
       
       JOptionPane.showMessageDialog(null,
               "Nome do titular: "+nome
               +"\n CPF: "+cpf
               +"\n Evento: "+evento.getNome()
               +"\n Data: "+evento.getData()
                +"\n tipo de ingresso: "+getTipo()
               +"\n Valor do ingresso: "+getValor()
               
       );
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
    

    public Ingresso() {
    }

    public Ingresso(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    

        
    
}
