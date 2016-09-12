/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDBC.Conectar;
import JavaBeans.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class ProdutoDAO {
    
    private final Connection conecta;
    
    public ProdutoDAO(){
        this.conecta = new Conectar().conecta();
    }
    
    //Cadastra os produtos
    public  void CadastraProduto(Produto prod){
        try {
            //1º Passo Criar a SQL com o comando
            String comando = "insert into produto (nome,preco) values(?,?)";
            
            //2º passo organizar o comando e executa-lo
            PreparedStatement stmt = conecta.prepareCall(comando);
            stmt.setString(1,prod.getNome());
            stmt.setFloat(2, prod.getPreco());
            
            //3º Executa comando 
            stmt.execute();
            //4º Fecha conexao
            stmt.close();
            
        } catch (SQLException erro) {
                throw new RuntimeException(erro);
        }
    }
    
    public List<Produto> ListarProdutos(){
        try {
            //1º passo Criar o vetor que vai armazenar os registros do banco
            List<Produto> lista = new ArrayList<Produto>();
            //2º Criar SQL
            String sql = "select * from produto";
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            
            //3º Passo guardar o resultado dentro de um obj ResultSet
            ResultSet rs = stmt.executeQuery();
            
            //4º Enqualto tiver resultado guardar no registro da lista
            while (rs.next()) {
                Produto p = new Produto();
                p.setCod_prod(rs.getInt("cod_produto"));
                p.setNome(rs.getString("nome"));
                p.setPreco(rs.getFloat("preco"));
                
                lista.add(p);
            }
            return lista;
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
    
    
     //Altera os produtos
    public  void AlterarProduto(Produto prod){
        try {
            //1º Passo Criar a SQL com o comando
            String comando = "update produto set nome=?, preco=? where cod_produto=?";
            
            //2º passo organizar o comando e executa-lo
            PreparedStatement stmt = conecta.prepareCall(comando);
            stmt.setString(1,prod.getNome());
            stmt.setFloat(2, prod.getPreco());
            stmt.setInt(3, prod.getCod_prod());
            
            //3º Executa comando 
            stmt.execute();
            //4º Fecha conexao
            stmt.close();
            
        } catch (SQLException erro) {
                throw new RuntimeException(erro);
        }
    }
    
    
    
     //Excluir os produtos
    public  void ExcluirProduto(Produto prod){
        try {
            //1º Passo Criar a SQL com o comando
            String comando = "delete from produto where cod_produto = ?";
            
            //2º passo organizar o comando e executa-lo
            PreparedStatement stmt = conecta.prepareCall(comando);
            
            stmt.setInt(1,prod.getCod_prod());
            
            //3º Executa comando 
            stmt.execute();
            //4º Fecha conexao
            stmt.close();
            
        } catch (SQLException erro) {
                throw new RuntimeException(erro);
        }
    }
}
