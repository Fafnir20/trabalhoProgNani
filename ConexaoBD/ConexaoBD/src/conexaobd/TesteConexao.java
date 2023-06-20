/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaobd;

import java.sql.DriverManager;
import java.sql.*;


/**
 *
 * @author joseinacio
 */
public class TesteConexao {
    private Connection conexao;
    private PreparedStatement ps;
    private Statement statement;
    private ResultSet rs;
    
        public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bar?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
           // JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException ex) {
           ex.printStackTrace();
        }
    }
        
        public void inserir(String nome, String telefone, String endereco){
            connect();
            try {
               
                String insert = "insert into cliente(nome, telefone, endereco) values (?, ?, ?)";
                ps = conexao.prepareStatement(insert);
                ps.setString(1, nome);
                ps.setString(2, telefone);
                ps.setString(3, endereco);
                ps.executeUpdate();
                
            } catch (SQLException ex) {
               ex.printStackTrace();
            }
            
        }
        
}
