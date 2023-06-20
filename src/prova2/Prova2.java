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

        String nomeDoArquivo = "prova.txt";
        String folder = "/Users/joseinacio/Desktop/ExerEditora/";
        String path = folder + "/" + nomeDoArquivo;

        String nomeCl = "Sem Nome";

        List<String> dados = new ArrayList<>();
        String dataValidade = "";

        double valorPagar = 0.0;
        double peso;
        double txSer = 0.2;

        System.out.println("Digite o nome do cliente (ou 0 para sair):");
        nomeCl = ler.nextLine();
        Produto produto = new Produto(nomeCl, txSer);
        int cont = 1;

        while (cont != 0) {

            System.out.println("Digite os detalhes do pedido:");

            System.out.println("Tipo de produto [1-Pizza, 2-Lanches, 3-Salgadinho]: ");
            int tipoProduto = ler.nextInt();

            switch (tipoProduto) {
                case 1: 
                    System.out.println("1º Tomate | 2º Alho");
                    System.out.print("Recheio: ");
                    ler.nextLine();
                    String saborPizza = ler.nextLine();

                    System.out.println("1º Queijo | 2º Carne | 3º Frango");
                    System.out.println("Cobertura 1: ");
                    String cobertura1 = ler.nextLine();

                    System.out.println("Cobertura 2: ");
                    String cobertura2 = ler.nextLine();

                    System.out.println("Informe o peso por kg: ");
                    peso = ler.nextDouble();
                    ler.nextLine();

                    System.out.println("Data de validade: ");
                    dataValidade = ler.nextLine();

                    produto.adicionarItem(new Pizza(150, dataValidade, peso, saborPizza, cobertura1, cobertura2));
                    dados.add(produto.toString());
                    break;

                case 2:
                    System.out.println("1º Pão cacete | 2º Pão frances");
                    System.out.println("Tipo de pão: ");
                    ler.nextLine();
                    String tipoPao = ler.nextLine();

                    System.out.println("1º Alho | 2º Frango");
                    System.out.println("Recheio: ");
                    String recheio = ler.nextLine();

                    System.out.println("1º Tomate | 2º Outro molho");
                    System.out.println("Molho: ");
                    String molho = ler.nextLine();

                    System.out.println("Informe o peso por kg: ");
                    peso = ler.nextDouble();
                    ler.nextLine();

                    System.out.println("Data de validade: ");
                    dataValidade = ler.nextLine();

                    produto.adicionarItem(new Lanches(50, dataValidade, peso, tipoPao, recheio, molho));
                    dados.add(produto.toString());
                    break;

                case 3:
                    System.out.println("Frito ou Assado: ");
                    System.out.println("Salgadinho: ");
                    ler.nextLine();
                    String modoPreparo = ler.nextLine();

                    System.out.println("1º Folhada | 2º não sei");
                    System.out.println("Massa: ");
                    String massa = ler.nextLine();

                    System.out.println("1º Carne | 2º Frango");
                    System.out.println("Recheio: ");
                    String recheioSalgadinho = ler.nextLine();

                    System.out.println("Informe o peso por kg: ");
                    peso = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Data de validade: ");
                    dataValidade = ler.nextLine();

                    produto.adicionarItem(new Salgadinho(100, dataValidade, peso, modoPreparo, massa, recheioSalgadinho));
                    dados.add(produto.toString());
                    break;

                default:
                    System.out.println("Tipo de produto inválido!");
                    break;
            }

            System.out.println("Digite 1 para continuar! (ou 0 para sair):");
            cont = ler.nextInt();

        }

        System.out.println("Digite o valor entregue pelo cliente!");
        valorPagar = ler.nextDouble();
        
        double totalComTaxa= produto.calcularTotal()+(produto.calcularTotal()*txSer);
        System.out.println("Total do pedido: KZ " + produto.calcularTotal()+" + taxa ="+produto.calcularTotal()*txSer);

        double troco = valorPagar-totalComTaxa;
        System.out.println("Troco KZ " + troco);
        dados.add("troco: " + troco);

        guardarEmprestimo(nomeDoArquivo, path, dados);

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
