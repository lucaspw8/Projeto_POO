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
public class Administrador {
    private int Cod_adm;
    private String Login;
    private String Senha;

    public int getCod_adm() {
        return Cod_adm;
    }

    public void setCod_adm(int Cod_adm) {
        this.Cod_adm = Cod_adm;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
    
}
