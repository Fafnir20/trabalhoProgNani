/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author joseinacio
 */
public class Prova2 {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
        
           
        
        Scanner ler = new Scanner(System.in);

        String nomeDoArquivo = "Segundo.txt";
        String folder = "C:\\Users\\amori\\OneDrive\\Desktop\\Ficheiro01";
        String path = folder + "\\" + nomeDoArquivo;

        String nomeCl = "Sem Nome";

        List<String> facturaRecibo = new ArrayList<>();
        String dataValidade = "";

        double valorPagar = 0.0;
        double peso;
        double txSer = 0.2;
        int tamanhoPizza;

        System.out.println("Digite o nome do cliente (ou 0 para sair):");
        nomeCl = ler.nextLine();
        Produto produto = new Produto(nomeCl, txSer);
        int cont = 1;

        while (cont != 0) {

            System.out.println("Digite os detalhes do pedido:");

            System.out.println("""
                               Tipo de produto 
                               [1]-Pizza 
                               [2]-Lanches 
                               [3]-Salgadinho]: 
                               """);
            int tipoProduto = ler.nextInt();

            switch (tipoProduto) {
                case 1:
                    System.out.println("""
                                       [1]Tamanho pequeno 
                                       [2]Tamanho Médio 
                                       [3]Tamanho Grande
                                       """);
                    tamanhoPizza = ler.nextInt();
                    
                    if(tamanhoPizza == 1){
                        tamanhoPizza = 8;
                    }else if(tamanhoPizza==2){
                        tamanhoPizza = 15;
                    }else if(tamanhoPizza==3){
                        tamanhoPizza = 25;
                    }
                        

                    System.out.println("1º Tomate | 2º Alho");
                    System.out.print("Recheio: ");
                    int IntSaborPizza = ler.nextInt();
                    ler.nextLine();
                    String saborPizza = "";

                    switch (IntSaborPizza) {
                        case 1: 
                            saborPizza = "Tomate";
                        case 2:
                            saborPizza = "Alho";
                        default: 
                                
                            System.out.println("OPÇÃO INVÁLIDA!");
                        
                                break;
                    }

                    System.out.println("1º Queijo | 2º Carne | 3º Frango");
                    System.out.println("Cobertura 1: ");
                    int IntCobertura = ler.nextInt();
                    String cobertura1 = "";

                    switch (IntCobertura) {
                        case 1 ->
                            cobertura1 = "Queijo";
                        case 2 ->
                            cobertura1 = "Carne";
                        case 3 ->
                            cobertura1 = "Frango";
                        default ->
                            JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
                    }

                    System.out.println("1º Ketchup | 2º Maionese");
                    System.out.println("Molho: ");
                    int IntMolho = ler.nextInt();
                    String molho = "";

                    switch (IntMolho) {
                        case 1 ->
                            molho = "Ketchup";
                        case 2 ->
                            molho = "Maionese";
                        default ->
                            JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
                    }

                    System.out.println("Informe o peso por kg: ");
                    peso = ler.nextDouble();
                    ler.nextLine();

                   /* System.out.println("Data de validade: ");
                    dataValidade = ler.nextLine();*/

                    produto.adicionarItem(new Pizza(tamanhoPizza, "10/06/2023", peso, saborPizza, cobertura1, molho));
                    facturaRecibo.add(produto.toString());

                    System.out.println("Deseja adicionar mais uma prato? Digite 1 para sim ou 0 para não:");
                    cont = ler.nextInt();
                    break;

                case 2:
                    System.out.println("1º Pão cacete | 2º Pão frances");
                    System.out.println("Tipo de pão: ");
                    ler.nextLine();
                    int IntTipoPao = ler.nextInt();

                    String tipoPao = "";

                    switch (IntTipoPao) {
                        case 1 ->
                            tipoPao = "Pão cacete";
                        case 2 ->
                            tipoPao = "Pão frances";
                        default ->
                            JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
                    }

                    System.out.println("1º Alho | 2º Frango");
                    System.out.println("Recheio: ");
                    int IntRecheio = ler.nextInt();
                    String recheio = "";

                    switch (IntRecheio) {
                        case 1 ->
                            recheio = "Alho";
                        case 2 ->
                            recheio = "Frango";
                        default ->
                            JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
                    }

                    System.out.println("1º Tomate | 2º Outro molho");
                    System.out.println("Molho: ");
                    ler.nextLine();
                    IntMolho = ler.nextInt();

                    molho = "";
                    switch (IntMolho) {
                        case 1 ->
                            molho = "Tomate";
                        case 2 ->
                            molho = "Outro molho";
                        default ->
                            JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
                    }

                    System.out.println("Informe o peso por kg: ");
                    peso = ler.nextDouble();
                    ler.nextLine();

                    System.out.println("Data de validade: ");
                    dataValidade = ler.nextLine();

                    produto.adicionarItem(new Lanches(50, dataValidade, peso, tipoPao, recheio, molho));
                    facturaRecibo.add(produto.toString());

                    System.out.println("Deseja adicionar mais um prato? Digite 1 para sim ou 0 para não:");
                    cont = ler.nextInt();
                    break;

                case 3:
                    System.out.println("Modo de preparo");
                    System.out.println("1-Frito | 2-Assado: ");
                    System.out.println("Salgadinho: ");
                    int IntmodoPreparo = ler.nextInt();

                    String modoPreparo = "";
                    switch (IntmodoPreparo) {
                        case 1 ->
                            recheio = "Frito";
                        case 2 ->
                            recheio = "Assado";
                        default ->
                            JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
                    }

                    System.out.println("1º Folhada | 2º Normal");
                    System.out.println("Massa: ");
                    int tipoMassa = ler.nextInt();

                    String massa = "";
                    switch (tipoMassa) {
                        case 1 ->
                            massa = "Folhada";
                        case 2 ->
                            massa = "Normal";
                        default ->
                            JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
                    }

                    System.out.println("1º Carne | 2º Frango");
                    System.out.println("Recheio: ");
                    int tipoRecheio = ler.nextInt();

                    String recheioSalgadinho = "";
                    switch (tipoRecheio) {
                        case 1 ->
                            recheioSalgadinho = "Carne";
                        case 2 ->
                            recheioSalgadinho = "Frango";
                        default ->
                            JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
                    }

                    System.out.println("Informe o peso por kg: ");
                    peso = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Data de validade: ");
                    dataValidade = ler.nextLine();

                    produto.adicionarItem(new Salgadinho(100, dataValidade, peso, modoPreparo, massa, recheioSalgadinho));
                    facturaRecibo.add(produto.toString());

                    System.out.println("Deseja adicionar mais um prato? Digite 1 para sim ou 0 para não:");
                    cont = ler.nextInt();
                    break;

                default:
                    System.out.println("Tipo de produto inválido!");
                    break;
            }
        }

        System.out.println("Digite o valor entregue pelo cliente!");
        valorPagar = ler.nextDouble();

        double totalComTaxa = produto.calcularTotal() + (produto.calcularTotal() * txSer);
        System.out.println("Total do pedido: KZ " + produto.calcularTotal() + " + taxa =" + produto.calcularTotal() * txSer);

        double troco = valorPagar - totalComTaxa;
        System.out.println("Troco KZ " + troco);
        facturaRecibo.add("troco: " + troco);

        
        
    

        guardarEmprestimo(nomeDoArquivo, path, facturaRecibo);

    }

    private static void guardarEmprestimo(String nomeDoArquivo, String path, List<String> dados) {

        FileWriter stream;
        PrintWriter print;

        try {
            //stream é uma conexao de escrita para o arquivo
            stream = new FileWriter(path);
            //class PrintWriter vai escrever no arquivo
            print = new PrintWriter(stream);

            for (String linha : dados) {
                print.println(linha);
            }
            //fechar o arquivo
            stream.close();
            print.close();

            System.out.println("O arquivo " + nomeDoArquivo + " foi guardado na pasta " + path);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
