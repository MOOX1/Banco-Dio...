

public class inicia {

    public static void main(String[] args) {

       Conta contaCorrente = new ContaCorrente();
       contaCorrente.depositar(100);
       Conta contaPolpanca = new ContaPolpanca();

       contaCorrente.transferir(100, contaPolpanca);


       contaCorrente.imprimirExtrato();
       contaPolpanca.imprimirExtrato();


        
    }
    
}
