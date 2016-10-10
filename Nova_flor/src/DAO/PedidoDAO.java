/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDBC.Conectar;
import JavaBeans.Pedido;
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
public class PedidoDAO {
     private final Connection conecta;

    public PedidoDAO() {
        this.conecta = new  Conectar().conecta();
    }
    
    public void CadastrarPedido(Pedido pedi){
        try {
            // 1º passo Criar a SQL
            String comando = "insert into pedido (cod_cliente,produto_cod,end_entrega,data,hora,Qtd_prod) values(?,?,?,?,?,?)";
            //2º passo organizar o comando e executa-lo
            PreparedStatement stmt = conecta.prepareStatement(comando);
            
            stmt.setInt(1,pedi.getCod_cliente());
            stmt.setInt(2,pedi.getProd_cod());
            stmt.setString(3,pedi.getEndereco());
            stmt.setString(4,pedi.getData_entrega());
            stmt.setString(5,pedi.getHora_entrega());
            stmt.setInt(6,pedi.getQtd_prod());
            
            //3º Executa comando 
            stmt.execute();
            //4º Fecha conexao
            stmt.close();
            
        } catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
    
    public List<Pedido> ListarPedido(String data){
        try {
            //1º passo Criar o vetor que vai armazenar os registros do banco
            List<Pedido> lista = new ArrayList<Pedido>();
            //2º Criar SQL
            String sql = "select cli.nome as nomeCli,prod.nome as nomeProd,end_entrega,Qtd_prod as qtd,hora,data from pedido p,produto prod, cliente cli where p.data =? and p.cod_cliente=cli.cod_cliente and p.produto_cod=prod.cod_produto";
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, data);
            //3º Passo guardar o resultado dentro de um obj ResultSet
            ResultSet rs = stmt.executeQuery();
            
            //4º Enqualto tiver resultado guardar no registro da lista
            while (rs.next()) {
                Pedido ped = new Pedido();
                ped.setNomeCli(rs.getString("nomeCli"));
                ped.setNomeProd(rs.getString("nomeProd"));
                ped.setEndereco(rs.getString("end_entrega"));
                ped.setQtd_prod(rs.getInt("qtd"));
                ped.setHora_entrega(rs.getString("hora"));
                ped.setData_entrega(rs.getString("data"));
                
                lista.add(ped);
            }
            return lista;
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
}
