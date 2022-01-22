/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico;

/**
 *
 * @author 20171tiimi0165
 */
public class Professor extends Pessoa{
    private String CPF;

    public Professor(String nome, String telefone, String CPF) {
        super(nome, telefone);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }
    
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    
    
}
