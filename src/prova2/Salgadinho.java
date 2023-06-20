/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova2;

/**
 *
 * @author joseinacio
 */
class Salgadinho extends ItemPedido {
    private String tipo;
    private String massa;
    private String recheio;

    public Salgadinho(double precoVenda, String dataValidade, double peso,String tipo, String massa, String recheio) {
        super(precoVenda, dataValidade, peso);
        this.tipo = tipo;
        this.massa = massa;
        this.recheio = recheio;
    }

    @Override
    public double calcularSubtotal() {
        // Implemente o cálculo do subtotal específico para salgadinhos
        return getPrecoVenda() * getPeso();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    @Override
    public String toString() {
        return "Salgadinho " + "tipo=" + tipo + ", massa=" + massa + ", recheio=" + recheio;
    }

    
}
