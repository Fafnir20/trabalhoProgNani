/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova2;

/**
 *
 * @author joseinacio
 */
import java.util.ArrayList;
import java.util.List;

// Classe principal que representa o pedido
class Produto{
    private String nomeCliente;
    private List<ItemPedido> itens;
    private double taxaServico;

    public Produto(String nomeCliente, double taxaServico) {
        this.nomeCliente = nomeCliente;
        this.taxaServico = taxaServico;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }


    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }
    
    public double calcularTroco(double valorEntregue){
        double troco = valorEntregue-calcularTotal();
        return troco;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(double taxaServico) {
        this.taxaServico = taxaServico;
    }

    @Override
    public String toString() {
        return "Prato\n" + "nomeCliente=" + nomeCliente + "\n itens=" + itens + "\n taxaServico=" + taxaServico;
    }

    
}


