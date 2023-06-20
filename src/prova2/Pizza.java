/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova2;

/**
 *
 * @author joseinacio
 */
class Pizza extends ItemPedido {
    private String recheio;
    private String cobertura;
    private String molho;

    public Pizza(double precoVenda, String dataValidade, double peso) {
        super(precoVenda, dataValidade, peso);
    }
    
    

    public Pizza(double precoVenda, String dataValidade, double peso, String recheio, String cobertura, String molho) {
        super(precoVenda, dataValidade, peso);
        this.recheio = recheio;
        this.cobertura = cobertura;
        this.molho = molho;
    }

    @Override
    public double calcularSubtotal() {
        // Implemente o cálculo do subtotal específico para pizzas
        return getPrecoVenda() * getPeso();
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    @Override
    public String toString() {
        return "Pizza " + "recheio=" + recheio + ", cobertura=" + cobertura + ", molho=" + molho;
    }

    
}
