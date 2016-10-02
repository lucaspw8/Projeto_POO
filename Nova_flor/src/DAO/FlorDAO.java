/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDBC.Conectar;
import JavaBeans.Flor;
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
public class FlorDAO {
    private final Connection conecta;
    //construtor
    public FlorDAO(){
        this.conecta = new Conectar().conecta();
    }
    
    //Cadastro de Flor
    public void cadastrarFlor(Flor f){
        try {
            String comando = "insert into flores (nome,qtd) values (? ,?)";
            PreparedStatement stmt = conecta.prepareStatement(comando);
            stmt.setString(1,f.getNome());
            stmt.setInt(2,f.getQtd_flor());
            
            stmt.execute();
            stmt.close();
            
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        
    }
    
    
    //Excluir Flor
    public void excluirFlor(Flor f){
        try {
            //1º Passo Criar a SQL com o comando
            String comando = "delete from flores where cod_flor = ?";
            
            //2º passo organizar o comando e executa-lo
            PreparedStatement stmt = conecta.prepareCall(comando);
            
            stmt.setInt(1,f.getCod_flor());
            
            //3º Executa comando 
            stmt.execute();
            //4º Fecha conexao
            stmt.close();
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
    
    //Editar Flor
    public void editarFlor(Flor f){
        try {
            //1º Passo Criar a SQL com o comando
            String comando = "update flores set nome=?, qtd=? where cod_flor=?";
            
            //2º passo organizar o comando e executa-lo
            PreparedStatement stmt = conecta.prepareCall(comando);
            stmt.setString(1,f.getNome());
            stmt.setInt(2, f.getQtd_flor());
            stmt.setInt(3, f.getCod_flor());        
            
            //3º Executa comando 
            stmt.execute();
            //4º Fecha conexao
            stmt.close();
            
        } catch (SQLException erro) {
                throw new RuntimeException(erro);
        }
    }
    
    
    public List<Flor> ListarFlores(){
        try {
            //1º passo Criar o vetor que vai armazenar os registros do banco
            List<Flor> lista = new ArrayList<Flor>();
            //2º Criar SQL
            String sql = "select * from flores";
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            
            //3º Passo guardar o resultado dentro de um obj ResultSet
            ResultSet rs = stmt.executeQuery();
            
            //4º Enqualto tiver resultado guardar no registro da lista
            while (rs.next()) {
               Flor f = new Flor();
               f.setCod_flor(rs.getInt("cod_flor"));
               f.setNome(rs.getString("nome"));
               f.setQtd_flor(rs.getInt("qtd"));
               
                lista.add(f);
            }
            return lista;
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
}
