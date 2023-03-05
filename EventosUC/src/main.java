/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author genario
 */
public class main {
    public static void main(String[] args) {
        
        Ingresso ingresso1 = new IngressoPista("Paulo", "000.000.000.00");
        Ingresso ingresso2 = new IngressoCamarote("Guilherme", "111.111.111.11");
        Ingresso ingresso3 = new IngressoVIP("Yago", "222.222.222.22");
        Ingresso ingresso4 = new IngressoVIP("Yago", "222.222.222.22");
        Ingresso ingresso5 = new IngressoVIP("Yago", "222.222.222.22");
        Ingresso ingresso6 = new IngressoVIP("Yago", "222.222.222.22");
        
        Evento evento1 = new Evento("Encontro", "11/10/2022", 200.00, 5);
        

        
        ingresso3.calcularValorIngresso(evento1);
        ingresso3.mostrarResumo(evento1);
        ingresso3.imprimirValor();
        
        evento1.venderIngresso(ingresso1);
        evento1.venderIngresso(ingresso2);
        evento1.venderIngresso(ingresso3);
        evento1.venderIngresso(ingresso4);
        evento1.venderIngresso(ingresso5);
        evento1.venderIngresso(ingresso6);
        
        evento1.mostrarVendidos();

        
        

        
        
        

        

        
        
        
        
    }
       
    
    
    
}
