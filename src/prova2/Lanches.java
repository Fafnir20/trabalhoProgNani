/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova2;

/**
 *
 * @author joseinacio
 */
class Lanches extends ItemPedido {
    private String tipoPao;
    private String recheio;
    private String molho;

    public Lanches(double precoVenda, String dataValidade, double peso,
        String tipoPao, String recheio, String molho) {
        super(precoVenda, dataValidade, peso);
        this.tipoPao = tipoPao;
        this.recheio = recheio;
        this.molho = molho;
    }

    @Override
    public double calcularSubtotal() {
        // Implemente o cálculo do subtotal específico para lanches
        return getPrecoVenda() * getPeso();
    }

    public String getTipoPao() {
        return tipoPao;
    }

    public void setTipoPao(String tipoPao) {
        this.tipoPao = tipoPao;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    @Override
    public String toString() {
        return "Lanches " + "tipoPao=" + tipoPao + ", recheio=" + recheio + ", molho=" + molho;
    }

    
}
