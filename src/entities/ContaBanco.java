package entities;

import java.util.Scanner;

public class ContaBanco {

    Scanner sc = new Scanner(System.in);
    private int Numero;
    private String Agencia;
    private String Nome;
    private double Saldo;

    public int getNumero() {
        return Numero;
    }
    public String getAgencia() {
        return Agencia;
    }
    public String getNome() {
        return Nome;
    }
    public double getSaldo() {
        return Saldo;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public void setAgencia(String Agencia) {
        this.Agencia = Agencia;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setSaldo(double saldo) {
        this.Saldo = Saldo;
    }

    public void saque(int valor){
        if(valor <= Saldo){
            this.Saldo -= valor;
            System.out.println("Saque realizado com sucesso, Saldo Atual: " + saldo);
        }else{
            System.out.println("Saldo insuficiente para saque, Saldo Atual: " + saldo);
        }
    }

    public void deposito(int valor){
        this.Saldo += valor;
    }


    //bem mesmo que eu não tenha utilizado na parte final do desafio, este toString foi utilizado para fazer alguns testes na hora que eu estava criando o sistema.
    @Override
    public String toString() {
        return 
               "Bem vindo a Agencia Kanki" 
               +"\nNome do Titular: " +   getNome() 
               + "\nAgencia: "  + getAgencia() 
               +"\nNúmero da Conta: "+ getNumero() 
               + "\nSaldo do titular: "+ getSaldo();
    }
    
}
