
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author genario
 */
public class Evento {
    private String nome;
    private Date data;
    private double valorUnico;
    private int capacidadeMaxima;
    private List<Ingresso> ingressos;

    public Evento() {
    }

    public Evento(String nome, String data, double valorUnico, int capacidadeMaxima) {
        this.nome = nome;
        try {
            this.data = new SimpleDateFormat("mm/DD/yyyy").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Evento.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.valorUnico = valorUnico;
        this.capacidadeMaxima = capacidadeMaxima;
        this.ingressos = new ArrayList<Ingresso>();
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorUnico() {
        return valorUnico;
    }

    public void setValorUnico(double valorUnico) {
        this.valorUnico = valorUnico;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }
    
    //vender Ingressos
    public void venderIngresso(Ingresso ingresso){
        
         ingressos.add(ingresso);   
         if (ingressos.size() <= capacidadeMaxima) {
        }else{
            JOptionPane.showMessageDialog(null, "Ingressos Esgotados, exclua "+(ingressos.size()-capacidadeMaxima)+" venda(s)");
        }
        
        
    }
    
    
    
    //Mostrar quantidade de ingressos Vendidos
    public void mostrarVendidos(){
        int Quantidade = ingressos.size();
        JOptionPane.showMessageDialog(null, Quantidade+" foram vendidos.");

    }

  


}
