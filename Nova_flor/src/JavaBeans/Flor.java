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
public class Flor {
    private int cod_flor, qtd_flor;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public int getCod_flor() {
        return cod_flor;
    }

    public void setCod_flor(int cod_flor) {
        this.cod_flor = cod_flor;
    }

    public int getQtd_flor() {
        return qtd_flor;
    }

    public void setQtd_flor(int qtd_flor) {
        this.qtd_flor = qtd_flor;
    }
    
    
}
