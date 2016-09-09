/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import JDBC.Conectar;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Teste {
    
    
    public static void main(String[] args) {
        try {
            JOptionPane.showMessageDialog(null,"Testando a conexao");
            Connection con = new Conectar().conecta();
            JOptionPane.showMessageDialog(null,"Conectado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao conectar" +e);
        }
        
    }
}
