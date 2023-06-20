/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexaobd;

import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author joseinacio
 */
public class ConexaoBD {



    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
            TesteConexao tc = new TesteConexao();
            tc.connect();
            
            System.out.println("Digite o nome: ");
            String nome = ler.nextLine();
            System.out.println("Digite telefone");
            String telefone = ler.nextLine();
            System.out.println("Dogite o endereço");
            String endereco = ler.nextLine();
            tc.inserir(nome, telefone, endereco);
    }



}
