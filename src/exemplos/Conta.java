package exemplos;

public class Conta {

    private int numero;
    private String nomeTitular;
    private double saldo;

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;

    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
        public double getSaldo(){
            return this.saldo;
        }
        public int getnumero(){
            return this.numero;
        } 
        
        public String getNomeTitular() {
        return this.nomeTitular;
    }
        public void setNumero(int numero){
            this.numero = numero;
        }
        public void setNomeTitular(String nomeTitular){
            this.nomeTitular = nomeTitular;
        }
    }


