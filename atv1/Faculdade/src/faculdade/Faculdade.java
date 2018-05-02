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
public class Faculdade {
    private static double total;
    public static void calculaGasto(Funcionario a){
        total += a.calculaGasto();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario a = new Funcionario("Pocket", "099999999999", 2000.00);
        Professor b = new Professor("quimica","Dejota", "099999999988", 3000.00);
        calculaGasto(a);
        calculaGasto(b);        
    }    
}
