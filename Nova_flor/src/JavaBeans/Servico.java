/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBeans;

/**
 *
 * @author Lucas
 */
public class Servico {
    private int cod_servico;
    private String tipo_servico;
    private float preco_servico;

    public int getCod_servico() {
        return cod_servico;
    }

    public void setCod_servico(int cod_servico) {
        this.cod_servico = cod_servico;
    }

    public String getTipo_servico() {
        return tipo_servico;
    }

    public void setTipo_servico(String tipo_servico) {
        this.tipo_servico = tipo_servico;
    }

    public float getPreco_servico() {
        return preco_servico;
    }

    public void setPreco_servico(float preco_servico) {
        this.preco_servico = preco_servico;
    }
    
    
}
