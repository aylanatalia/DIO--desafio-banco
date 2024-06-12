public class Conta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;

    protected static final int AGENCIA_PADRAO = 0001;

    public static int SEQUENCIAL = 1;
    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    protected void infosComuns(){
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Numero: " + this.numero);
        System.out.println("Titular: " + this.cliente);
        System.out.println("Saldo: " + this.saldo);
    }

    public void sacar(double valor){
        saldo -= valor;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
