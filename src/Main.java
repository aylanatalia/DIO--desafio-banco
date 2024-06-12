import java.util.List;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente ayla = new Cliente();
		ayla.setNome("Ayla");
		
		Conta cc = new ContaCorrente(ayla);
		Conta poupanca = new ContaPoupanca(ayla);
        banco.adicionarConta(poupanca);
        banco.adicionarConta(cc);

        
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		((ContaCorrente) cc).imprimirExtrato();
		((ContaPoupanca) poupanca).imprimirExtrato();

        List<Conta> contasBanco = banco.getContasList();
        System.out.println("Contas de banco: ");
        for(Conta conta : contasBanco){
            System.out.println(conta.getNumero() + "-" + conta.getCliente());
        }
    }
}
