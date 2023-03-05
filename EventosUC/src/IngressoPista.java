/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author genario
 */

public class IngressoPista extends Ingresso{

    public IngressoPista() {
    }

    public IngressoPista(String nome, String cpf) {
        super(nome, cpf);
    }
    
    

    @Override
    public void setTipo(String tipo) {
        super.setTipo("Ingresso Pista"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    

    @Override
    public void calcularValorIngresso(Evento evento) {
        setValor(evento.getValorUnico());
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void imprimirValor() {
        setTipo("Pista");
        super.imprimirValor(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

  

    @Override
    public void mostrarResumo(Evento evento) {
        setTipo("Pista");
        super.mostrarResumo(evento); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    

    
    
}
