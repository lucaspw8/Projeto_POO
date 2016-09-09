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
import java.sql.SQLException;

/**
 *
 * @author Lucas
 */
public class AdministradorDAO {
    private Connection conecta;
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
}
