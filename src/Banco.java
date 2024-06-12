import java.util.List;
import java.util.ArrayList;

public class Banco {
    private String nome;
    private List<Conta> contasList;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Banco(){
        contasList = new ArrayList<>();
    }

    public void adicionarConta(Conta conta){
        contasList.add(conta);
    }

    public List<Conta> getContasList() {
        return contasList;
    }

    public void setContasList(){
        this.contasList = contasList;
    }

    public void exibirContas(){
        System.out.println("Contas do banco:");
        for (Conta conta : contasList) {
            System.out.println(conta.getNumero() + " - " + conta.getCliente());
        }
    }
    
}
