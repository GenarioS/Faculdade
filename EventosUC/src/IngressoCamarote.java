/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author genario
 */
public class IngressoCamarote extends Ingresso{


    public IngressoCamarote() {
    }

    public IngressoCamarote(String nome, String cpf) {
        super(nome, cpf);
    }

    
    

    @Override
    public void calcularValorIngresso(Evento evento) {
        setValor(evento.getValorUnico()*1.6);
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void imprimirValor() {
        setTipo("Camarote");
        super.imprimirValor(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void mostrarResumo(Evento evento) {
        setTipo("Camarote");
        super.mostrarResumo(evento); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
   

    
    
}
