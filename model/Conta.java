package model;

public class Conta{
    private String titular;
    private int numeroConta;
    private Double saldo;

    public Conta(String titular, int numeroConta, Double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void transferir (String nome, Double transferencia){
        saldo = saldo - transferencia;
        System.out.printf("foi transferido R$%.2f para a conta de %S" ,transferencia ,nome );
    }

    public void depositar(Double deposito){
        saldo = saldo + deposito;
    }

    public void sacar (Double saque){
        saldo = saldo - saque;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    

    
}