/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDBC.Conectar;
import JavaBeans.Administrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Lucas
 */
public class AdministradorDAO {
    private final Connection conecta;
    //construtor
    public AdministradorDAO(){
        this.conecta = new Conectar().conecta();
    }
    
    //Cadastrar ADM
    public void CadastrarADM(Administrador adm){
        try {
            // 1º passo Criar a SQL
            String comando = "insert into administrador (login,senha) values(?,?)";
            //2º passo organizar o comando e executa-lo
            PreparedStatement stmt = conecta.prepareStatement(comando);
            
            stmt.setString(1, adm.getLogin());
            stmt.setString(2,adm.getSenha());
            
            //3º Executa comando 
            stmt.execute();
            //4º Fecha conexao
            stmt.close();
            
        } catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
    
    
    //Metodo Login
    public boolean efetuarLogin(String login, String senha){
        
        try {
            //Criar comando SQL
            String sql = "select cod_adm from administrador WHERE login = ? and senha = ?";
            
            //2º passo organizar a sql e executa-la
            PreparedStatement stmt = conecta.prepareStatement(sql);
            
            stmt.setString(1, login);
            stmt.setString(2, senha);
            
            
            //Executar comando
            ResultSet rs = stmt.executeQuery();
            
            //Verificar se foi encontrado um registro
            if(rs.first()){
                //Faz Login
                return true;
            }
            
                
            
        } catch (SQLException erro) {
            
            throw new RuntimeException("Erro ao logar " +erro.getMessage());
        }
           return false;
    }
    
    public boolean listaAdm(){
        try {
            //Criar comando SQL
            String sql = "select * from administrador";
            
            //2º passo organizar a sql e executa-la
            PreparedStatement stmt = conecta.prepareStatement(sql);
            
            
            //Executar comando
            ResultSet rs = stmt.executeQuery();
            
            //Verificar se foi encontrado um registro
            if(rs.first()){
                //Faz Login
                return true;
            }
        } catch (SQLException e) {
            return false;
        }
        return false;
    }
}
