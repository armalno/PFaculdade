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
import java.util.Scanner;
import java.util.Random;

public class Banco {
        
    public static void main(String[] args){
        // Declarando as variáveis, Scanner e Random
        String nome;
        double inicial;
        Scanner entrada = new Scanner(System.in);
        Random numero = new Random();
        int conta = 1 + numero.nextInt(9999);
    
        //Obtendo os dados iniciais do Cliente
        System.out.println("Novo cliente");
        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();
        
        System.out.print("Digite o seu primeiro deposito: ");
        inicial = entrada.nextDouble();
        
        //Criando a conta de um cliente
        Conta minhaConta = new Conta(nome, conta, inicial);
        minhaConta.iniciar();
    }
    
    
}
