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
import java.sql.SQLException;

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
}
