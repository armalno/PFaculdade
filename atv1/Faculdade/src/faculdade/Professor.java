/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculdade;

/**
 *
 * @author user
 */
public class Professor extends Funcionario{
    private String formacao;

    public Professor(String formacao, String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.formacao = formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    public String getFormacao() {
        return formacao;
    }
    @Override
    public double calSalario(){
        return this.getSalario() * 1.6;
    }
}
