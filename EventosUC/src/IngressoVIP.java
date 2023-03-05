/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author genario
 */
public class IngressoVIP extends Ingresso{

    public IngressoVIP() {
    }
    
    public IngressoVIP(String nome, String cpf) {
        super(nome, cpf);
    }

  
    
    
    @Override
    public void calcularValorIngresso(Evento evento) {
        setValor(evento.getValorUnico()*1.3);
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void imprimirValor() {
        setTipo("VIP");
        super.imprimirValor(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

  

    @Override
    public void mostrarResumo(Evento evento) {
        setTipo("VIP");
        super.mostrarResumo(evento); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }



    
    
    
    
    
    
}
