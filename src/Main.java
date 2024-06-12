
public class Main {
    public static void main(String[] args) {
        Cliente ayla = new Cliente();
        ayla.setNome("Ayla");

        Cliente jocimari = new Cliente();
        jocimari.setNome("Jocimari");

        Conta cc = new ContaCorrente(ayla);
        cc.depositar(150);

        Conta poupanca = new ContaPoupanca(jocimari);
        poupanca.depositar(240);

        ((ContaCorrente) cc).imprimirExtrato();
        ((ContaPoupanca) poupanca).imprimirExtrato();
        poupanca.transferir(100, cc);

    }
}
