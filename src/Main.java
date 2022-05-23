public class Main {
    public static void main(String[] args) {
        Cliente nome = new Cliente();
        nome.setNome("Isabela");

        Conta cc = new ContaCorrente(nome);
        Conta cp = new ContaPoupanca(nome);

        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();



    }
}
