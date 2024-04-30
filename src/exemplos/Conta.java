
package exemplos;

public class Conta {
    int numero;
    String nomeTitular;
    double saldo;
    void depositar(double valor) {
        this.saldo = this.saldo + valor;
        
    }
    
}
