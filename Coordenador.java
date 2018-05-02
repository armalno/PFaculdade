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
public class Coordenador extends Funcionario {
    private String area;
    public Coordenador(String formacao, String nome, String cpf, double salario) {
        super(nome, cpf, salario);    
        this.area = area;
    }
    public void setArea(String area) {
        this.area = area;
    } 
    public String getArea() {
        return area;
    }
    @Override
    public double calSalario(){
        return this.getSalario() * 1.65;
    }
    
}
