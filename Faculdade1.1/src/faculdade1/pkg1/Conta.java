/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculdade1.pkg1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Conta {
    private String nome;
    private int conta, saques;
    private double saldo;
    Scanner entrada = new Scanner(System.in);
    
    public Conta(String nome, int conta, double saldo_inicial){
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo_inicial;
        //saques=0;        
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    } 
    public void setConta(int conta) {
        this.conta = conta;
    }    
    public int getConta() {
        return this.conta;
    }
    public double getSaldo() {
        return this.saldo;
    }              
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void extrato(){
        System.out.println("\tEXTRATO");
        System.out.println("Nome: " + this.nome);
        System.out.println("Número da conta: " + this.conta);
        System.out.printf("Saldo atual: %.2f\n",taxaPerc(this.saldo));
        //System.out.println("Saques realizados hoje: " + this.saques + "\n");        
    }    
    public void sacar(double valor){
        if(this.saldo >= valor && valor > 0){
            this.saldo -= valor;
            //saques++;
            System.out.println("Sacado: " + valor);
            System.out.println("Novo saldo: " + this.saldo + "\n");
        }else if(valor <= 0){
            System.out.println("Você não pode sacar um valor igual ou menor que 0\n");
        }
        else {
            System.out.println("Saldo insuficiente. Faça um depósito\n");
        }
    }
    
    public void depositar(double valor)
    {
        if(valor <= 0){
            System.out.println("Para depositar precisa de um valor superior a 0");
        }else{
            this.saldo += valor;
            System.out.println("Depositado: " + valor);
            System.out.println("Novo saldo: " + this.saldo + "\n");
        }       
    }
    
    public void iniciar(){
        int opcao;

        do{
            exibeMenu();
            opcao = entrada.nextInt();
            escolheOpcao(opcao);
        }while(opcao!=4);
    }
    
    public void exibeMenu(){
        
        System.out.println("\t Escolha a opção desejada");
        System.out.println("1 - Saldo");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Sair\n");
        System.out.print("Opção: ");
        
    }
    public double taxaPerc(double saldo){
        return this.saldo = this.saldo * 1.2;
    }
    public void escolheOpcao(int opcao){
        double valor;
        
        switch( opcao ){
            case 1:    
                    extrato();
                    break;
            case 2: 
                    //if(saques < 3){
                        System.out.print("Quanto deseja sacar: ");
                        valor = entrada.nextDouble();
                        sacar(valor);
                    //} else{
                        //System.out.println("Limite de saques diários atingidos.\n");
                    //}
                    break;
                    
            case 3:
                    System.out.print("Quanto deseja depositar: ");
                    valor = entrada.nextDouble();
                    depositar(valor);
                    break;
                    
            case 4: 
                    System.out.println("Sistema encerrado.");
                    break;
                    
            default:
                    System.out.println("Opção inválida");
        }
    }
}
