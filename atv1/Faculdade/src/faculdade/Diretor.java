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
public class Diretor extends Funcionario{
    private String unidade;
    public Diretor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.unidade = unidade;
    }
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }  
    public String getUnidade() {
        return this.unidade;
    }
    @Override
    public double calSalario(){
        return this.getSalario() * 1.75;
    } 
}
