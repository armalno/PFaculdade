/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculdade1.pkg1;

/**
 *
 * @author user
 */
public class ContaCorrente extends Conta{
    private double taxa_deposito = 0.10;
    public ContaCorrente(String nome, int conta, double saldo_inicial){
        super(nome, conta, saldo_inicial);
    }
    @Override
    public void extrato(){
        System.out.println("\tEXTRATO");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Número da conta: " + this.getConta());
        System.out.printf("Saldo atual: %.2f\n",taxaPerc(this.getSaldo()) * 2);
        //System.out.println("Saques realizados hoje: " + this.saques + "\n");        
    }     
    @Override
     public void depositar(double valor)
    {
        if(valor <= 0 && valor >= 0.1){
            System.out.println("Para depositar precisa de um valor superior a 0");
        }else{
            this.setSaldo(this.getSaldo() + (valor - taxa_deposito));
            System.out.println("Depositado: " + valor);
            System.out.println("Novo saldo: " + this.getSaldo() + "\n");
        }       
    }
}
