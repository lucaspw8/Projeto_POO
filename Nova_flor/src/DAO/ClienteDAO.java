/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDBC.Conectar;
import JavaBeans.ClienteDados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class ClienteDAO {
     private final Connection conecta;

    public ClienteDAO() {
        this.conecta = new  Conectar().conecta();
    }
     
    
    //Cadastrar Cliente
    public void CadastrarCliente(ClienteDados cli){
        try {
            // 1º passo Criar a SQL
            String comando = "insert into cliente (nome,telefone,email,end) values(?,?,?,?)";
            //2º passo organizar o comando e executa-lo
            PreparedStatement stmt = conecta.prepareStatement(comando);
            
            stmt.setString(1,cli.getNome());
            stmt.setString(2,cli.getTelefone());
            stmt.setString(3,cli.getEmail());
            stmt.setString(4,cli.getEndereco());
            
            //3º Executa comando 
            stmt.execute();
            //4º Fecha conexao
            stmt.close();
            
        } catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
    
    
     public List<ClienteDados> ListarClientes(){
        try {
            //1º passo Criar o vetor que vai armazenar os registros do banco
            List<ClienteDados> lista = new ArrayList<ClienteDados>();
            //2º Criar SQL
            String sql = "select * from cliente";
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            
            //3º Passo guardar o resultado dentro de um obj ResultSet
            ResultSet rs = stmt.executeQuery();
            
            //4º Enqualto tiver resultado guardar no registro da lista
            while (rs.next()) {
                ClienteDados cli = new ClienteDados();
                cli.setId_cliente(rs.getInt("cod_cliente"));
                cli.setNome(rs.getString("nome"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setEmail(rs.getString("email"));
                cli.setEndereco(rs.getString("end"));
                
                lista.add(cli);
            }
            return lista;
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
     //Listar os Clientes por nome
      public List<ClienteDados> BuscarClientes(String nome){
        try {
            //1º passo Criar o vetor que vai armazenar os registros do banco
            List<ClienteDados> lista = new ArrayList<ClienteDados>();
            //2º Criar SQL
            String sql = "select * from cliente where nome=?";
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1,nome);
            //3º Passo guardar o resultado dentro de um obj ResultSet
            ResultSet rs = stmt.executeQuery();
            
            //4º Enqualto tiver resultado guardar no registro da lista
            while (rs.next()) {
                ClienteDados cli = new ClienteDados();
                cli.setId_cliente(rs.getInt("cod_cliente"));
                cli.setNome(rs.getString("nome"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setEmail(rs.getString("email"));
                cli.setEndereco(rs.getString("end"));
                
                lista.add(cli);
            }
            return lista;
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
     
     
     public  void EditarCliente(ClienteDados cli){
        try {
            //1º Passo Criar a SQL com o comando
            String comando = "update cliente set nome=?, telefone=?, email=?, end=? where cod_cliente=?";
            
            //2º passo organizar o comando e executa-lo
            PreparedStatement stmt = conecta.prepareCall(comando);
            stmt.setString(1,cli.getNome());
            stmt.setString(2, cli.getTelefone());
            stmt.setString(3, cli.getEmail());
            stmt.setString(4,cli.getEndereco());
            stmt.setInt(5, cli.getId_cliente());
            
            //3º Executa comando 
            stmt.execute();
            //4º Fecha conexao
            stmt.close();
            
        } catch (SQLException erro) {
                throw new RuntimeException(erro);
        }
    }
     
     
     //Excluir Cliente
    public  void ExcluirCliente(ClienteDados cli){
        try {
            //1º Passo Criar a SQL com o comando
            String comando = "delete from cliente where cod_cliente = ?";
            
            //2º passo organizar o comando e executa-lo
            PreparedStatement stmt = conecta.prepareCall(comando);
            
            stmt.setInt(1,cli.getId_cliente());
            
            //3º Executa comando 
            stmt.execute();
            //4º Fecha conexao
            stmt.close();
            
        } catch (SQLException erro) {
                throw new RuntimeException(erro);
                
        }
    }
    
}
