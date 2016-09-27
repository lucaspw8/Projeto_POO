/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDBC.Conectar;
import JavaBeans.Produto;
import JavaBeans.Servico;
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
public class ServicoDAO {
     private final Connection conecta;
    
    public ServicoDAO(){
        this.conecta = new Conectar().conecta();
    }
    
    //Cadastra os produtos
    public  void CadastraServico(Servico serv){
        try {
            //1º Passo Criar a SQL com o comando
            String comando = "insert into servico (tipo_servico,preco) values(?,?)";
            
            //2º passo organizar o comando e executa-lo
            PreparedStatement stmt = conecta.prepareCall(comando);
            stmt.setString(1,serv.getTipo_servico());
            stmt.setFloat(2, serv.getPreco_servico());
            
            //3º Executa comando 
            stmt.execute();
            //4º Fecha conexao
            stmt.close();
            
        } catch (SQLException erro) {
                throw new RuntimeException(erro);
        }
    }
    
    //Excluir os produtos
    public  void ExcluirServico(Servico serv){
        try {
            //1º Passo Criar a SQL com o comando
            String comando = "delete from servico where cod_servico = ?";
            
            //2º passo organizar o comando e executa-lo
            PreparedStatement stmt = conecta.prepareCall(comando);
            
            stmt.setInt(1,serv.getCod_servico());
            
            //3º Executa comando 
            stmt.execute();
            //4º Fecha conexao
            stmt.close();
            
        } catch (SQLException erro) {
                throw new RuntimeException(erro);
        }
    }
    
    //Altera os produtos
    public  void AlterarServico(Servico serv){
        try {
            //1º Passo Criar a SQL com o comando
            String comando = "update servico set tipo_servico=?, preco=? where cod_servico=?";
            
            //2º passo organizar o comando e executa-lo
            PreparedStatement stmt = conecta.prepareCall(comando);
            stmt.setString(1,serv.getTipo_servico());
            stmt.setFloat(2, serv.getPreco_servico());
            stmt.setInt(3, serv.getCod_servico());
            
            //3º Executa comando 
            stmt.execute();
            //4º Fecha conexao
            stmt.close();
            
        } catch (SQLException erro) {
                throw new RuntimeException(erro);
        }
    }
    public List<Servico> ListarServicos(){
        try {
            //1º passo Criar o vetor que vai armazenar os registros do banco
            List<Servico> lista = new ArrayList<Servico>();
            //2º Criar SQL
            String sql = "select * from servico";
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            
            //3º Passo guardar o resultado dentro de um obj ResultSet
            ResultSet rs = stmt.executeQuery();
            
            //4º Enqualto tiver resultado guardar no registro da lista
            while (rs.next()) {
                Servico serv = new Servico();
                serv.setCod_servico(rs.getInt("cod_servico"));
                serv.setTipo_servico(rs.getString("tipo_servico"));
                serv.setPreco_servico(rs.getFloat("preco"));
                
                lista.add(serv);
            }
            return lista;
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
}
