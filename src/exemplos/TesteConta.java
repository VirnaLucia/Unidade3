
package exemplos;

public class TesteConta {

    public static void main(String[] args) {
       Conta c = new Conta();
       c.depositar(100);
       c.depositar(50);
        System.out.println("Saldo: " + c.saldo);
    }
    
}
