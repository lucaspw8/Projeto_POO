/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBeans;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Lucas
 */
public class Pedido {
    private static int cod_pedido,cod_cliente,qtd_prod,prod_cod;
    private String endereco;
    private String nomeCli,nomeProd;
    private String data_entrega;
    private String hora_entrega;

    public int getCod_pedido() {
        return cod_pedido;
    }

    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }
    
    
    public static int getProd_cod() {
        return prod_cod;
    }

    public static void setProd_cod(int prod_cod) {
        Pedido.prod_cod = prod_cod;
    }
    
    public void setCod_pedido(int cod_pedido) {
        this.cod_pedido = cod_pedido;
    }

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public int getQtd_prod() {
        return qtd_prod;
    }

    public void setQtd_prod(int qtd_prod) {
        this.qtd_prod = qtd_prod;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getData_entrega() {
        return data_entrega;
    }

    public void setData_entrega(String data_entrega) {
        this.data_entrega = data_entrega;
    }

    public String getHora_entrega() {
        return hora_entrega;
    }

    public void setHora_entrega(String hora_entrega) {
        this.hora_entrega = hora_entrega;
    }

    

    
}
